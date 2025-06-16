import numpy as np
import matplotlib.pyplot as plt
from Land import *
from scipy.interpolate import griddata
from matplotlib.path import Path
import math

class River:
    def __init__(self, river_points : list, source = None, direction = None,length=100):
        self.river_points = river_points
        self.source = source
        self.direction = direction
        if river_points is not None:
            self.x, self.y = self.interpolate_from_points()
        else:
            if direction=="north":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=270,river_length=length)
            elif direction=="south":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=90,river_length=length)
            elif direction=="east":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=0,river_length=length)
            elif direction=="west":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=180,river_length=length)
            elif direction=="south-west":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=135,river_length=length)
            elif direction=="north-west":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=225,river_length=length)
            elif direction=="north-east":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=315,river_length=length)
            elif direction=="south-east":
                self.x, self.y = self.generate_river_sine_wave(start_point=point_to_list(source),main_direction_angle=45,river_length=length)
            
    @classmethod
    def from_intriver(cls,intriver: InterpreterRiver):
        if intriver.points is not None:
            l = [point_to_list(x) for x in intriver.points.get()]
            # print(len(l))
            return cls(l)
        else:
            return cls(None,intriver.source,intriver.direction,intriver.length)
    def interpolate_from_points(self,degree=2,number_of_points = 100):
        x,y = np.array(self.river_points).T
        t = np.arange(len(x))
        spline_x = make_interp_spline(t,x, k=degree)
        spline_y = make_interp_spline(t,y, k=degree)
        t_fine = np.linspace(min(t), max(t), number_of_points)
        x_fine = spline_x(t_fine)
        y_fine = spline_y(t_fine)
        return x_fine,y_fine
    
    def angle_to_vector(self,angle_degrees):
        angle_radians = math.radians(angle_degrees)
        return (math.cos(angle_radians), math.sin(angle_radians))
    
    def generate_river_sine_wave(self,
        start_point=(0, 0),
        main_direction_angle=0,  # Kąt w stopniach (0 = wschód, 90 = północ)
        river_length=100,
        avg_segment_length=5,
        base_wave_amplitude=7,
        amplitude_variance=5,    # Jak bardzo amplituda może się różnić od bazowej
        base_wave_frequency=0.1, # Mniejsza wartość = dłuższe fale (wpływa na przyrost kąta fali)
        frequency_variance=0.02, # Jak bardzo częstotliwość może się różnić
        random_drift_strength=2  # Siła dodatkowego losowego "dryfu"
    ):
        river_points = [start_point]
        current_point = start_point
        
        main_dir_vector = self.angle_to_vector(main_direction_angle)
        perp_dir_vector = (-main_dir_vector[1], main_dir_vector[0]) 
        
        current_wave_angle = 0.0
        cumulative_length = 0.0
        iksy =[]
        igreki = []
        while cumulative_length < river_length:
            segment_length = random.uniform(
                avg_segment_length * 0.8, avg_segment_length * 1.2
            )
            
            current_amplitude = random.uniform(
                base_wave_amplitude - amplitude_variance,
                base_wave_amplitude + amplitude_variance
            )
            current_amplitude = max(0, current_amplitude) 

            current_frequency_factor = random.uniform(
                base_wave_frequency - frequency_variance,
                base_wave_frequency + frequency_variance
            )
            current_frequency_factor = max(0.001, current_frequency_factor)
            wave_displacement_scalar = math.sin(current_wave_angle) * current_amplitude
            
            main_displacement_x = main_dir_vector[0] * segment_length
            main_displacement_y = main_dir_vector[1] * segment_length
            
            wave_displacement_x = perp_dir_vector[0] * wave_displacement_scalar
            wave_displacement_y = perp_dir_vector[1] * wave_displacement_scalar
            
            drift_x = random.uniform(-random_drift_strength, random_drift_strength)
            drift_y = random.uniform(-random_drift_strength, random_drift_strength)
            
            new_x = current_point[0] + main_displacement_x + wave_displacement_x + drift_x
            new_y = current_point[1] + main_displacement_y + wave_displacement_y + drift_y
            iksy.append(new_x)
            igreki.append(new_y)
            new_point = (new_x, new_y)
            
            river_points.append(new_point)
            current_point = new_point
            
            current_wave_angle += current_frequency_factor * segment_length 
            
            cumulative_length += segment_length
            
        return np.array(iksy),np.array(igreki)

    def get_neighbors(self):
        x = self.current_point[0]
        y = self.current_point[1]
        neighbors = [[x-1,y-1],[x,y-1],[x+1,y-1],[x+1,y],[x+1,y+1],[x,y+1],[x-1,y+1],[x-1,y]]
        return neighbors
    
    
# r = River([[2,5],[4,6],[10,10]])
# river1_points = r.generate_river_sine_wave(
#     start_point=(50, 250),
#     main_direction_angle=20,  # Lekko w górę i w prawo
#     river_length=800,
#     avg_segment_length=15,
#     base_wave_amplitude=40,
#     amplitude_variance=15,
#     base_wave_frequency=0.04, # Mniejsza wartość = dłuższe fale
#     frequency_variance=0.01,
#     random_drift_strength=3
# )

# river2_points = r.generate_river_sine_wave(
#     start_point=(50, 100),
#     main_direction_angle=-10, # Lekko w dół i w prawo
#     river_length=600,
#     avg_segment_length=10,
#     base_wave_amplitude=15,
#     amplitude_variance=5,
#     base_wave_frequency=0.1, # Większa wartość = krótsze, gęstsze fale
#     frequency_variance=0.03,
#     random_drift_strength=1
# )

# # Wizualizacja rzeki
# plt.figure(figsize=(12, 8))

# # Rzeka 1
# x_coords1, y_coords1 = zip(*river1_points) # Rozpakowanie listy krotek na osobne listy x i y
# plt.plot(x_coords1, y_coords1, label="Rzeka 1 (dłuższe fale)", color="blue", linewidth=2)
# plt.scatter([river1_points[0][0]], [river1_points[0][1]], color="green", s=50, zorder=5, label="Start Rzeki 1") # Zaznacz start

# # Rzeka 2
# x_coords2, y_coords2 = zip(*river2_points)
# plt.plot(x_coords2, y_coords2, label="Rzeka 2 (krótsze fale)", color="cyan", linewidth=1.5)
# plt.scatter([river2_points[0][0]], [river2_points[0][1]], color="lime", s=50, zorder=5, label="Start Rzeki 2")

# plt.title("Wygenerowane Rzeki (Metoda Sinusoidalna)")
# plt.xlabel("X")
# plt.ylabel("Y")
# plt.legend()
# plt.grid(True)
# plt.axis('equal') # Aby osie miały tę samą skalę, co daje lepsze poczucie proporcji
# plt.show()

# river = River([100,100])
# print(river.get_lowest_neighbor())