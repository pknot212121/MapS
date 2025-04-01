from PIL import ImageDraw,Image
import numpy as np
from Land import *

class World:
    def __init__(self,lands: list,size: list):
        self.lands = lands
        self.size = size
        self.pixels = np.full((size[0],size[1],3),[0,0,255])
    def __init__(self,intlands: list):
        lands = []
        self.size = [2000,2000]
        for intland in intlands:
            converted = Land()
            lands.append()
    def height_phases(self,n):
        maks=-1
        for land in self.lands:
            m = np.max(land.hmap)
            if m>maks: maks=m
        return [i/n*maks for i in range(n+1)]
    
    def color_phases(self,n):
        a = n//2
        b = n-a
        phases1 = [[255*i//a,255,0] for i in range(a)]
        phases2 = [[255,255-255*i//b,0] for i in range(b+1)]
        return phases1 + phases2
    
    def give_color(self,land,n):
        h = self.height_phases(n)
        c = self.color_phases(n)
        x_move = land.start[0]
        y_move = land.start[1]
        for (row,col),value in np.ndenumerate(land.zi):
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

points3D = np.array([
    [80, 40, 50],
    [160, 20, 60]
])
points2D = np.array([
    [-100,-200],
    [0,-50],
    [100,-200],
    [100,200],
    [0,50],
    [-100,200],
    [-100,-200]
])
h1 = Land(points3D,Perimeter(points2D),[0,0])
h2 = Land(points3D,Perimeter(points2D),[300,300])
w = World([h1,h2],[2000,2000])
w.draw()
# print(h1)