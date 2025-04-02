from PIL import ImageDraw,Image
import numpy as np
from Land import *

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
        
    def height_phases(self,n: int) -> list[float]:
        maks=-1
        for land in self.lands:
            m = np.max(land.height_map)
            if m>maks: maks=m
        return [i/n*maks for i in range(n+1)]
    
    def color_phases(self,n: int) -> list[list[int]]:
        a = n//2
        b = n-a
        phases1 = [[255*i//a,255,0] for i in range(a)]
        phases2 = [[255,255-255*i//b,0] for i in range(b+1)]
        return phases1 + phases2
    
    def give_color(self,land: Land,n: int):
        h = self.height_phases(n)
        c = self.color_phases(n)
        x_move = land.start[0]
        y_move = land.start[1]
        for (row,col),value in np.ndenumerate(land.height_map):
            if value!=-np.inf:
                for i,y in enumerate(h):
                    if y>=value:
                        self.pixels[row+y_move+self.size[0]//2][col+x_move+self.size[1]//2]=c[i]
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
#     [80, 40, 50],
#     [160, 20, 60]
# ])
# points2D = np.array([
#     [-100,-200],
#     [0,-50],
#     [100,-200],
#     [100,200],
#     [0,50],
#     [-100,200],
#     [-100,-200]
# ])
# intpoints2D = [InterpreterPoint(point[0],point[1]) for point in points2D]
# heights = [InterpreterHeight(InterpreterPoint(point[0],point[1]),point[2],0) for point in points3D]

# intland1 = InterpreterLand(InterpreterPoint(100,100),intpoints2D,heights,"Nic","Nic")
# intworld = InterpreterWorld([intland1],InterpreterPoint(2000,2000))
# w = World.from_intworld(intworld)
# w.draw()