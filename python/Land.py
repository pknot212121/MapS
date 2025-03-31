import numpy as np
import matplotlib.pyplot as plt
from Perimeter import Perimeter
from scipy.interpolate import griddata
from matplotlib.path import Path

class Land:
    def __init__(self,points3D,per,start):
        x = np.concatenate([points3D[:,0],per.x_new])
        y = np.concatenate([points3D[:,1],per.y_new])
        z = np.concatenate([points3D[:,2],np.array([1]*len(per.x_new))])
        xi = np.linspace(min(x),max(x),int(max(x)-min(x))+1)
        yi = np.linspace(min(y),max(y),int(max(y)-min(y))+1)
        xi,yi = np.meshgrid(xi,yi)
        zi = griddata((x,y),z,(xi,yi),method='cubic')
        boundary_points = np.column_stack([per.x_new, per.y_new])
        boundary_path = Path(boundary_points)
        grid_points = np.column_stack([xi.flatten(), yi.flatten()]).reshape(-1, 2)
        mask = boundary_path.contains_points(grid_points).reshape(xi.shape)
        zi[~mask] = np.nan
        self.perimeter = per
        self.x = x
        self.y = y
        self.z = z
        self.zi = zi
        self.start = start
        self.hmap = np.nan_to_num(zi,nan=-1)
        print("Wielkosc: ",zi.shape)
    def __init__(self,intland):
        

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
        print(self.zi)
        return "Działa"
# points3D = np.array([
# [200, 400, 500],
# [200, 200, 600]
# ])
# points2D = np.array([
#     [0, 0],
#     [100,500],
#     [100, 1000],
#     [300, 100],
#     [200, -100],
#     [0, 0]
# ])

# l = Land(points3D,Perimeter(points2D),[100,100])
# print(l.to_list())