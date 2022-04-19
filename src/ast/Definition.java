package ast;

import ast.expression.Variable;

public interface Definition extends ASTNode {

    String getName();
    Type getType();
    String toString(String tab);

    int getScope();
    void setScope(int scope);
}
