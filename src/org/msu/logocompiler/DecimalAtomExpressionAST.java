package org.msu.logocompiler;

public class DecimalAtomExpressionAST extends AtomExpressionAST
{
    double number;
        
    public DecimalAtomExpressionAST(double num)
    {
	atomType = AtomType.Decimal;
	number = num;
    }
    
    public void accept(ASTVisitor v) {
	v.visit(this);
    }
    
    public DecimalAtomExpressionAST clone()
    {
    	return new DecimalAtomExpressionAST(number);
    }
}
