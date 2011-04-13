package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;
import org.msu.logocompiler.Type.BaseTypes;

public class NotHandler implements EvaluatorFunctionHandler
{
    public void evaluateFunction(FunCallExpressionAST function,
				 DeclarationDataEnvironment environment)
    {
	if (function.getArguments().size() != 1) {
	    System.err.println("Error! Not needs one argument! " + function.getStartToken());
	    return;
	}
	
	Type t = function.getArguments().get(0).getExpressionType();
	
	if (t.getBaseType() != BaseTypes.Boolean) {
	    System.err.println("Error: not only accepts boolean arguments! "
			       + function.getStartToken());
	    return;
	}
	
	BasicTypeData a = function.getArguments().get(0).getEvaluationResult();
	
	boolean answer = (!a.getBoolData());
	BasicTypeData c = new BasicTypeData();
	c.setDataType(a.getDataType());
	c.setBoolData(answer);
	function.setEvaluationResult(c);
	function.setExpressionType(t);
	return;
    }
}