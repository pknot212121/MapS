import numpy as np
import matplotlib.pyplot as plt
from scipy.interpolate import make_interp_spline
from InterpreterContainers import *

def point_to_list(point: InterpreterPoint) -> list[int]:
    return [point.x,point.y]

class Perimeter:
    def __init__(self,points: np.ndarray):
        self.points = points
        self.x, self.y = self.interpolate_from_points(points)

    @classmethod
    def from_intpoint(cls,intpoints: list[InterpreterPoint]):
        l = [point_to_list(x) for x in intpoints]
        points = np.array(l)
        instance = cls(points)
        return instance

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
        xp,yp = self.points.T
        plt.figure(figsize=(8,8))
        plt.scatter(xp,yp,s=200,c='blue')
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