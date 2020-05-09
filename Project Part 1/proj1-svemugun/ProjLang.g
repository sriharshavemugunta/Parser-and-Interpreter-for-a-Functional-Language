grammar ProjLang;
//Lexer spec
fragment LETTER
	:	'a'..'z' | 'A'..'Z'
	;
fragment DIGIT
	:	'0'..'9'
	;
READ	:	'read';
WRITE	:	'write';
IF	:	'if';
THEN	:	'then';
ELSE	:	'else';
LET	:	'let';
IN	:	'in';
VAL	:	'val';
END	:	'end';
FUN	:	'fun';
LEFTFB	:	'{';
RIGHTFB	:	'}';
COLON	:	':';
WHILE	:	'while';
DO	:	'do';
SEMI	:	';';
COLEQ	:	':=';
NOT	:	'!';
ADDOP	:	('+'|'-'|'|');
MULOP	:	('*'| '/'|'&');
TRUE	:	'true';
FALSE	:	'false';
NUM	:	(DIGIT)*;
ID	:	LETTER(LETTER | DIGIT)*;
LEFTPAR	:	'(';
RIGHTPAR:	')';
EQ	:	'=';
RELOP	: 	('<');

WS	:	(' ' |'\t'|'\n'|'\r')+{skip();};

//Parser
input	:	expr SEMI
	;
expr	:	IF expr THEN expr ELSE expr
	|	LET VAL ID EQ expr IN expr END
	|	LET FUN ID LEFTPAR ID RIGHTPAR EQ expr IN expr END
	|	WHILE expr DO expr
	|	LEFTFB expr ( SEMI expr )* RIGHTFB
	|	NOT expr
	|	ID (COLEQ) expr
	|	relexpr
	;
relexpr	:	arithexpr ((EQ | RELOP) arithexpr)?
	;
arithexpr 
	:	term (ADDOP term)*
	;
term	: 	factor (MULOP factor)*
	;
factor	: 	NUM
	|	TRUE
	|	FALSE
	|	ID
	|	ID LEFTPAR expr RIGHTPAR
	|	LEFTPAR expr RIGHTPAR
	;