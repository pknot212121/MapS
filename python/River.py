import numpy as np
import matplotlib.pyplot as plt
from Land import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class River:
    def __init__(self, source: list[int]):
        self.source = source
        self.width = 1
        self.meander = 0
        self.search_radius = 10
        self.current_point = source
        self.river_points = []
    def get_neighbors(self):
        x = self.current_point[0]
        y = self.current_point[1]
        neighbors = [[x-1,y-1],[x,y-1],[x+1,y-1],[x+1,y],[x+1,y+1],[x,y+1],[x-1,y+1],[x-1,y]]
        return neighbors

# river = River([100,100])
# print(river.get_lowest_neighbor())