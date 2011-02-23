package org.msu.logocompiler;

public interface EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function, DeclarationDataEnvironment environment);
}
