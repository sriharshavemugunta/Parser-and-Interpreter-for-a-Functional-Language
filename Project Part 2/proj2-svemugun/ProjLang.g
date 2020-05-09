grammar ProjLang;
//Lexer Specification
fragment LETTER	:	'a'..'z' | 'A'..'Z';
fragment DIGIT	:	'0'..'9';
IF		:	'if';
THEN		:	'then';
ELSE		:	'else';
LET		:	'let';
VAL		:	'val';
IN		:	'in';
END		:	'end';
FUN		:	'fun';
WHILE		:	'while';
DO		:	'do';
TRUE		:	'true';
FALSE		:	'false';
NUM		:	DIGIT+;
ID		:	LETTER(LETTER | DIGIT)*;
MULOP		:	('*'| '/'|'&');
ADDOP		:	('+'|'-'|'|');
RELOP		: 	('<');
LEFTFB		:	'{';
RIGHTFB		:	'}';
LEFTPAR		:	'(';
RIGHTPAR	:	')';
SEMI		:	';';
EQ		:	'=';
COLEQ		:	':=';
NOT		:	'!';
WS		:	(' '|'\t'|'\n'|'\r')+{skip();};
//Parser Specification
input	  returns [Expr exp]	: 	expr {$exp=$expr.exp;} SEMI
				;
expr	  returns [Expr exp]	: 	IF expr1=expr THEN expr2=expr ELSE expr3=expr 
					{$exp=new IfExp($expr1.exp,$expr2.exp,$expr3.exp);}
				|	LET VAL strn1=ID EQ expr4=expr IN expr5=expr END 
					{$exp=new LetValExp($strn1.text,$expr4.exp,$expr5.exp);}
				|	LET FUN strn2=ID LEFTPAR strn3=ID RIGHTPAR EQ expr6=expr IN expr7=expr END 
					{$exp=new LetFunExp($strn2.text,$strn3.text,$expr6.exp,$expr7.exp);}
				|	WHILE expr8=expr DO expr9=expr 
					{$exp=new WhileExp($expr8.exp,$expr9.exp);}
				|	LEFTFB expr10=expr ( SEMI expr11=expr 
					{$exp=new SeqExp($expr10.exp,$expr11.exp);})* RIGHTFB
				|	NOT expr12=expr 
					{$exp=new NotExp($expr12.exp);}
				|	strn4=ID (COLEQ) expr13=expr 
					{$exp=new AssnExp($strn4.text,$expr13.exp);}
				|	expr14=relexpr 
					{$exp=$expr14.exp;}
				;
relexpr   returns [Expr exp]	:	expr15=arithexpr {$exp=$expr15.exp;} ((expr16=EQ|expr16=RELOP) expr17=arithexpr
					{if ($expr16.text.equals("=")) $exp=new BinExp(BinOp.EQ,$exp,$expr17.exp);
					else if ($expr16.text.equals("<")) $exp=new BinExp(BinOp.LT,$exp,$expr17.exp);})? 
				;
arithexpr returns [Expr exp]	:	expr18=term {$exp=$expr18.exp;} (ADDOP expr19=term 
					{if ($ADDOP.text.equals("+")) $exp=new BinExp(BinOp.PLUS,$exp,$expr19.exp);
                              		else if($ADDOP.text.equals("-")) $exp=new BinExp(BinOp.MINUS,$exp,$expr19.exp);
                              		else if($ADDOP.text.equals("|")) $exp=new BinExp(BinOp.OR,$exp,$expr19.exp);})*
				;
term	  returns [Expr exp]	: 	expr20=factor {$exp=$expr20.exp;} (MULOP expr21=factor 
					{if ($MULOP.text.equals("*")) $exp=new BinExp(BinOp.TIMES,$exp,$expr21.exp);
                              		else if($MULOP.text.equals("/")) $exp=new BinExp(BinOp.DIV,$exp,$expr21.exp);
                              		else if($MULOP.text.equals("&")) $exp=new BinExp(BinOp.AND,$exp,$expr21.exp);})*
				;
factor	  returns [Expr exp]	: 	NUM {$exp=new IntConst(Integer.parseInt($NUM.text));}
				|	TRUE {$exp= new BoolConst(Boolean.parseBoolean("true"));}
				|	FALSE {$exp= new BoolConst(Boolean.parseBoolean("false"));}
				|	strn5=ID {$exp=new VarExp($strn5.text);} 
				|	strn6=ID LEFTPAR expr22=expr RIGHTPAR {$exp=new AppExp($strn6.text,$expr22.exp);}
				|	LEFTPAR expr23=expr {$exp=$expr23.exp;} RIGHTPAR
				;