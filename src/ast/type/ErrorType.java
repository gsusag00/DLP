package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.errorHandler.ErrorHandler;
import ast.visitor.Visitor;

public class ErrorType extends AbstractType {

    private String message;

    public ErrorType(int line, int column, String message) {
        super(line, column);
        this.message = message;
        ErrorHandler.getInstance().addError(this);
    }

    @Override
    public String toString() {
        return "Error at line: " + this.getLine() + " ,column: " + this.getColumn() + " ,message:" + message;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        return toString();
    }

    @Override
    public int numberOfBytes() {
        //Tirar una exception
        return 0;
    }
}
