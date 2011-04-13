package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.*;

public class OutputHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment)
	{
		if (function.getArguments().size() != 1) {
			System.err.println("Error! Output needs only one argument!");
		}
		
		// Simple...
		environment.setFunctionReturnValue(function.getArguments().get(0).getEvaluationResult());
		
		return;
	}
}
