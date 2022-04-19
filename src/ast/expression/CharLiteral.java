package ast.expression;

import ast.BaseNode;
import ast.Expression;
import ast.visitor.Visitor;

public class CharLiteral extends AbstractExpression implements Expression {

    private char value;

    public CharLiteral(char value, int line, int column) {
        super(line, column);
        this.value = value;
    }

    public void setValue(char value) {
        this.value = value;
    }

    public char getValue() {
        return value;
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
        sb.append(String.format("Caracter Literal. Linea: %d - Columna: %d - LValue: %b - Valor: %c \n",getLine(),getColumn(),getLValue(),value));
        return sb.toString();
    }
}
