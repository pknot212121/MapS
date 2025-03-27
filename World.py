from PIL import ImageDraw,Image
import numpy as np
from Land import Land
from Perimeter import Perimeter
from Pixel import Pixel

class World:
    def __init__(self,lands,size):
        self.lands = lands
        self.size = size
        self.pixels = np.full((size[0],size[1],3),[0,0,255])
        
    def height_phases(self,land,n):
        maks = np.max(land.hmap)
        return [i/n*maks for i in range(n+1)]
    
    def color_phases(self,n):
        a = n//2
        b = n-a
        phases1 = [[255*i//a,255,0] for i in range(a)]
        phases2 = [[255,255-255*i//b,0] for i in range(b+1)]
        return phases1 + phases2
    
    def give_color(self,land,n):
        h = self.height_phases(land,n)
        c = self.color_phases(n)
        x_move = land.start[0]
        y_move = land.start[1]
        for (row,col),value in np.ndenumerate(land.zi):
                for i,y in enumerate(h):
                    if y>=value:
                        self.pixels[row+y_move][col+x_move]=c[i]
                        break
    
    def draw(self):
        arr = self.pixels.astype(np.uint8)
        # pixel_array_rgb = arr.astype(np.uint8)
        print("Kształt tablicy:", arr.shape)
        print(arr)
        img_rgb = Image.fromarray(arr, mode='RGB')
        img_rgb.save("obraz_rgb.png")

points3D = np.array([
    [200, 400, 500],
    [200, 200, 600]
])
points2D = np.array([
    [0, 0],
    [100,500],
    [100, 1000],
    [300, 100],
    [200, -100],
    [0, 0]
])
h1 = Land(points3D,Perimeter(points2D),[1000,100])
h2 = Land(points3D,Perimeter(points2D),[200,200])
w = World([h1,h2],[2000,2000])
print(w.pixels)
w.give_color(h1,10)
w.give_color(h2,10)
w.draw()