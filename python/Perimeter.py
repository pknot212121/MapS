import numpy as np
import matplotlib.pyplot as plt
from scipy.interpolate import make_interp_spline
from InterpreterContainers import *
from typing import Callable, List, Union, Any
import random

def point_to_list(point: InterpreterPoint) -> list[int]:
    return [point.x,point.y]

class Perimeter:
    def __init__(self,points: np.ndarray,origin: str="points"):
        if(origin=="points"):
            self.x, self.y = self.interpolate_from_points(points)
            self.points = points
        elif(origin=="square"):
            self.x, self.y = self.interpolate_from_points(points,degree=1)
            self.points =points
        else:
            self.points = points
            self.x = points[:,0]
            self.y = points[:,1]

    @classmethod
    def from_intpoint(cls,intpoints: list[InterpreterPoint]):
        l = [point_to_list(x) for x in intpoints]
        points = np.array(l)
        return cls(points,"points")
    
    @classmethod
    def from_radial_function(cls,function: Callable[[float],float]):
        theta = np.linspace(0, 2 * np.pi, 100)
        x = function(theta) * np.cos(theta)
        y = function(theta) * np.sin(theta)
        coordinates = np.column_stack((x, y))
        return cls(coordinates,"function")
    
    @classmethod
    def from_intsquare(cls, square: InterpreterSquare):
        p1 = cls.rotate([-square.size//2,-square.size//2],square.rotation)
        p2 = cls.rotate([-square.size//2,square.size//2],square.rotation)
        p3 = cls.rotate([square.size//2,square.size//2],square.rotation)
        p4 = cls.rotate([square.size//2,-square.size//2],square.rotation)
        points = np.array([p1,p2,p3,p4,p1])
        return cls(points,"square")
    
    @classmethod
    def from_intcircle(cls, circle: InterpreterCircle):
        theta = np.linspace(0, 2 * np.pi, 100)
        x = circle.size * np.cos(theta)
        y = circle.size * np.sin(theta)
        coordinates = np.column_stack((x, y))
        return cls(coordinates,"circle")
        
    def rotate(point,rotation):
        x = point[0]*np.cos(rotation/np.pi*180)-point[1]*np.sin(rotation/np.pi*180)
        y = point[0]*np.sin(rotation/np.pi*180)+point[1]*np.cos(rotation/np.pi*180)
        return [x,y]
    
    @classmethod
    def from_random_land(cls,size,change,seed = None):
        if seed is not None:
            rng = np.random.default_rng(seed)
        else:
            rng = np.random.default_rng()
        theta = np.linspace(0, 2 * np.pi, 10)
        x = size * np.cos(theta)
        y = size * np.sin(theta)
        coordinates = np.column_stack((x, y))
        first_and_last = 1
        for i,x in enumerate(coordinates):
            if(i==0):
                first_and_last = rng.uniform(1-change, 1+change)
                coordinates[i]=np.array([x[0]*first_and_last,x[1]*first_and_last])
            elif(i==9):
                coordinates[i]=np.array([x[0]*first_and_last,x[1]*first_and_last])
            else:
                rand = rng.uniform(1-change, 1+change)
                coordinates[i]=np.array([x[0]*rand,x[1]*rand])
        return cls(coordinates,"randomland")
        
        
    def interpolate_from_points(self,points: np.ndarray, degree: int = 2, number_of_points: int = 200) -> tuple[np.ndarray,np.ndarray]:
        x,y = points.T
        t = np.arange(len(x))
        spline_x = make_interp_spline(t,x, k=degree)
        spline_y = make_interp_spline(t,y, k=degree)
        t_fine = np.linspace(min(t), max(t), number_of_points)
        x_fine = spline_x(t_fine)
        y_fine = spline_y(t_fine)
        return x_fine,y_fine
    
    def to_intpoints(self) -> List[InterpreterPoint]:
        #print(self.x.shape)
        #print(self.y.shape)
        intpoints = []
        points = np.column_stack((self.x, self.y))
        for x in points:
            intpoints.append(InterpreterPoint(x[0],x[1]))
        return intpoints
        
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
# square = InterpreterSquare(100,30)
# per = Perimeter.from_intsquare(square)
# per.to_intpoints()
# print(per)
# def rad(theta):
#     return 2*50 + 50*np.sin(5 * theta)
# per = Perimeter.from_radial_function(rad)
# print(per)