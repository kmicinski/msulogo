package org.msu.logocompiler;

public abstract class StatementAST extends ToplevelAST
{
    public void accept(ASTVisitor v) throws ReturnException
    {
    	v.visit(this);
    }
    
    public abstract StatementAST clone();
}
