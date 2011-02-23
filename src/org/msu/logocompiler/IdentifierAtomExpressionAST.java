package org.msu.logocompiler;

public class IdentifierAtomExpressionAST extends AtomExpressionAST
{
	private String identifier;

	public void setIdentifier(String i) { identifier = i; }
	public String getIdentifier() { return identifier; }

	public IdentifierAtomExpressionAST(String identifier)
	{
		atomType = AtomType.Identifier;
		this.identifier = identifier;
	}
	
	public void accept(ASTVisitor v) {
		v.visit(this);
	}
}
