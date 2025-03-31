# %%




    
class InterpreterPoint:
    def __init__(self, x: float,y: float):
        self.x = x
        self.y = y

class InterpreterHeight:
    def __init__(self, place: InterpreterPoint, z: float, steep: float):
        self.place = place,
        self.z = z,
        self.steep = steep        

class InterpreterLand:
    def __init__(self, displacement: InterpreterPoint,  perimeter: list, height: list, perimeterFunc, heightFunc):
        self.displacement = displacement
        self.perimeter = perimeter
        self.height = height
        self.perimeterFunc = perimeterFunc
        self.heightFunc = heightFunc    

class InterpreterWorld:
    def __init__(self, lands : InterpreterLand, size: InterpreterPoint):
        self.lands = lands
        self.size = size