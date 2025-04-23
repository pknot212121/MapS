from antlr4.error.ErrorListener import ErrorListener

class ErrorListenerMapS(ErrorListener):
    def __init__(self):
        super(ErrorListenerMapS, self).__init__()
        self.syntax_errors = []

    def syntaxError(self, recognizer, offendingSymbol, line, column, msg, e):
        error_message = f"Syntax error at line {line}, column {column}: {msg}"
        self.syntax_errors.append(error_message)