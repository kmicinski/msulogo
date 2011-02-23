package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;
import org.msu.logocompiler.Type.BaseTypes;

public class ColorHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
		if (function.getArguments().size() != 3) {
			System.err.println("Error! needs three arguments " + function.getStartToken());	// 
			return;
		}
		
		int[] args = new int[3];
		
		for (int i = 0; i < 2; i++)
		{
			Type t = function.getArguments().get(0).getExpressionType(); // 
			if (t.getBaseType() != BaseTypes.Integer) {
				System.err.println("Error: trying to ``back'' a non-integer, bad job... " 
						+ function.getStartToken());
				return;
			}
			args[i] = function.getArguments().get(0).getEvaluationResult().
				getIntData();
		}
		
		environment.getActiveTurtle().turtleSetColor(args[0], args[1], args[2]);
		return;
	}
}
