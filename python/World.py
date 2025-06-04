from PIL import ImageDraw,Image
import numpy as np
from Land import *
from Lake import *
from River import *
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
    
    @classmethod
    def from_intworld(cls,intworld: InterpreterWorld):
        size = point_to_list(intworld.size)
        lands = [Land.from_intland(x) for x in intworld.lands]
        lakes = [Lake.from_intlake(x) for x in intworld.lakes]
        rivers = [River.from_intriver(x) for x in intworld.rivers]
        return cls(lands,size,lakes,rivers)
        
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
    
    def color_phases_positive(self,n: int) -> list[list[int]]:
        a = n//2
        b = n-a
        phases1 = [[255*i//a,255,0] for i in range(a)]
        phases2 = [[255,255-255*i//b,0] for i in range(b+1)]
        return phases1 + phases2
    
    def color_phases_negative(self,n: int) -> list[list[int]]:
        return [[0,255-255*i/n//2,0] for i in range(n+1)]
    
    
    def give_color(self,land: Land,n: int):
        h_pos = self.height_phases_positive(n)
        h_neg = self.height_phases_negative(2)
        c_pos = self.color_phases_positive(n)
        c_neg = self.color_phases_negative(2)
        #print(len(c_neg))
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
        while not np.isnan(self.hmap[self.size[0]//2+int(river_new.current_point[0]),self.size[1]//2+int(river_new.current_point[1])]) and river_new.current_point not in self.all_river_points:
            river_new.river_points.append(river_new.current_point)
            self.pixels[self.size[0]//2+int(river_new.current_point[0]),self.size[1]//2+int(river_new.current_point[1])]=[0,180,255]
            self.all_river_points.append(river_new.current_point)
            river.river_points.append(river_new.current_point)
            # print(river_new.current_point)
            river_new.current_point = self.get_lowest_neighbor(river_new)


    def get_lowest_neighbor(self,river: River):
        min_value = np.inf
        first_value = self.hmap[self.size[0]//2+int(river.current_point[0])][self.size[1]//2+int(river.current_point[1])]
        min_neighbor = river.current_point
        descents = []
        neighbor_choices = []
        for neighbor in river.get_neighbors():
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
        for land in self.lands:
            self.give_color(land,10)
        if self.lakes:
            for lake in self.lakes:
                self.give_color_to_lake(lake)
        if self.rivers:
            for river in self.rivers:
                # print(river.river_points)
                self.give_color_to_river(river)
        arr = self.pixels.astype(np.uint8)
        # pixel_array_rgb = arr.astype(np.uint8)
        print("Kształt tablicy:", arr.shape)
        img_rgb = Image.fromarray(arr, mode='RGB')
        img_rgb.save("obraz_rgb.png")
        img_rgb.show()
'''
points3D = np.array([
[200, 400, 400],
[200, 300, 1000],
[200, 200, -600]
])
points2D = np.array([
    [0, 0],
    [100,500],
    [100, 1000],
    [300, 100],
    [200, -100],
    [0, 0]
])
intpoints2D = [InterpreterPoint(point[0],point[1]) for point in points2D]
heights = [InterpreterHeight(InterpreterPoint(point[0],point[1]),point[2],0) for point in points3D]
points = np.array([
    [0, 0],
    [10,50],
    [10, 100],
    [30, 10],
    [20, -10],
    [0, 0]
])
intpoints = [InterpreterPoint(point[0],point[1]) for point in points]

per = Perimeter.from_intpoint(intpoints)
intlake = InterpreterLake(InterpreterPoint(0,0),intpoints)
lake = Lake.from_intlake(intlake)
intland1 = InterpreterLand(InterpreterPoint(0,0),intpoints2D,heights)
intworld = InterpreterWorld([intland1],InterpreterPoint(2000,2000),[intlake])
draw_image_from_InterpreterWorld(intworld)
'''
def rad(theta):
    return 2*50 + 50*np.sin(5 * theta)
per = Perimeter.from_radial_function(rad)

def two_arg(x,y):
    return 10*math.sin(x/10)+50*math.cos(y/30)+math.sin(x)

l = Land.from_two_argument_function(two_arg,per,[0,0])

river = River([0,0])
# river2 = River([0,20])
# river.simulate_river()
# river.get_lowest_neighbor()
w = World([l],[2000,2000],None,[river])

# print(w.hmap)
#w.draw()
#print(w.get_lowest_neighbor(river))
