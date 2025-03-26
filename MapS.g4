grammar MapS;

// Parser rules
program: statement* EOF;

statement
    : variableDeclaration
    | functionDeclaration
    | ifStatement
    | loopStatement
    | assignment
    | expression ';'
    | 'return' expression ';'
    ;

// Deklaracja zmiennych
variableDeclaration
    : primitiveVariableDeclaration
    | listVariableDeclaration
    | pointVariableDeclaration
    | heightVariableDeclaration
    | landVariableDeclaration
    ;

primitiveVariableDeclaration
    : ('int' | 'double' | 'bool' | 'string') IDENTIFIER 'is' expression ';'
    ;

listVariableDeclaration
    : 'List<' type '>' IDENTIFIER 'is' listExpression ';'
    ;

pointVariableDeclaration
    : 'Point' IDENTIFIER 'is' '(' expression ',' expression ')' ';'
    ;

// Deklaracja zmiennej typu Height (punkt + wysokość)
heightVariableDeclaration
    : 'Height' IDENTIFIER 'is' '(' pointExpression ',' expression ')' ';'
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
    | 'Square(' expression ')'
    | 'RandomLand(' expression ',' expression ')'
    | listExpression
    ;

// Deklaracja wysokości dla Land
heightDeclaration
    : 'height is' ( functionCall | listExpression)
    ;

// Deklaracja funkcji
functionDeclaration
    : 'function' IDENTIFIER '(' parameters? ')' ':' type '{' statement* '}' //czy sie tu jakoś dodaje return????
    | 'function' IDENTIFIER '(' parameters? ')' '{' statement* '}'
    ;

// Parametry funkcji (typ i nazwa)
parameters
    : type IDENTIFIER (',' type IDENTIFIER)*
    ;

ifStatement
    : 'if' '(' expression ')' 'do' '{' statement* '}' ( 'eif' '(' expression ')' 'do' '{' statement* '}' )* ( 'else do' '{' statement* '}' )?
    ;

loopStatement
    : 'repeat' 'with' IDENTIFIER expression '{' statement* '}'
    | 'repeat' 'with' IDENTIFIER 'from' expression 'to' expression '{' statement* '}'
    | 'while' '(' expression ')' 'do' '{' statement* '}'
    ;

// Wyrażenie to może być liczba, identyfikator, wywołanie funkcji, operacja arytmetyczna, dostęp do punktów lub list
expression
    : expression operator expression
    | '(' expression ')'
    | INT
    | DOUBLE  
    | STRING
    | BOOLEAN
    | IDENTIFIER        // Identyfikator zmiennej
    | functionCall      // Wywołanie funkcji
    | pointAccess       // Dostęp do współrzędnych punktu
    | listAccess        // Dostęp do elementu listy
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
    | IDENTIFIER                            // Możliwość użycia zdefiniowanego punktu           
    ;


// Wyrażenie typu List
listExpression
    : '[' (expression (',' expression)*)? ']'
    | IDENTIFIER                            // Możliwość użycia zdefiniowanej listy
    ;

// Typy danych
type
    : 'int' | 'double' | 'bool' | 'string' | 'List<' type '>' | 'Point' | 'Height' | 'Land'
    ;

// Operatory arytmetyczne, porównania i operacje logiczne
operator
    : '+' | '-' | '*' | '/' | '>' | '<' | '>=' | '<=' | '=' | '!=' | '^' | '?'
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
    : IDENTIFIER '.add(' expression ')' ';'
    | IDENTIFIER '[' expression ']' 'is' expression ';'
    ;


// Lexer rules
IDENTIFIER: [a-zA-Z_][a-zA-Z_0-9]*;
DOUBLE: [0-9]+('.'[0-9]+)?;
INT: [0-9]+;
STRING: '"' ~('"')* '"';
BOOLEAN: 'true' | 'false';
WHITESPACE: [ \t\r\n]+ -> skip;
LINE_COMMENT : '//' ~[\r\n]* -> skip ;