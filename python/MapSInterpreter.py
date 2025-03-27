from antlr4 import *
from MapSLexer import MapSLexer
from MapSParser import MapSParser
from MapSVisitor import MapSVisitor

class MapInterpreter(MapSVisitor):
    def visitListVariableDeclaration(self, ctx):
        print("visitListVariableDeclaration")    

def main():
    input_stream = FileStream("input.map")
    lexer = MapSLexer(input_stream)
    stream = CommonTokenStream(lexer)
    parser = MapSParser(stream)
    tree = parser.program()  # Adjust according to your grammar's start rule

    interpreter = MapInterpreter()
    interpreter.visit(tree)

if __name__ == "__main__":
    main()