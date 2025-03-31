from typing import Generic, TypeVar

T = TypeVar('T')
class InterpreterList(Generic[T]):
    def __init__(self) -> None:
        self.elements: list[T] = []

    def add(self, element: T) -> None:
        self.elements.append(element)

    def remove(self, element: T) -> None:
        if element in self.elements:
            self.elements.remove()

    def list(self) -> list[T]:
        return self.elements

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
    def __init__(self, displacement: InterpreterPoint,  
                 perimeter: InterpreterList[InterpreterPoint], 
                 height: InterpreterList[InterpreterHeight], 
                 perimeterFunc, heightFunc):
        self.displacement = displacement
        self.perimeter = perimeter
        self.height = height
        self.perimeterFunc = perimeterFunc
        self.heightFunc = heightFunc    
    
    def export(self):
        self.perimeter = self.perimeter.list()
        self.height = self.height.list()

class InterpreterWorld:
    def __init__(self, lands : InterpreterLand, size: InterpreterPoint):
        self.lands = lands
        self.size = size

