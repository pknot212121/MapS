import numpy as np
import matplotlib.pyplot as plt
from Land import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class River:
    def __init__(self,land: Land, source: list[int]):
        self.land = land
        self.source = source
        self.width = 1
        self.meander = 0
        self.search_radius = 10
        self.river_points = []

    def simulate_river(self):
        x = self.source[0]
        y = self.source[1]
        while(np.any(self.land.height_map[self.get_lowest_point_nearby([x,y])]) != np.nan):
            for i in range(20):
                self.river_points.append([x,y])
                x,y = self.get_lowest_point_nearby([x,y])

    def get_lowest_point_nearby(self,point):
        x = point[0]
        y = point[1]
        lowest_point = None
        lowest_height = np.inf
        neighbors = [[x-1,y-1],[x,y-1],[x+1,y-1],[x+1,y],[x+1,y+1],[x,y+1],[x-1,y+1],[x-1,y]]
        for neighbor in neighbors:
            if(self.land.height_map[neighbor]<lowest_height):
                lowest_point = neighbor
                lowest_height = self.land.height_map[neighbor]
        return lowest_point[0],lowest_point[1]