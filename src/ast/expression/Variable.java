package ast.expression;

import ast.BaseNode;
import ast.Definition;
import ast.Expression;
import ast.visitor.Visitor;

public class Variable extends AbstractExpression implements Expression {

    private String name;
    private Definition def;

    public Variable(String name, int line, int column) {
        super(line, column);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Variable at line: " + getLine() + "Column: " + getColumn() + "Name: " + name;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    public Definition getDef() {
        return def;
    }

    public void setDef(Definition def) {
        this.def = def;
    }
}
