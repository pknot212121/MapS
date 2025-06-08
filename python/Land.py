import numpy as np
import matplotlib.pyplot as plt
from Perimeter import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

def heights_to_ndarray(heights: list[InterpreterHeight]) -> np.ndarray:
    li = []
    for height in heights:
        l = point_to_list(height.place)
        l.append(height.z)
        li.append(l)
    return np.array(li)

class Land:
    def __init__(self,points3D: np.ndarray,perimeter: Perimeter,start: list[int],function = None):
        self.start = start
        self.steep = 1
        if(function==None):
            self.height_map , self.boundary_points = self.interpolate_heightmap_from_points(points3D,perimeter)
        else:
            self.height_map , self.boundary_points = self.get_heightmap_from_function(function,perimeter)
    
    @classmethod
    def from_intland(cls,intland: InterpreterLand):
        start = point_to_list(intland.displacement)
        perimeter = Perimeter.from_intpoint(intland.perimeter)
        if intland.heightFunc is None:
            points3D = heights_to_ndarray(intland.height)
            return cls(points3D,perimeter,start)
        return cls(None,perimeter,start,intland.heightFunc)
    
    @classmethod
    def from_two_argument_function(cls,function,perimeter: Perimeter,start: list[int]):
        return cls(np.zeros((3,3)),perimeter,start,function)
        
    def get_heightmap_from_function(self,function,perimeter: Perimeter):
        x = perimeter.x
        y = perimeter.y
        drawn = np.full((int(max(y)-min(y)),int(max(x)-min(x))),np.nan)
        for (row,col),value in np.ndenumerate(drawn):
            drawn[row,col]=function(row,col)
        row_indices, col_indices = np.indices(drawn.shape)
        x_coords_grid = min(x) + col_indices.ravel()
        y_coords_grid = min(y) + row_indices.ravel()
        indices_flat = np.column_stack((x_coords_grid, y_coords_grid))
        boundary_points = np.column_stack([perimeter.x, perimeter.y])
        boundary_path = Path(boundary_points)
        mask = boundary_path.contains_points(indices_flat).reshape(drawn.shape)
        drawn[~mask] = np.nan
        return drawn , boundary_points

    def interpolate_heightmap_from_points(self,points3D: np.ndarray,perimeter: Perimeter) -> np.ndarray:
        x = np.concatenate([points3D[:,0],perimeter.x])
        y = np.concatenate([points3D[:,1],perimeter.y])
        z = np.concatenate([points3D[:,2],np.array([1]*len(perimeter.x))])
        xi = np.linspace(min(x),max(x),int(max(x)-min(x))+1)
        yi = np.linspace(min(y),max(y),int(max(y)-min(y))+1)
        xi,yi = np.meshgrid(xi,yi)
        zi = griddata((x,y),z,(xi,yi),method='linear')
        boundary_points = np.column_stack([perimeter.x, perimeter.y])
        boundary_path = Path(boundary_points)
        grid_points = np.column_stack([xi.flatten(), yi.flatten()]).reshape(-1, 2)
        mask = boundary_path.contains_points(grid_points).reshape(xi.shape)
        zi[~mask] = np.nan
        return zi , grid_points

    def __str__(self):
        plt.figure(figsize=(10,6))
        plt.imshow(
            self.height_map,
            origin='lower',
            cmap='viridis',
            aspect='auto'
        )
        plt.colorbar(label = 'Wartosc z')
        plt.show()
        return "Land_shown"
    

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

# intland = InterpreterLand(InterpreterPoint(100,100),intpoints2D,heights,"Nic","Nic")
# l = Land.from_intland(intland)
# print(l)
# l = Land(np.array([[0,0,200]]),per,[0,0])
# print(l)


# print(l)