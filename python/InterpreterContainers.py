class InterpreterIdentifier:
    def __init__(self, value, type, ctx):
        self.value = value
        self.t = type
        self.ctx = ctx

    
    def type_(self):
        return self.t

    def get(self):
        return self.value
    
    def ctx_(self):
        return self.ctx
        
    # def sameType(self, other):
    #     if type(self) != type(other):
    #         return False        
    #     return self.type == other.type

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

class InterpreterRiver:
    def __init__(self,source: InterpreterPoint):
        self.source = source

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

class InterpreterLake:
    def __init__(self, displacement: InterpreterPoint=None,  perimeter: list[InterpreterPoint]=None,perimeterFunc=None):
        self.displacement = displacement
        self.perimeter = perimeter
        self.perimeterFunc = perimeterFunc 

class InterpreterWorld:
    def __init__(self, lands : list[InterpreterLand] = [], size: InterpreterPoint = InterpreterPoint(500,500),lakes : list[InterpreterLake] = [] ,rivers : list[InterpreterRiver] = []):
        self.lands = lands
        self.size = size
        self.lakes = lakes
        self.rivers = rivers

    def addLand(self, land: InterpreterLand):
        if land is not None:
            self.lands.append(land)
            
    def addLake(self, lake: InterpreterLake):
        if(lake is not None):
            self.lakes.append(lake)
            
    def addRiver(self, river: InterpreterRiver):
        if(river is not None):
            self.rivers.append(river)