package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.DeclarationDataEnvironment;
import org.msu.logocompiler.EvaluatorFunctionHandler;
import org.msu.logocompiler.FunCallExpressionAST;

public class PenDownHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
		environment.getActiveTurtle().turtlePenDown();
	}

}
