import numpy as np
import matplotlib.pyplot as plt
from Perimeter import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class Lake:
    def __init__(self,perimeter: Perimeter,start: list[int] = [0,0]):
        self.perimeter = perimeter
        self.start = start
        self.height_map = self.get_heightmap_from_perimeter(perimeter)

    def get_heightmap_from_perimeter(self,perimeter: Perimeter) -> np.ndarray:
        x = perimeter.x
        y = perimeter.y
        lake_canvas = np.full((int(max(y)-min(y)),int(max(x)-min(x))),np.nan)
        row_indices, col_indices = np.indices(lake_canvas.shape)
        x_coords_grid = min(x) + col_indices.ravel()
        y_coords_grid = min(y) + row_indices.ravel()
        indices_flat = np.column_stack((x_coords_grid, y_coords_grid))
        boundary_points = np.column_stack([perimeter.x, perimeter.y])
        boundary_path = Path(boundary_points)
        mask = boundary_path.contains_points(indices_flat).reshape(lake_canvas.shape)
        lake_canvas[mask] = 0
        print(lake_canvas)
        return lake_canvas
    
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
lake = Lake(per)
lake.get_heightmap_from_perimeter(per)
print(lake)