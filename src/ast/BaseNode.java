package ast;

import ast.visitor.Visitor;

public abstract class BaseNode<TP,TR> implements ASTNode<TP,TR>{

    private int line;
    private int column;

    public BaseNode(int line, int column){
        this.line = line;
        this.column = column;
    }

    @Override
    public int getLine() {
        return line;
    }

    @Override
    public int getColumn() {
        return column;
    }

    @Override
    public abstract TP accept(Visitor v, TR p);
}
