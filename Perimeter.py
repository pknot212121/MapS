import numpy as np
import matplotlib.pyplot as plt
from scipy.interpolate import splprep, splev

class Perimeter:
    # Argument to np.array
    def __init__(self,points):
        x,y=points.T
        self.x =x
        self.y=y
        tck, u = splprep([x,y], s=0, per=True)
        u_new = np.linspace(0,1,1000)
        x_new, y_new = splev(u_new, tck)
        self.x_new = x_new
        self.y_new = y_new
        self.line = None
    
    def __str__(self):
        plt.plot(self.x, self.y, 'ro', label='Punkty wejściowe')
        plt.plot(self.x_new, self.y_new, 'b-', label='Krzywa domknięta')
        plt.grid(True)
        plt.show()



points = np.array([
    [0, 0],
    [1,5],
    [1, 10],
    [3, 1],
    [2, -1],
    [0, 0]
])

per = Perimeter(points)
print(per)