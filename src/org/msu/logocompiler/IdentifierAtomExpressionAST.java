package org.msu.logocompiler;

public class IdentifierAtomExpressionAST extends AtomExpressionAST
{
	private String identifier;
	
	private boolean isAssigned;
	private boolean isQuoted;
	
	public void setIdentifier(String i) { identifier = i; }
	public String getIdentifier() { return identifier; }
	public void setIsQuoted(boolean t) { isQuoted = t; }
	public boolean getIsQuoted() { return isQuoted; }
	
	public IdentifierAtomExpressionAST(String identifier)
	{
		atomType = AtomType.Identifier;
		this.identifier = identifier;
	}
	
	public void accept(ASTVisitor v) {
		v.visit(this);
	}
	
	public IdentifierAtomExpressionAST clone()
	{
		return new IdentifierAtomExpressionAST(identifier);
	}
	
	public boolean getAssignedVariable() { return isAssigned; }
	public void setAssignedVariable(boolean b) { isAssigned = b; }
}
