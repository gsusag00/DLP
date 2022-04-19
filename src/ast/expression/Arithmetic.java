package ast.expression;

import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;


public class Arithmetic extends AbstractOperation implements Expression {

    public Arithmetic(int line, int column, Expression left, Expression right, String operator) {
        super(line,column,left,right,operator);
    }

    @Override
    public String toString() {
        return "Arithmetic at line: " + getLine() + "Column: " + getColumn() + ". Operator: " + getOperator() + ". Left:" + getLeft().toString() + ". Right: " + getRight().toString();
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Operacion aritmetica. Linea: %d - Columna: %d - LValue: %b - Operador: %s \n",getLine(),getColumn(),getLValue(),getOperator()));
        sb.append(String.format("%s\tExpresion izquierda. %s \n",tab, getLeft().toString(tab+"\t")));
        sb.append(String.format("%s\tExpresion derecha. %s \n",tab, getRight().toString(tab+"\t")));
        return sb.toString();
    }
}
