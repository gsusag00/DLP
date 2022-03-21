package ast.type;

import ast.BaseNode;
import ast.Type;
import ast.errorHandler.ErrorHandler;
import ast.visitor.Visitor;

public class ErrorType extends BaseNode  implements Type {

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
    public Object accept(Visitor v, Object p) {
        return v.visit(this,p);
    }
}
