package org.msu.logocompiler;

public abstract class AtomExpressionAST extends ExpressionAST
{
    public enum AtomType {
	Identifier, Integer, Decimal
    }
        
    protected AtomType atomType;
    
    public void setAtomType(AtomType t) { atomType = t; }
    public AtomType getAtomType() { return atomType; }
	
}