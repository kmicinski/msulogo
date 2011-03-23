package org.msu.logocompiler;

public abstract class StatementAST extends ToplevelAST
{
    public abstract void accept(ASTVisitor v);
    
    public abstract StatementAST clone();
}
