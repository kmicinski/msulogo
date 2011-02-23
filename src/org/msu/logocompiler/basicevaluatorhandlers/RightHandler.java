package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;
import org.msu.logocompiler.Type.BaseTypes;

public class RightHandler implements EvaluatorFunctionHandler 
{
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
		if (function.getArguments().size() != 1) {
			System.err.println("Error! only want one argument" + function.getStartToken());	// 
			return;
		}
		
		Type t = function.getArguments().get(0).getExpressionType(); // 
		if (t.getBaseType() != BaseTypes.Integer) {
			System.err.println("Error: trying to ``back'' a non-integer, bad job... " 
					+ function.getStartToken());
			return;
		}
		
		environment.getActiveTurtle().turtleRight(
				function.getArguments().get(0).getEvaluationResult().getIntData());
		return;
	}

}