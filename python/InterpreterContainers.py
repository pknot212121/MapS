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
    def __init__(self,points: list[InterpreterPoint]):
        self.points = points

class InterpreterHeight:
    def __init__(self, place: InterpreterPoint, z: float, steep: float):
        self.place = place
        self.z = z
        self.steep = steep        

class InterpreterLand:
    def __init__(self, displacement: InterpreterPoint=None,  perimeter: list[InterpreterPoint]=None, height: list[InterpreterHeight]=None, perimeterFunc=None, heightFunc=None, perimeterShape=None):
        self.displacement = displacement
        self.perimeter = perimeter
        self.height = height
        self.perimeterFunc = perimeterFunc
        self.heightFunc = heightFunc

class InterpreterLake:
    def __init__(self, displacement: InterpreterPoint=None,  perimeter: list[InterpreterPoint]=None,perimeterFunc=None,perimeterShape=None):
        self.displacement = displacement
        self.perimeter = perimeter
        self.perimeterFunc = perimeterFunc
    
class InterpreterSquare:
    def __init__(self, size: int, rotation: int):
        self.size = size
        self.rotation = rotation

class InterpreterCircle:
    def __init__(self,size: int):
        self.size = size

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

class InterpreterFunction:
    def __init__(self, params, return_type, body_ctx, ctx):
        self.params = params
        self.return_type = return_type
        self.body = body_ctx
        self.ctx = ctx

class ScopeFrame:
    def __init__(self, variables: dict, function_scope: int):
        self.variables = variables
        self.function_scope = function_scope
        
