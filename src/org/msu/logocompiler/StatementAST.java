package org.msu.logocompiler;

public abstract class StatementAST extends ToplevelAST
{
    public abstract void accept(ASTVisitor v) throws ReturnException;
    
    public abstract StatementAST clone();
}
