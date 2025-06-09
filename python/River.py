import numpy as np
import matplotlib.pyplot as plt
from Land import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class River:
    def __init__(self, river_points = list):
        self.river_points = river_points
        self.x, self.y = self.interpolate_from_points()
    @classmethod
    def from_intriver(cls,intriver: InterpreterRiver):
        l = [point_to_list(x) for x in intriver.points.get()]
        print(len(l))
        return cls(l)
    def interpolate_from_points(self,degree=2,number_of_points = 100):
        x,y = np.array(self.river_points).T
        t = np.arange(len(x))
        spline_x = make_interp_spline(t,x, k=degree)
        spline_y = make_interp_spline(t,y, k=degree)
        t_fine = np.linspace(min(t), max(t), number_of_points)
        x_fine = spline_x(t_fine)
        y_fine = spline_y(t_fine)
        return x_fine,y_fine
    


    def get_neighbors(self):
        x = self.current_point[0]
        y = self.current_point[1]
        neighbors = [[x-1,y-1],[x,y-1],[x+1,y-1],[x+1,y],[x+1,y+1],[x,y+1],[x-1,y+1],[x-1,y]]
        return neighbors

# river = River([100,100])
# print(river.get_lowest_neighbor())