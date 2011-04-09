package org.msu.logocompiler;

public interface ASTVisitor {
    void visit(AtomExpressionAST ast);
    void visit(BinaryExpressionAST ast);
    void visit(BlockAST ast);
    void visit(ExpressionAST ast);
    void visit(ExpressionStatementAST ast);
    void visit(FunCallExpressionAST ast) throws ReturnException;
    void visit(IdentifierAtomExpressionAST ast);
    void visit(IntegerAtomExpressionAST ast);
    void visit(DecimalAtomExpressionAST ast);
    void visit(IfStmtAST ast) throws ReturnException;
    void visit(ToplevelAST ast);
    void visit(UnaryExpressionAST ast);
    void visit(WhileStmtAST ast) throws ReturnException;
    void visit(FunctionDefinitionAST ast);
    //void visit(FunCallExpressionAST ast);
}
