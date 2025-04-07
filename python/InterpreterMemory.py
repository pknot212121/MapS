from InterpreterContainers import *

class InterpreterMemory():
    def __init__(self):
        self.identfierDict = {}
        self.intereterWorld = InterpreterWorld()

    def accessId(self, identifier, idType = None):
        idvalue = self.identfierDict.get(identifier)
        if idvalue is not None:
            if type(idvalue) == InterpreterIdentifier and ( idType is None or idvalue.type_() == idType ):
                return idvalue.get()
        return None
    
    def storeId(self, identifier, value, idType = None):
        if idType is None:
            idValue = InterpreterIdentifier(value, type(value))
        else:
            idValue = InterpreterIdentifier(value, type)
        self.identfierDict[identifier] = idValue

    def world(self):
        return self.intereterWorld