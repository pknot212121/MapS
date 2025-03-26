import numpy as np
import matplotlib.pyplot as plt
from Perimeter import Perimeter

class Height:
    def __init__(self,points3D,points2D=None):
        
        x = points3D[:,0]
        y = points3D[:,1]
        z = points3D[:,2]
        xi = np.linspace(min(x),max(x),100)
        yi = np.linspace(min(y),max(y),100)
        xi,yi = np.meshgrid(xi,yi)

        zi = griddata((x,y),z,(xi,yi),method='cubic')

        self.x = x
        self.y = y
        self.z = z
        self.zi = zi

    def __str__(self):
        plt.figure(figsize=(10,6))
        plt.imshow(
            self.zi,
            extent=[min(self.x), max(self.x), min(self.y), max(self.y)],
            origin='lower',
            cmap='viridis',
            aspect='auto'
        )
        plt.colorbar(label = 'Wartosc z')
        plt.scatter(self.x,self.y,c='red',s=50,edgecolors='black',label='Punkty wejściowe')
        plt.show()
        return "Działa"

points = np.array([
    [0, 0, 1],
    [1, 2, 3],
    [3, 1, 2],
    [2, 4, 5],
    [5, 5, 4],
    [1, 7, 1]
])
h = Height(points)
print(h)