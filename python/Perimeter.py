import numpy as np
import matplotlib.pyplot as plt
from scipy.interpolate import make_interp_spline
from InterpreterContainers import *

def point_to_list(point: InterpreterPoint) -> list[int]:
    return [point.x,point.y]

class Perimeter:
    def __init__(self,points: np.ndarray):
        if(points.shape[0]<100):
            self.x, self.y = self.interpolate_from_points(points)
        else:
            self.x = points[:,0]
            self.y = points[:,1]

    @classmethod
    def from_intpoint(cls,intpoints: list[InterpreterPoint]):
        l = [point_to_list(x) for x in intpoints]
        points = np.array(l)
        return cls(points)
    
    @classmethod
    def from_radial_function(cls,function):
        theta = np.linspace(0, 2 * np.pi, 100)
        x = function(theta) * np.cos(theta)
        y = function(theta) * np.sin(theta)
        coordinates = np.column_stack((x, y))
        return cls(coordinates)

    def interpolate_from_points(self,points: np.ndarray, degree: int = 2, number_of_points: int = 200) -> tuple[np.ndarray,np.ndarray]:
        x,y = points.T
        t = np.arange(len(x))
        spline_x = make_interp_spline(t,x, k=degree)
        spline_y = make_interp_spline(t,y, k=degree)
        t_fine = np.linspace(min(t), max(t), number_of_points)
        x_fine = spline_x(t_fine)
        y_fine = spline_y(t_fine)
        return x_fine,y_fine
        
    def __str__(self):
        plt.figure(figsize=(8,8))
        plt.plot(self.x, self.y, 'ro', label='krzywa')
        plt.grid(True)
        plt.show()
        return "Perimeter_shown"



# points = np.array([
#     [0, 0],
#     [1,5],
#     [1, 10],
#     [3, 1],
#     [2, -1],
#     [0, 0]
# ])
# intpoints = [InterpreterPoint(point[0],point[1]) for point in points]

# per = Perimeter.from_intpoint(intpoints)
# print(per)

# def rad(theta):
#     return 2 + np.sin(5 * theta)
# per = Perimeter.from_radial_function(rad)
# print(per)