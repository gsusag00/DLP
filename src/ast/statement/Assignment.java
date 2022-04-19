package ast.statement;

import ast.BaseNode;
import ast.Expression;
import ast.Statement;
import ast.visitor.Visitor;

public class Assignment extends BaseNode implements Statement {

    private Expression left;
    private Expression right;

    public Assignment(int line, int column, Expression left, Expression right) {
        super(line, column);
        this.left = left;
        this.right = right;
    }

    public Expression getLeft() {
        return left;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public Expression getRight() {
        return right;
    }

    public void setRight(Expression right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Assignment at line: " + getLine() + "Column: " + getColumn() + ". Left: " + left.toString() + ". Right:" + right.toString() + '}';
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public String toString(String tab) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Asignacion. Linea: %d - Columna: %d \n",getLine(),getColumn()));
        sb.append(String.format("%s\tExpresion izquierda. %s \n",tab, left.toString(tab+"\t")));
        sb.append(String.format("%s\tExpresion derecha. %s \n",tab, right.toString(tab+"\t")));
        return sb.toString();
    }
}
