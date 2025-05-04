from InterpreterContainers import *
from ErrorListenerMapS import ErrorListenerMapS
from antlr4 import ParserRuleContext

class InterpreterMemory():
    def __init__(self, errorListener_: ErrorListenerMapS):
        self.identfierDict = {}
        self.intereterWorld = InterpreterWorld()
        self.error_listener = errorListener_

    # Aby dostać zmienną podajemy ctx, identifier, opcjonlanie: typ zmiennej
    def accessId(self,ctx: ParserRuleContext, identifier, idType = None):
        if (identifier not in self.identfierDict):
            self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)
            return None

        idvalue = self.identfierDict.get(identifier)
        if idvalue is not None:
            if type(idvalue) == InterpreterIdentifier and ( idType is None or idvalue.type_() == idType ):
                return idvalue.get()
        return None
    
    # Aby przechować zmienną podajemy ctx, identifier, wartość, opcjonlanie: typ zmiennej
    def storeId(self, ctx: ParserRuleContext, identifier, value, idType = None):        
        if (identifier in self.identfierDict):
            self.error_listener.interpreterError(f"varible with name: {identifier} already defined.", ctx)
            return None        

        if idType is None:
            idValue = InterpreterIdentifier(value, type(value))
        else:
            idValue = InterpreterIdentifier(value, idType)
        self.identfierDict[identifier] = idValue

    def releaseId(self, ctx: ParserRuleContext, identifier):
        if (identifier not in self.identfierDict):
            self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)
            return None
        self.identfierDict.pop(identifier)

    def assignValue(self, ctx: ParserRuleContext, identifier, value):
        if (identifier not in self.identfierDict):
            self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)
            return None        
        idObject = self.identfierDict[identifier]
        if idObject.type_() != type(value):
            self.error_listener.interpreterError(f"Value of type {type(value)}, cannot be assigned for a variable {identifier} of type {idObject.type()}.", ctx)
            return None        
        idObject.value = value        

    def world(self):
        return self.intereterWorld