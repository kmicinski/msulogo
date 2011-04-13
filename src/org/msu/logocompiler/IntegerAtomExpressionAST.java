package org.msu.logocompiler;

public class IntegerAtomExpressionAST extends AtomExpressionAST
{
    int number;
        
    public IntegerAtomExpressionAST(int num)
    {
	atomType = AtomType.Integer;
	number = num;
    }
    
    public void accept(ASTVisitor v) {
	v.visit(this);
    }
    
    public IntegerAtomExpressionAST clone()
    {
    	return new IntegerAtomExpressionAST(number);
    }
}

