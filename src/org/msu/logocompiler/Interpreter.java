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
	case LogoASTParser.WHILE:
	    // return handleWhile(t);
	    break;
	case LogoASTParser.IF:
	    //  return handleIf(t);
	    break;
	case LogoASTParser.COMMAND:
	    //	    return handleCommand(t);
	    break;
	case LogoASTParser.COMPAREOP:
	case LogoASTParser.FACTOROP:
	case LogoASTParser.REFOP:
	case LogoASTParser.PAREN:
	case LogoASTParser.ID:
	case LogoASTParser.NUMBER:
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

