grammar LogoTurtle;

options {
	output=AST;
	//backtracking=true;
}


tokens {
    FUNCALL;
    FUNCALLSTMT;
    BLOCK;
    EXPRSTMT;
    FLOATCONST;
    INTCONST;
    OUTPUT;
    FUNCDEF;
    ARGLIST;
    QUOTE;
    COLON;
    REFOP;
    PROGRAM;
}

@lexer::header{
package org.msu.logocompiler;
}

@header {
package org.msu.logocompiler;
}

@members {
    private int mNumLines = 0;
    private int mNumCommands = 0;
    private int mNumIds = 0;
    private int mNumNumbers = 0;
    private int mNumMathOps = 0;
    private int mNumRefOps = 0;
    private int mNumNewlines = 0;
    private int mNumComments = 0;
    
    private void incNumLines() { mNumLines++; }
    private void incNumCommands() { mNumCommands++; }
    private void incNumIds() { mNumIds++; }
    private void incNumNumbers() { mNumNumbers++; }
    private void incNumMathOps() { mNumMathOps++; }
    private void incNumRefOps() { mNumRefOps++; }
    private void incNumNewlines() { mNumNewlines++; }
    private void incNumComments() { mNumComments++; }
    
    public int getNumLines() { return mNumLines; }
    public int getNumCommands() { return mNumCommands; }
    public int getNumMathOps() { return mNumMathOps; }
    public int getNumNumbers() { return mNumNumbers; }
    public int getNumIds() { return mNumIds; }
    public int getNumRefOps() { return mNumRefOps; }
    public int getNumNewlines() { return mNumNewlines; }
    public int getNumComments() { return mNumComments; }
    
}

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

//translation_unit
//	:	program;
        /*{
		        System.out.println("COMMANDS:\t\t" + getNumCommands() + "\n"
	                           + "IDS:\t\t\t" + getNumIds() + "\n"
	                           + "NUMBERS:\t\t" + getNumNumbers() + "\n"
	                           + "MATHOPS:\t\t" + getNumMathOps() + "\n"
	                           + "REFOPS:\t\t\t" + getNumRefOps() + "\n"
	                           + "NEWLINES:\t\t" + getNumLines() + "\n"
	                           + "COMMENTS:\t\t" + getNumComments());
		};*/

//translation_unit
//	:	(block | function_definition)+;

translation_unit
	:	(elementary_unit)+ -> ^(PROGRAM elementary_unit+);

elementary_unit
	:	(block)
	|	(function_definition);

block:
       (options {greedy=true;}: statement)+ -> ^(BLOCK statement+);

function_definition
	:	'to' ID '(' (argument)* ')' block 'end' -> ^(FUNCDEF ID ^(ARGLIST argument*) block);
	
argument
	:
	':'! ID;

statement:
        WHILE  '['  funcallexpr ']'  '[' statement+ ']'-> ^(WHILE funcallexpr ^(BLOCK statement+))
    |	IF funcallexpr '['  (statement)+ ']'-> ^(IF funcallexpr ^(BLOCK statement+))
    |   IFELSE funcallexpr '[' ifblock=block ']'  '['  elseblock=block ']' -> ^(IF funcallexpr $ifblock $elseblock)
    |	'output' funcallexpr -> ^(FUNCALL 'output' funcallexpr)
    |	ID '(' simpleexpr* ')' -> ^(EXPRSTMT ^(FUNCALL ID simpleexpr*))
    |	'(' 'print' (options {backtrack=true;}: funcallexpr)+ ')' -> ^(EXPRSTMT ^(FUNCALL 'print' funcallexpr+))
    |   'print' funcallexpr -> ^(FUNCALL 'print' funcallexpr)
    |	'pendown' -> ^(FUNCALL 'pendown')
    |	'pd' -> ^(FUNCALL 'pendown')
    |	'penup' -> ^(FUNCALL 'penup')
    |	'pu' -> ^(FUNCALL 'penup')
    |	FD funcallexpr -> ^(FUNCALL FD funcallexpr)
    |   BK funcallexpr -> ^(FUNCALL BK funcallexpr)
    |	LT funcallexpr -> ^(FUNCALL LT funcallexpr)
    |	RT funcallexpr -> ^(FUNCALL RT funcallexpr)
    |	SH funcallexpr -> ^(FUNCALL SH funcallexpr)
    |	'make' a=funcallexpr b=funcallexpr -> ^(FUNCALL 'make' $a $b)
    |	'setpos' '[' (int1=funcallexpr) (int2=funcallexpr) ']'-> ^(FUNCALL 'setpos' $int1 $int2)
    |	'circle' (int1=funcallexpr) (int2=funcallexpr) -> ^(FUNCALL 'circle' $int1 $int2)
    |	'setpencolor' '[' (int1=funcallexpr) (int2=funcallexpr) (int3=funcallexpr) ']' -> ^(FUNCALL 'setpencolor' $int1 $int2 $int3)    
    |	'beginfill' -> ^(FUNCALL 'beginfill')
    |	'endfill' -> ^(FUNCALL 'endfill');
   // |   '(' expression+ ')' -> ^(SEXPR COMMAND expression+);

funcallexpr
	:	simpleexpr;

FD	:	'forward' | 'fd';
BK	:	'back' | 'bk';
RT	:	'right' | 'rt';
SH	:	'setheading' | 'seth';
LT	:	'left' | 'lt';

expression
	:	
	   simpleexpr;
	
simpleexpr
	:	term (COMPAREOP^ term)*;
	
term	:
		factor (TERMOP^ factor)*;

factor	:	
		unary (FACTOROP^ unary)*;
		
unary	:	
		'"' ID -> ^(QUOTE ID)
	|	':' ID -> ^(COLON ID)
	|	atom;

atom	:	
		ID '(' simpleexpr* ')' -> ^(FUNCALL ID simpleexpr*)
	|	'('! simpleexpr ')'!
	|	FLOAT -> ^(FLOATCONST FLOAT)
	|	INTEGER -> ^(INTCONST INTEGER);
        
/*
token_list: 
        ( token )+;
*/
/*
token	:	
        COMMAND		{ incNumCommands(); }
	|	ID	    	{ incNumIds(); }
	|	NUMBER		{ incNumNumbers(); }
	|	MATHOP		{ incNumMathOps(); }
	|	REFOP		{ incNumRefOps(); };
*/

/*------------------------------------------------------------------
 * LEXER RULES
 *------------------------------------------------------------------*/

fragment LETTER	:	
        	'a'..'z'
	|	'A'..'Z';

COMPAREOP
	:	'>'
	|	'<'
	|	'>='
	|	'<='
	|	'=';

TERMOP	:	
		'+'
	|	'-';
	
	
FACTOROP:	
		'*'
	|	'/';
		
COMMENT	:
        ';' .*  NEWLINE		{ $channel = HIDDEN; };
	
WHILE	:	'while';

IF	:	'if';
		
IFELSE
    :   'ifelse';

ID	:	
        ( '_' )* LETTER (LETTER | '_' | DIGIT)*;
	
FLOAT	:	
	DIGIT+ '.' DIGIT*;

INTEGER	:
        (DIGIT)+ ;

fragment DIGIT	: '0'..'9' ;

WHITESPACE : 
        ( '\t' | ' ' )+ 	{ $channel = HIDDEN; } ;

	
NEWLINE :
        ('\r')? '\n'		{ $channel = HIDDEN; };


