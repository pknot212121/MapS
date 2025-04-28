import numpy as np
import matplotlib.pyplot as plt
from Perimeter import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class Lake:
    def __init__(self,perimeter: Perimeter):
        pass
    def get_heightmap_from_perimeter(self,perimeter: Perimeter) -> np.ndarray:

        zi = griddata((x,y),z,(xi,yi),method='cubic')
        boundary_points = np.column_stack([perimeter.x, perimeter.y])
        boundary_path = Path(boundary_points)
        mask = boundary_path.contains_points(grid_points).reshape(xi.shape)
        zi[~mask] = np.nan
        return zi