from PIL import ImageDraw,Image
import numpy as np
from Land import Land
from Perimeter import Perimeter

class World:
    def __init__(self,lands,size):
        self.lands = lands
        self.size = size

    def height_phases(self,n):
        maks = np.max(self.land)
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
        arr = np.copy(self.land.zi).tolist()
        for (row,col), value in np.ndenumerate(arr):
            if value==-1:
                arr[row][col]=[0,0,255]
            else:
                for i,y in enumerate(h):
                    if y>=value:
                        arr[row][col]=c[i]
                        break
        return arr
    def draw(self,n):
        pixel_array_rgb = np.full((self.size[0],self.size[1]),[0,0,255])

        pixel_array_rgb = np.array(self.give_color(n), dtype=np.uint8)
        print("Kształt tablicy:", pixel_array_rgb.shape)
        img_rgb = Image.fromarray(pixel_array_rgb, mode='RGB')
        img_rgb.save("obraz_rgb.png")

points3D = np.array([
    [2, 4, 5],
    [2, 2, 6]
])
points2D = np.array([
    [0, 0],
    [1,5],
    [1, 10],
    [3, 1],
    [2, -1],
    [0, 0]
])
h = Land(points3D,Perimeter(points2D),[100,100])
i = World(h,[1000,1000])
print(i.height_phases(10))
print(i.color_phases(11))
print(i.draw(10))