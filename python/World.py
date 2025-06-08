from PIL import ImageDraw,Image
import numpy as np
from Land import *
from Lake import *
from River import *
from Palette import *
import random

def draw_image_from_InterpreterWorld(intworld: InterpreterWorld):
    w = World.from_intworld(intworld)
    w.draw()

class World:
    def __init__(self,lands: list[Land],size: list[int],lakes: list[Lake] = [],rivers: list[River] = []):
        self.lands = lands
        self.lakes = lakes
        self.size = size
        self.rivers = rivers
        self.pixels = np.full((size[0],size[1],3),[0,0,255])
        self.hmap = np.full((size[0],size[1]),np.nan)
        self.all_river_points = []
        GREEN = (40, 140, 60) 
        GRAY = (180, 180, 180)
        self.palette = generate_palette(GREEN, GRAY)
        self.maks = self.get_max()
        self.mini = self.get_min()
        self.STAMP_VALUE = -np.inf 
    
    @classmethod
    def from_intworld(cls,intworld: InterpreterWorld):
        size = point_to_list(intworld.size)
        lands = [Land.from_intland(x) for x in intworld.lands]
        lakes = [Lake.from_intlake(x) for x in intworld.lakes]
        rivers = [River.from_intriver(x) for x in intworld.rivers]
        return cls(lands,size,lakes,rivers)
    
    def get_max(self) -> float:
        maks=-np.inf
        for land in self.lands:
            M = np.nanmax(land.height_map)
            if M>maks: maks=M
        return maks
    def get_min(self) -> float:
        mini = np.inf
        for land in self.lands:
            m = np.nanmin(land.height_map)
            if m<mini: mini=m
        return mini
        
    def height_phases_positive(self,n: int) -> list[float]:
        maks=-np.inf
        for land in self.lands:
            M = np.nanmax(land.height_map)
            if M>maks: maks=M
        return [i/n*maks for i in range(n+1)]
    
    def height_phases_negative(self,n: int) -> list[float]:
        mini = np.inf
        for land in self.lands:
            m = np.nanmin(land.height_map)
            if m<mini: mini=m
        return [i/n*mini for i in range(n+1)]
    
    def create_grid_in_bbox(self,bbox,size):
        min_x, min_y, max_x, max_y = bbox
        x_coords = np.arange(min_x, max_x, size)
        y_coords = np.arange(min_y, max_y, size)
        xv, yv = np.meshgrid(x_coords, y_coords)
        grid_points = np.stack([xv.ravel(), yv.ravel()], axis=-1)
        return grid_points

    def fill_land_with_squares(self,land: Land, square_size=16):
        map_height, map_width = land.height_map.shape
        bbox = (0, 0, map_width, map_height)
        
        squares = self.create_grid_in_bbox(bbox, square_size)
        if squares.size == 0:
            return np.array([])
            
        bottom_left_corners = (squares + np.array([0, square_size])).astype(int)
        bottom_right_corners = (squares + np.array([square_size, square_size])).astype(int)

        bl_in_bounds = (bottom_left_corners[:, 0] < map_width) & \
                    (bottom_left_corners[:, 0] >= 0) & \
                    (bottom_left_corners[:, 1] < map_height) & \
                    (bottom_left_corners[:, 1] >= 0)

        br_in_bounds = (bottom_right_corners[:, 0] < map_width) & \
                    (bottom_right_corners[:, 0] >= 0) & \
                    (bottom_right_corners[:, 1] < map_height) & \
                    (bottom_right_corners[:, 1] >= 0)
        is_left_on_land = np.zeros(len(squares), dtype=bool)
        is_right_on_land = np.zeros(len(squares), dtype=bool)

        valid_bl_coords = bottom_left_corners[bl_in_bounds]
        valid_br_coords = bottom_right_corners[br_in_bounds]
        linia_wzgorz = (self.maks+self.mini)//3
        linia_gor = 2*(self.maks+self.mini)//3
        if valid_bl_coords.size > 0:
            is_left_on_land[bl_in_bounds] = (land.height_map[valid_bl_coords[:, 1], valid_bl_coords[:, 0]] > linia_gor)
        
        if valid_br_coords.size > 0:
            is_right_on_land[br_in_bounds] = (land.height_map[valid_br_coords[:, 1], valid_br_coords[:, 0]] > linia_gor)
        
        is_inside = is_left_on_land & is_right_on_land
        squares_inside_polygon = squares[is_inside]
        
        return squares_inside_polygon
    
    def color_phases_positive(self,n: int) -> list[list[int]]:
        a = n//2
        b = n-a
        phases1 = [[255*i//a,255,0] for i in range(a)]
        phases2 = [[255,255-255*i//b,0] for i in range(b+1)]
        return phases1 + phases2
    
    def color_phases_negative(self,n: int) -> list[list[int]]:
        return [[0,255-255*i/n//2,0] for i in range(n+1)]
    
    def paste_mountain_stamp_onto_map(self, land: Land, stamp_path="tall3.png",mound_path="mound.png", position=(0, 0), size=16):
        try:
            stamp_img = Image.open(stamp_path).convert('RGBA')
        except FileNotFoundError:
            print(f"Nie znaleziono stempla: {stamp_path}")
            return
        
        stamp_img = stamp_img.resize((size, size), Image.Resampling.NEAREST) # Dodane przeskalowanie stempla!
        stamp_array = np.array(stamp_img)
        
        alpha_channel = stamp_array[:, :, 3]
        rgb_sum = stamp_array[:, :, :3].sum(axis=2)
        mask = (alpha_channel < 128) | (rgb_sum < 50)
        
        map_height, map_width = self.hmap.shape
        center_x, center_y = map_width // 2, map_height // 2
        stamp_final_x = int(land.start[0] + center_x + position[0])
        stamp_final_y = int(land.start[1] + center_y + position[1])
        
        y_start, x_start = stamp_final_y, stamp_final_x
        y_end = min(y_start + size, map_height)
        x_end = min(x_start + size, map_width)

        if y_end <= y_start or x_end <= x_start:
            return
            
        target_slice = self.hmap[y_start:y_end, x_start:x_end]
        
        mask_h, mask_w = target_slice.shape
        trimmed_mask = mask[:mask_h, :mask_w]
        
        self.hmap[y_start:y_end, x_start:x_end][trimmed_mask] = self.STAMP_VALUE

    def paste_land_onto_map(self, land: Land):
        map_height, map_width = self.hmap.shape
        src_h, src_w = land.height_map.shape
        
        center_x, center_y = map_width // 2, map_height // 2
        top_left_x = int(land.start[0] + center_x)
        top_left_y = int(land.start[1] + center_y)

        dest_y_start = max(0, top_left_y)
        dest_x_start = max(0, top_left_x)
        dest_y_end = min(map_height, top_left_y + src_h)
        dest_x_end = min(map_width, top_left_x + src_w)

        src_y_start = max(0, -top_left_y)
        src_x_start = max(0, -top_left_x)
        src_y_end = src_y_start + (dest_y_end - dest_y_start)
        src_x_end = src_x_start + (dest_x_end - dest_x_start)
        
        if (dest_y_end <= dest_y_start) or (dest_x_end <= dest_x_start):
            return
            
        cut_land = land.height_map[int(src_y_start):int(src_y_end), int(src_x_start):int(src_x_end)]
        mask = ~np.isnan(cut_land)
        self.hmap[int(dest_y_start):int(dest_y_end), int(dest_x_start):int(dest_x_end)][mask] = cut_land[mask]
        
    
    def give_color(self,land: Land,n: int):
        h_pos = self.height_phases_positive(n)
        h_neg = self.height_phases_negative(2)
        c_pos = self.color_phases_positive(n)
        c_neg = self.color_phases_negative(2)
        x_move = land.start[0]
        y_move = land.start[1]
        land_size_x = land.height_map.shape[1]
        land_size_y = land.height_map.shape[0]
        for (row,col),value in np.ndenumerate(land.height_map):
            if not np.isnan(value):
                y_index = int(self.size[0]//2-row-y_move+land_size_y//2)
                x_index = int(col+x_move+self.size[1]//2-land_size_x//2)
                if(y_index>0 and y_index<self.size[0] and x_index>0 and x_index<self.size[1]):
                    self.hmap[y_index][x_index]=value
                    if value>=0:
                        for i,y in enumerate(h_pos):
                            if y>=value:
                                self.pixels[y_index][x_index]=c_pos[i]
                                break
                    else:
                        for i,y in enumerate(h_neg):
                            if y<=value:
                                self.pixels[y_index][x_index]=c_neg[i]
                                break
    def scale_down_to_256(self,hmap: np.ndarray):
        nan_mask = np.isnan(hmap)
        stamp_mask = (hmap == self.STAMP_VALUE)
        land_mask = ~nan_mask & ~stamp_mask
        land_values = hmap[land_mask]
        wynik = np.full(hmap.shape, fill_value=255, dtype=np.uint8)
        if land_values.size>0:
            if self.mini == self.maks:
                przeskalowane = np.zeros(land_values.shape)
            else:
                przeskalowane = (land_values - self.mini) / (self.maks - self.mini) * 253
            wynik[stamp_mask] = 254
            wynik[land_mask] = przeskalowane.astype(np.uint8)
            
        return wynik
    
    def give_palette(self):
        for land in self.lands:
            squares = self.fill_land_with_squares(land)
            self.paste_land_onto_map(land)
            for square in squares:
                self.paste_mountain_stamp_onto_map(land=land,position=square)
        hmap_scaled = self.scale_down_to_256(self.hmap)
        map_image = Image.new('P', (self.size[0],self.size[1]))
        map_image.putdata(hmap_scaled.flatten())
        map_image.putpalette(self.palette)
        map_image.save("mapa_wysokosci.png")
            
                

                        
    def give_color_to_lake(self,lake: Lake):
        x_move = lake.start[0]
        y_move = lake.start[1]
        land_size_x = lake.height_map.shape[1]
        land_size_y = lake.height_map.shape[0]
        for (row,col),value in np.ndenumerate(lake.height_map):
            y_index = int(self.size[0]//2-row-y_move+land_size_y//2)
            x_index = int(col+x_move+self.size[1]//2-land_size_x//2)
            if(y_index>0 and y_index<self.size[0] and x_index>0 and x_index<self.size[1]):
                if value==0:
                    self.pixels[int(self.size[0]//2-row-y_move+land_size_y//2)][int(col+x_move+self.size[1]//2-land_size_x//2)] = [0,180,255]
                    self.hmap[int(self.size[0]//2-row-y_move+land_size_y//2)][int(col+x_move+self.size[1]//2-land_size_x//2)] = 0

    def give_color_to_river(self,river: River):
        # self.pixels[river.source[0],river.source[1]]=[0,180,255]
        river_new = river
        while self.is_in_bounds(self.size[0]//2+int(river_new.current_point[0]),self.size[1]//2+int(river_new.current_point[1])) and not np.isnan(self.hmap[self.size[0]//2+int(river_new.current_point[0]),self.size[1]//2+int(river_new.current_point[1])]) and river_new.current_point not in self.all_river_points:
            river_new.river_points.append(river_new.current_point)
            self.pixels[self.size[0]//2+int(river_new.current_point[0]),self.size[1]//2+int(river_new.current_point[1])]=[0,180,255]
            self.all_river_points.append(river_new.current_point)
            river.river_points.append(river_new.current_point)
            # print(river_new.current_point)
            river_new.current_point = self.get_lowest_neighbor(river_new)
    
    def is_in_bounds(self,x,y) -> bool:
        if x>0 and x<self.size[0] and y>0 and y<self.size[1]:
            return True
        return False


    def get_lowest_neighbor(self,river: River):
        min_value = np.inf
        first_value = self.hmap[self.size[0]//2+int(river.current_point[0])][self.size[1]//2+int(river.current_point[1])]
        min_neighbor = river.current_point
        descents = []
        neighbor_choices = []
        for neighbor in river.get_neighbors():
            if(not self.is_in_bounds(self.size[0]//2+int(neighbor[0]),self.size[1]//2+int(neighbor[1]))): return neighbor
            value = self.hmap[self.size[0]//2+int(neighbor[0])][self.size[1]//2+int(neighbor[1])]
            # print(neighbor,value)
            if(np.isnan(value)): return neighbor
            if(value<min_value):
                min_value=value
                min_neighbor = neighbor
            descent = first_value-value
            if(descent>=0 and neighbor not in river.river_points):
                descents.append(descent)
                neighbor_choices.append(neighbor)
        suma = sum(descents)
        probabilities = [x / suma for x in descents]
        # print(probabilities)
        # print(neighbor_choices)
        if(len(neighbor_choices)>0):
            choice = random.choices(neighbor_choices,weights=probabilities,k=1)[0]
            return choice
        else: return min_neighbor
    
    def draw(self):
        self.give_palette()
        # for land in self.lands:
        #     self.fill_land_with_squares(land)
        # for land in self.lands:
        #     self.give_color(land,10)
        # if self.lakes:
        #     for lake in self.lakes:
        #         self.give_color_to_lake(lake)
        # if self.rivers:
        #     for river in self.rivers:
        #         # print(river.river_points)
        #         self.give_color_to_river(river)
        # arr = self.pixels.astype(np.uint8)
        # # pixel_array_rgb = arr.astype(np.uint8)
        # print("Kształt tablicy:", arr.shape)
        # img_rgb = Image.fromarray(arr, mode='RGB')
        # img_rgb.save("obraz_rgb.png")
        # img_rgb.show()

# points3D = np.array([
# [200, 400, 400],
# [200, 300, 1000],
# [200, 200, -600]
# ])
# points2D = np.array([
#     [0, 0],
#     [100,500],
#     [100, 1000],
#     [300, 100],
#     [200, -100],
#     [0, 0]
# ])
# intpoints2D = [InterpreterPoint(point[0],point[1]) for point in points2D]
# heights = [InterpreterHeight(InterpreterPoint(point[0],point[1]),point[2],0) for point in points3D]
# points = np.array([
#     [0, 0],
#     [10,50],
#     [10, 100],
#     [30, 10],
#     [20, -10],
#     [0, 0]
# ])
# intpoints = [InterpreterPoint(point[0],point[1]) for point in points]

# per = Perimeter.from_intpoint(intpoints)
# intlake = InterpreterLake(InterpreterPoint(0,0),intpoints)
# lake = Lake.from_intlake(intlake)
# intland1 = InterpreterLand(InterpreterPoint(0,0),intpoints2D,heights)
# intworld = InterpreterWorld([intland1],InterpreterPoint(2000,2000),[intlake])
# draw_image_from_InterpreterWorld(intworld)

# def rad(theta):
#     return 2*50 + 50*np.sin(5 * theta)
# per = Perimeter.from_radial_function(rad)

# def two_arg(x,y):
#     return 10*math.sin(x/10)+50*math.cos(y/30)+math.sin(x)

# l = Land.from_two_argument_function(two_arg,per,[0,0])

# river = River([0,0])
# # river2 = River([0,20])
# # river.simulate_river()
# # river.get_lowest_neighbor()
# w = World([l],[2000,2000],None,[river])

# w.draw()
# # print(w.hmap)
# #w.draw()
# # #print(w.get_lowest_neighbor(river))
# source_image = Image.open('mountain_tall.png').convert('RGB')
# image_array = np.array(source_image)
# for x in image_array:
#     print(x)
