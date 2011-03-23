package org.msu.logocompiler;
/**
 * Filename: Interpreter.java
 * Purpose: Interpreter for Logo AST
 *
 */

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import msu.cse.turtlegraphics.*;

public class Interpreter {
    CommonTree root;    
    /**
     * 
     */ 
    /*    public void interpretTree(CommonTree tree)
    {
	
    }
    
    public Object exec(CommonTree t)
    {
	switch (t.getType()) {
	case LogoAST2Parser.WHILE:
	    // return handleWhile(t);
	    break;
	case LogoAST2Parser.IF:
	    //  return handleIf(t);
	    break;
	case LogoAST2Parser.COMMAND:
	    //	    return handleCommand(t);
	    break;
	case LogoAST2Parser.COMPAREOP:
	case LogoAST2Parser.FACTOROP:
	case LogoAST2Parser.REFOP:
	case LogoAST2Parser.PAREN:
	case LogoAST2Parser.ID:
	case LogoAST2Parser.NUMBER:
	    handleExpression(t);
	    break;
	}
	return null;
    }
    
    public Object handleExpression(CommonTree t)
    {
	if (t.getText().equals(">")) {
	    System.out.println("Yes...");
	}
	return null;
	}*/
}

