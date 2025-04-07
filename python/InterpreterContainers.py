class InterpreterIdentifier:
    def __init__(self, value, type):
        self.value = value
        self.type = type
    
    def type_(self):
        return self.type

    def get(self):
        return self.value
    
    def sameType(self, other):
        if type(self) != type(other):
            return False        
        return self.type == other.type

class InterpreterList:
    def __init__(self, type, elements):
        self.innerType = type
        self.elements = elements

    def get(self):
        return self.elements
        
    
class InterpreterPoint:
    def __init__(self, x: float,y: float):
        self.x = x
        self.y = y

class InterpreterHeight:
    def __init__(self, place: InterpreterPoint, z: float, steep: float):
        self.place = place
        self.z = z
        self.steep = steep        

class InterpreterLand:
    def __init__(self, displacement: InterpreterPoint=None,  perimeter: list[InterpreterPoint]=None, height: list[InterpreterHeight]=None, perimeterFunc=None, heightFunc=None):
        self.displacement = displacement
        self.perimeter = perimeter
        self.height = height
        self.perimeterFunc = perimeterFunc
        self.heightFunc = heightFunc 

class InterpreterWorld:
    def __init__(self, lands : list[InterpreterLand] = [], size: InterpreterPoint = InterpreterPoint(500,500)):
        self.lands = lands
        self.size = size

    def addLand(self, land: InterpreterLand):
        if land is not None:
            self.lands.append(land)