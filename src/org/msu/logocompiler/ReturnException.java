package org.msu.logocompiler;

public class ReturnException extends Exception {
	private BasicTypeData functionReturnValue;
	
	public ReturnException(BasicTypeData returnValue)
	{
		functionReturnValue = returnValue;
	}
	
	public BasicTypeData getReturnValue()
	{
		return functionReturnValue;
	}
}
