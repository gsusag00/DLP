package ast;

import ast.expression.Variable;

public interface Definition extends ASTNode {

    Variable getVariable();
    Type getType();
}
