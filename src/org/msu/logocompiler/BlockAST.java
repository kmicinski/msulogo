package org.msu.logocompiler;

import java.util.List;
import java.util.LinkedList;

public class BlockAST extends ToplevelAST
{
	private DeclarationDataEnvironment scope;

	private List<StatementAST> statementList;

	public BlockAST()
	{
		scope = new DeclarationDataEnvironment(null);
		statementList = new LinkedList<StatementAST>();
	}

	public List<StatementAST> getStatementList() { return statementList; }

	public DeclarationDataEnvironment getScope() { return scope; }

	public void setScope(DeclarationDataEnvironment environment)
	{
		scope = environment;
	}

	public void addStatementAST(StatementAST ast)
	{
		statementList.add(ast);
	}

	public void accept(ASTVisitor v) throws ReturnException {
		for (StatementAST i : statementList) {
			i.accept(v);
		}
		v.visit(this);
	}

	public BlockAST clone()
	{
		BlockAST x = new BlockAST();
		List<StatementAST> stmts = x.getStatementList();

		for (StatementAST stmt : statementList)
		{
			stmts.add(stmt.clone());
		}
		return x;
	}
}