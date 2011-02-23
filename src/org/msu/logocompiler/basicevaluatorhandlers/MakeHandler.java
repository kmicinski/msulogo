package org.msu.logocompiler.basicevaluatorhandlers;

import org.msu.logocompiler.DeclarationDataEnvironment;
import org.msu.logocompiler.EvaluatorFunctionHandler;
import org.msu.logocompiler.ExpressionAST;
import org.msu.logocompiler.FunCallExpressionAST;
import org.msu.logocompiler.Type;
import org.msu.logocompiler.Type.BaseTypes;

public class MakeHandler implements EvaluatorFunctionHandler {
	public void evaluateFunction(FunCallExpressionAST function,
			DeclarationDataEnvironment environment) {
		if (function.getArguments().size() != 2) {
			System.err.println("Error! You need two to ``make'' " + function.getStartToken());
			return;
		}
		
		Type t = function.getArguments().get(0).getExpressionType(); // 
		if (t.getBaseType() != BaseTypes.String) {
			System.err.println("Error: trying to ``make'' a non-string, bad job... " 
					+ function.getStartToken());
			return;
		}
		
		String name = function.getArguments().get(0).getEvaluationResult().getStringData();
		
		ExpressionAST assign = function.getArguments().get(1);
		
		environment.insertData(name, assign.getEvaluationResult());
		environment.insertDeclaration(name, assign.getExpressionType());
		
		return;
	}

}
