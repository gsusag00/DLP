package ast;

import ast.visitor.Visitor;

public interface ASTNode<TR,TP>{

    int getLine();
    int getColumn();
    TR accept(Visitor v, TP p);

}
