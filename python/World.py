from PIL import ImageDraw,Image
import numpy as np
from Land import *

def draw_image_from_InterpreterWorld(intworld: InterpreterWorld):
    w = World.from_intworld(intworld)
    w.draw()

class World:
    def __init__(self,lands: list[Land],size: list[int]):
        self.lands = lands
        self.size = size
        self.pixels = np.full((size[0],size[1],3),[0,0,255])
    
    @classmethod
    def from_intworld(cls,intworld: InterpreterWorld):
        size = point_to_list(intworld.size)
        lands = [Land.from_intland(x) for x in intworld.lands]
        return cls(lands,size)
        
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
        h_neg = self.height_phases_negative(n)
        c_pos = self.color_phases_positive(n)
        c_neg = self.color_phases_negative(n)
        x_move = land.start[0]
        y_move = land.start[1]
        land_size_x = land.height_map.shape[1]
        land_size_y = land.height_map.shape[0]
        for (row,col),value in np.ndenumerate(land.height_map):
            if value!=np.nan:
                if value>=0:
                    for i,y in enumerate(h_pos):
                        if y>=value:
                            self.pixels[int(self.size[0]//2-row-y_move+land_size_y//2)][int(col+x_move+self.size[1]//2-land_size_x//2)]=c_pos[i]
                            break
                else:
                    for i,y in enumerate(h_neg):
                        if y<=value:
                            self.pixels[int(self.size[0]//2-row-y_move+land_size_y//2)][int(col+x_move+self.size[1]//2-land_size_x//2)]=c_neg[i]
                            break

    
    def draw(self):
        for land in self.lands:
            self.give_color(land,10)
        arr = self.pixels.astype(np.uint8)
        # pixel_array_rgb = arr.astype(np.uint8)
        print("Kształt tablicy:", arr.shape)
        img_rgb = Image.fromarray(arr, mode='RGB')
        img_rgb.save("obraz_rgb.png")
        img_rgb.show()

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

# intland1 = InterpreterLand(InterpreterPoint(0,0),intpoints2D,heights,"Nic","Nic")
# intworld = InterpreterWorld([intland1],InterpreterPoint(2000,2000))
# draw_image_from_InterpreterWorld(intworld)
