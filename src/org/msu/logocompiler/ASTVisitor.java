package org.msu.logocompiler;

public interface ASTVisitor {
	void visit(AtomExpressionAST ast);
	void visit(BinaryExpressionAST ast);
	void visit(BlockAST ast);
	void visit(ExpressionAST ast);
	void visit(ExpressionStatementAST ast);
	void visit(FunCallExpressionAST ast);
	void visit(IdentifierAtomExpressionAST ast);
	void visit(NumberAtomExpressionAST ast);
	void visit(IfStmtAST ast);
	//void visit(Statement)
	void visit(UnaryExpressionAST ast);
	void visit(WhileStmtAST ast);
	//void visit(FunCallExpressionAST ast);
}
