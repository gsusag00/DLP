package ast;

import java.util.List;

public interface Type extends ASTNode{

    boolean isLogical(ASTNode node);
    Type arithmetic(Type type, ASTNode node);
    Type arithmetic(ASTNode node);
    Type comparison(Type type, ASTNode node);
    Type logical(Type type, ASTNode node);
    Type logical(ASTNode node);
    Type Dot(String var, ASTNode node);
    Type squareBrackets(Type type, ASTNode node);
    Type promotesTo(Type type, ASTNode node);
    Type canBeCastTo(Type type, ASTNode node);
    boolean isBuiltInType(ASTNode node);
    Type parenthesis(ASTNode node, List<Expression> expressions);

    String toString(String tab);
    int numberOfBytes();

    char suffix();

    String getName();
}
