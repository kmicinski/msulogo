package org.msu.logocompiler;

public class NumberAtomExpressionAST extends AtomExpressionAST
{
    int number;
    
    public NumberAtomExpressionAST(int num)
    {
	atomType = AtomType.Number;
	number = num;
    }

	public void accept(ASTVisitor v) {
		v.visit(this);
	}
}