package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;
import org.msu.logocompiler.Type.BaseTypes;

public class SetHeadingHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
		DeclarationDataEnvironment environment)
	{
		if (function.getArguments().size() != 1) {
			System.err.println("Error! setheading needs one argument " + function.getStartToken());
			return;
		}
		
		if (function.getArguments().get(0).getExpressionType().getBaseType() != BaseTypes.Integer) {
			System.err.println("Error: trying to ``setheading'' with a non integer " + function.getStartToken());
			return;
		}
		
		environment.getActiveTurtle().turtleSetHeading(function.getArguments().get(0).getEvaluationResult().getIntData());
	}
}
