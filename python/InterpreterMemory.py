from InterpreterContainers import *
from ErrorListenerMapS import ErrorListenerMapS
from antlr4 import ParserRuleContext

class InterpreterMemory():
    def __init__(self, errorListener_: ErrorListenerMapS):
        self.functions = {} 
        self.identfierDict = {}
        self.scopes = [ScopeFrame({}, function_scope=0)]
        self.intereterWorld = InterpreterWorld()
        self.error_listener = errorListener_

    def currentScope(self):
        return self.scopes[-1]

    def pushScope(self, is_function_scope=False):
        function_scope = self.currentScope().function_scope
        if is_function_scope:
            self.scopes.append(ScopeFrame({}, function_scope+1))
        else:
            self.scopes.append(ScopeFrame({}, function_scope))

    def popScope(self):
        if len(self.scopes) > 1:
            self.scopes.pop()
        else:
            self.error_listener.interpreterError("This should be impossible.", None)

    # Aby dostać zmienną podajemy ctx, identifier, opcjonlanie: typ zmiennej
    def accessId(self,ctx: ParserRuleContext, identifier, idType = None, levels_up: int = 0):
        count = 0
        function_scope = self.currentScope().function_scope
        for frame in reversed(self.scopes):
            scope = frame.variables
            if frame.function_scope == function_scope or frame.function_scope == 0:
                if identifier in scope:
                    idvalue = scope[identifier]
                    if type(idvalue) == InterpreterIdentifier and ( idType is None or idvalue.type_() == idType ):
                        if count >= levels_up:
                            return idvalue.get()
                count += 1

        if levels_up == 0:
            self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)
        else:
            self.error_listener.interpreterError(f"No variable named '{identifier}' found {levels_up} scope level(s) up.", ctx)
        return None

    
    # Aby przechować zmienną podajemy ctx, identifier, wartość, opcjonlanie: typ zmiennej
    def storeId(self, ctx: ParserRuleContext, identifier, value, idType = None): 
        current = self.currentScope().variables
        if identifier in current:
            line = current[identifier].ctx_().start.line
            self.error_listener.interpreterError(f"Variable with name: {identifier} already defined.\n"
                                                 + f"Previous definition of {identifier} at line {line}.", ctx)
            return None

        if idType != type(value):
            if type(value) is int and idType is float:
                value = float(value)
            elif hasattr(value, "innerType") and idType[0]==type([]) and idType[1] == value.innerType:
                pass
            else:
                self.error_listener.interpreterError(f"Value of type {type(value).__name__}, cannot be assigned to variable {identifier} of type {idType.__name__}.", ctx)
                return None

        if idType is None:
            idValue = InterpreterIdentifier(value, type(value), ctx)
        else:
            idValue = InterpreterIdentifier(value, idType, ctx)
        current[identifier] = idValue

    def releaseId(self, ctx: ParserRuleContext, identifier):
        for scope in reversed(self.scopes):
            if identifier in scope.variables:
                scope.variables.pop(identifier)
                return
        self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)


    def assignValue(self, ctx: ParserRuleContext, identifier, value):
        function_scope = self.currentScope().function_scope
        for scope in reversed(self.scopes):
            if scope.function_scope < function_scope:
                break
            if identifier in scope.variables:
                idObject = scope.variables[identifier]
                if idObject.type_() != type(value):
                    if type(value) is int and idObject.type_() is float:
                        value = float(value)
                    else:
                        self.error_listener.interpreterError(f"Value of type {type(value)}, cannot be assigned to a variable {identifier} of type {idObject.type_()}.", ctx)
                        return None
                idObject.value = value
                return
        self.error_listener.interpreterError(f"No variable named: {identifier}.", ctx)    

    def world(self):
        return self.intereterWorld