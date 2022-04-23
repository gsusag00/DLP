package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class IntLiteral extends AbstractExpression implements Expression {

    private int value;

    public IntLiteral(int value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Int Literal at line: " + getLine() + "Column: " + getColumn() + ". Value: " + value;
    }

    public int getValue() {
        return value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Entero Literal. Linea: %d - Columna: %d - LValue: %b - Valor: %d \n",getLine(),getColumn(),getLValue(),value));
        return sb.toString();
    }


}
