grammar LogoAST;

options {
	output=AST;
}


tokens {
    FUNCALL;
    BLOCK;
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

block:
        statement+ -> ^(BLOCK statement+);

statement:
        WHILE '[' expression ']' '[' statement+ ']' -> ^(WHILE expression ^(BLOCK statement+))
    |	IF expression '[' statement+ ']' -> ^(IF expression ^(BLOCK statement+))
    |   IFELSE expression '[' ifblock=statement+ ']' '[' elseblock=statement+ ']' -> (^IF ^(BLOCK $ifblock) ^(BLOCK $elseblock))
    |	COMMAND expression* -> ^(FUNCALL COMMAND expression*);


expression
	:	term (COMPAREOP^ term)*;
	
term	:
		factor (TERMOP^ factor)*;

factor	:	
		ref (FACTOROP^ ref)*;
		
ref	:	
		REFOP atom  -> ^(REFOP atom)
	|	atom;

atom	:	
		'('! expression ')'!
	|	ID
	|	NUMBER;
	
        
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

COMMAND	:	
        	'print'
	|	'make'
	|   'forward'
	|   'penup'
	|   'pendown'
	|   'color'
	|   'right'
	|   'beginfill'
	|   'endfill'
	|   'goto'
	|   'circle'
	|   'left';

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
	
	
REFOP	:
        	'"'
	|	':';

FACTOROP:	
		'*'
	|	'/'
	|	'modulo';
		
COMMENT	:
        ';' .* NEWLINE;
	
WHILE	:	'while';

IF	:	'if';
		
ID	:	
        ( '_' )* LETTER (LETTER | '_' | NUMBER)*;
	
WHITESPACE : 
        ( '\t' | ' ' )+ 	{ $channel = HIDDEN; } ;

	
NEWLINE :
        ('\r')? '\n'		{ $channel = HIDDEN; } ;
	
NUMBER	:
        (DIGIT)+ ;

fragment DIGIT	: '0'..'9' ;

