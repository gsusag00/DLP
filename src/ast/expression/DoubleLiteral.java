package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class DoubleLiteral extends AbstractExpression implements Expression {

    public Double value;

    public DoubleLiteral(double value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    @Override
    public String toString() {
        return "Double Literal at line: " + getLine() + "Column: " + getColumn() + ". Value=" + value;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Doble Literal. Linea: %d - Columna: %d - LValue: %b - Valor: %f \n",getLine(),getColumn(),getLValue(),value));
        return sb.toString();
    }
}
