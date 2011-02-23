/**
 * 
 * 
 */

package org.msu.logocompiler;

import org.antlr.runtime.*;

/**
 * The toplevel definition of the Abstract Syntax Tree 
 * used in our Logo compiler.  This class provides basic definitions, 
 * allows printing, and various other operations common to all types 
 * of Abstract Syntax Trees.  
 */
public abstract class ToplevelAST {
    private Token startToken;
    
    public void setStartToken(Token t) { startToken = t; }
    
    public Token getStartToken() { return startToken; }
    
    public abstract void accept(ASTVisitor v);
    
    /**
     * (Pretty?) Print the tree.
     */
    public void printTree()
    {
	return;
    }
}

