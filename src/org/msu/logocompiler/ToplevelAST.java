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
    
    private List<TurtleICodeInstruction> instructionList;
    
    public List<TurtleICodeInstruction> getInstructionList()
    {
    	return instructionList;
    }
    
    public void setInstructionList(List<TurtleICodeInstruction> list)
    { 
    	instructionList = list;
    }
    
    public List<TurtleICodeInstruction> getGeneratedInstructionList()
    {
    	return instructionList;
    }
    
    public void addGeneratedInstruction(TurtleICodeInstruction instr)
    {
    	instructionList.add(instr);
    }
    
    public ToplevelAST()
    {
    	instructionList = new LinkedList<TurtleICodeInstruction>();
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

