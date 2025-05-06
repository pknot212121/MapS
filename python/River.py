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