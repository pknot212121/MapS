grammar MapS;

// Parser rules
program: progStatement* EOF;

progStatement
    : functionDeclaration
    | statement
    ;

statement
    : variableDeclaration
    | ifStatement
    | blockStatement
    | loopStatement
    | assignment
    | expression ';'
    | returnStatement
    | printStatement
    ;

printStatement
    : 'print(' expression ')' ';'
    ;

returnStatement
    : 'return' expression ';'
    | 'return' ';'
    ;

// Deklaracja zmiennych
variableDeclaration
    : primitiveVariableDeclaration 
    | listVariableDeclaration      
    | pointVariableDeclaration     
    | heightVariableDeclaration    
    | landVariableDeclaration    
    | lakeVariableDeclaration
    | riverVariableDeclaration
    ;

primitiveVariableDeclaration
    : ('int' | 'double' | 'bool' | 'string') IDENTIFIER 'is' expression ';'
    ;

listVariableDeclaration
    : 'List<' type '>' IDENTIFIER 'is' listExpression ';'
    ;

pointVariableDeclaration
    : 'Point' IDENTIFIER 'is' pointExpression ';'
    ;

// Deklaracja zmiennej typu Height (punkt + wysokość + stromość)
heightVariableDeclaration
    : 'Height' IDENTIFIER 'is' heightExpression ';'
    ;

landVariableDeclaration
    : 'Land' IDENTIFIER ('is' pointExpression)? 'with' perimeterDeclaration ',' heightDeclaration ';'
    | 'Land' IDENTIFIER 'is' expression ';'
    ;

// Deklaracja obwodu dla Land
perimeterDeclaration
    : 'perimeter is' shape
    ;

// Definicja kształtu (Circle, Square, RandomLand, List<Point>)
shape
    : 'Circle(' expression ')'
    | 'Square(' expression ',' expression ')'
    | 'RandomLand(' expression ',' expression ')'
    | listExpression
    ;

// Deklaracja wysokości dla Land
heightDeclaration
    : 'height is' ( functionCall | listExpression)
    ;


lakeVariableDeclaration
    : 'Lake' IDENTIFIER ('is' pointExpression)? 'with' perimeterDeclaration ';'
    ;

riverVariableDeclaration
    : 'River' IDENTIFIER 'is' pointExpression ';'
    ;

// Deklaracja funkcji
functionDeclaration
    : 'function' IDENTIFIER '(' parameters? ')' ':' type '{' statement* '}'
    | 'function' IDENTIFIER '(' parameters? ')' '{' statement* '}'
    ;

// Parametry funkcji (typ i nazwa)
parameters
    : type IDENTIFIER (',' type IDENTIFIER)*
    ;

ifStatement
    : 'if' '(' expression ')' 'do' '{' statement* '}' ( 'eif' '(' expression ')' 'do' blockStatement )* ( 'else do' blockStatement )?
    ;

blockStatement
    : '{' statement* '}'
    ;

loopStatement
    : 'repeat' 'with' IDENTIFIER expression '{' statement* '}'                          # RepeatFixedLoop
    | 'repeat' 'with' IDENTIFIER 'from' expression 'to' expression '{' statement* '}'   # RepeatRangeLoop
    | 'while' '(' expression ')' 'do' '{' statement* '}'                                # WhileLoop
    ;

// Wyrażenie to może być liczba, identyfikator, wywołanie funkcji, operacja arytmetyczna, dostęp do punktów lub list
expression    
    : '(' expression ')'                  # parenExpr    
    | '(' type ')' expression            # castExpr
    |'-' expression                     #unaryMinusExpr 
    | expression '^' ('^'|expression)   # powExpr
    | expression '?' ('?'|expression)   # sqrtExpr
    | expression ('*' | '/') expression   # mulDivExpr
    | expression ('+' | '-') expression   # addSubExpr
    | expression ('>' | '<' | '>=' | '<=' | '=' | '!=') expression # compareExpr    
    | NOT expression  # notExpr 
    | expression AND expression        # andExpr  
    | expression OR expression         # orExpr   
    | ('sin'|'cos'|'tg'|'ctg')'('expression')' #trygExpr
    | functionCall                         # funcCallExpr        // Wywołanie funkcji  
    | ('parent' '::')+ IDENTIFIER                         # scopeAccessExpr  
    | INT                                  # intExpr
    | DOUBLE                               # doubleExpr
    | STRING                               # stringExpr    
    | BOOLEAN                              # boolExpr    
    | IDENTIFIER                           # varExpr
    | pointAccess                          # pointAccessExpr     // Dostęp do współrzędnych punktu
    | listAccess                           # listAccessExpr      // Dostęp do elementu listy     
    ;


functionCall
    : IDENTIFIER '(' (expression (',' expression)*)? ')'
    ;

pointAccess
    : IDENTIFIER ('.x' | '.y')
    ;

listAccess
    : IDENTIFIER '[' expression ']'
    ;

// Wyrażenie typu Point
pointExpression
    : '(' expression ',' expression ')'
    | IDENTIFIER                                     
    ;

heightExpression
    : '(' pointExpression ',' expression ',' expression ')'  
    |  IDENTIFIER 
    ;

// Wyrażenie typu List
listExpression
    : '[' (listElementExpression (',' listElementExpression)*)? ']'
    | IDENTIFIER                           
    ;

listElementExpression
    : expression | pointExpression | heightExpression  
    ;
    
// Typy danych
type
    : 'int' | 'double' | 'bool' | 'string' | 'List<' type '>' | 'Point' | 'Height'
    ;

// Instrukcja przypisania wartości
assignment
    : variableAssignment    
    | pointFieldAssignment   
    | listAssignment         
    ;

variableAssignment
    : IDENTIFIER 'is' expression ';'  
    ;

// Przypisanie wartości do pola punktu
pointFieldAssignment
    : IDENTIFIER ('.x' | '.y') 'is' expression ';'  
    ;

// Przypisanie do listy
listAssignment
    : IDENTIFIER '.add(' expression ')' ';'             #ListAdd
    | IDENTIFIER '[' expression ']' 'is' expression ';' #ListUpdate
    ;


// Lexer rules
AND : 'and';
OR  : 'or';
NOT : 'not';
INT: [0-9]+;
DOUBLE: [0-9]+('.'[0-9]+)?;
STRING: '"' ~('"')* '"';
BOOLEAN: 'true' | 'false';
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
WHITESPACE: [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;
COMMENT: '/*' .*? '*/' -> skip ;