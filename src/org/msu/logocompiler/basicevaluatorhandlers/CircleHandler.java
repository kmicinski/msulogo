package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.DeclarationDataEnvironment;
import org.msu.logocompiler.EvaluatorFunctionHandler;
import org.msu.logocompiler.FunCallExpressionAST;

public class CircleHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
		if (function.getArguments().size() != 2) {
			System.err.println("Error! ``circle'' expects two arguments! " + function.getStartToken());
		}
		
		environment.getActiveTurtle().turtleCircle(
				function.getArguments().get(0).getEvaluationResult().getIntData(), 
				function.getArguments().get(1).getEvaluationResult().getIntData());
	}
}
