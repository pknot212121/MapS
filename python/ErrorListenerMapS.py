from antlr4.error.ErrorListener import ErrorListener
from antlr4 import ParserRuleContext

class ErrorListenerMapS(ErrorListener):
    def __init__(self):
        super(ErrorListenerMapS, self).__init__()
        self.syntax_errors = []
        self.interpreter_errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        error_message = f"Syntax error at line {line}, column {column}: {msg}"
        self.syntax_errors.append(error_message)

    def interpreterError(self, msg, ctx: ParserRuleContext):        
        line = None
        col = None
        if ctx is not None and ctx.start is not None:
            line = ctx.start.line
        if ctx is not None and ctx.start is not None:
            col = ctx.start.column        
        error_message = f"Error at line {line}, column: {col}: {msg}"
        self.interpreter_errors.append(error_message)