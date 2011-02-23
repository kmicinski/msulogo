package org.msu.logocompiler;

import java.util.List;
import java.util.Iterator;

public class FunctionType extends Type
{
    private List<Type> arguments;
    private Type returnType;
    
    public void setReturnType(Type t) { returnType = t; }
    public void setArgumentTypes(List<Type> a) { arguments = a; }
    
    public List<Type> getArgumentTypes() { return arguments; }
    public Type getReturnType() { return returnType; }
    
    public FunctionType(List<Type> arguments, Type returnType)
    {
	this.returnType = returnType;
	this.arguments = arguments;
	
	return;
    }
    
    public int getNumArguments() { return arguments.size(); }
    
    public boolean identicalType(Type t)
    {
	if (!(t instanceof FunctionType))
	    return false;
	
	FunctionType tprime = (FunctionType)t;
	
	if (tprime.getNumArguments() != arguments.size()
	    || !tprime.getReturnType().identicalType(returnType))
	    return false;
	
	Iterator<Type> thisarg = arguments.iterator();
	Iterator<Type> thatarg = tprime.getArgumentTypes().iterator();
	
	for (; thisarg.hasNext();) 
	{
	    Type thistype = (Type)thisarg.next();
	    Type thattype = (Type)thatarg.next();
	    
	    if (!thistype.identicalType(thattype))
		return false;
        }
	
	return true;
    }
}
