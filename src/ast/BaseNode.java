package ast;

public class BaseNode implements ASTNode{

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
}
