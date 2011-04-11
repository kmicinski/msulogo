/**
 * 
 * 
 */

package org.msu.logocompiler;

import java.util.LinkedList;
import java.util.List;

import org.antlr.runtime.*;

/**
 * The toplevel definition of the Abstract Syntax Tree 
 * used in our Logo compiler.  This class provides basic definitions, 
 * allows printing, and various other operations common to all types 
 * of Abstract Syntax Trees.  
 */
public abstract class ToplevelAST {
    private Token startToken;
    
    private List<TurtleICodeNonbranchingInstruction> instructionList;
    
    public List<TurtleICodeNonbranchingInstruction> getInstructionList()
    {
    	return instructionList;
    }
    
    public void setInstructionList(List<TurtleICodeNonbranchingInstruction> list)
    { 
    	instructionList = list;
    }
    
    public List<TurtleICodeNonbranchingInstruction> getGeneratedInstructionList()
    {
    	return instructionList;
    }
    
    public void addGeneratedInstruction(TurtleICodeNonbranchingInstruction instr)
    {
    	instructionList.add(instr);
    }
    
    public ToplevelAST()
    {
    	instructionList = new LinkedList<TurtleICodeNonbranchingInstruction>();
    }
    
    public void setStartToken(Token t) { startToken = t; }
    
    public Token getStartToken() { return startToken; }
    
    /**
     * (Pretty?) Print the tree.
     */
    public void printTree()
    {
    	return;
    }
    
    public void accept(ASTVisitor v) throws ReturnException {
	v.visit(this);
    }	
}

