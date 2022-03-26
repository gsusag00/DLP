package ast;

import ast.visitor.Visitor;

public interface ASTNode{

    int getLine();
    int getColumn();
    <TR,TP> TR accept(Visitor<TR,TP> v, TP p);

}
