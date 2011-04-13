package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;
import org.msu.logocompiler.Type.BaseTypes;

public class ModuloHandler implements EvaluatorFunctionHandler
{
    public void evaluateFunction(FunCallExpressionAST function,
				 DeclarationDataEnvironment environment)
    {
	if (function.getArguments().size() != 2) {
	    System.err.println("Error! Modulo needs two arguments! " + function.getStartToken());
	    return;
	}
	
	Type t = function.getArguments().get(0).getExpressionType();
	Type tp = function.getArguments().get(1).getExpressionType();
	
	if (t.getBaseType() != BaseTypes.Integer
	    || tp.getBaseType() != BaseTypes.Integer) {
	    System.err.println("Error: modulo only accepts integer arguments! "
			       + function.getStartToken());
	    return;
	}
	
	BasicTypeData a = function.getArguments().get(0).getEvaluationResult();
	BasicTypeData b = function.getArguments().get(1).getEvaluationResult();
	
	int answer = a.getIntData() % b.getIntData();
	BasicTypeData c = new BasicTypeData();
	c.setDataType(a.getDataType());
	c.setIntData(answer);
	function.setEvaluationResult(c);
	function.setExpressionType(t);
	return;
    }
}