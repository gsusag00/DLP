package ast.expression;

import ast.Expression;
import ast.visitor.Visitor;

public class Terniary extends AbstractExpression implements Expression {

    private Expression condition;
    private Expression trueVal;

    public Expression getCondition() {
        return condition;
    }

    public Expression getTrueVal() {
        return trueVal;
    }

    public Expression getFalseVal() {
        return falseVal;
    }

    private Expression falseVal;

    public Terniary(Expression condition, Expression trueVal, Expression falseVal, int line, int column) {
        super(line, column);
        this.condition = condition;
        this.trueVal = trueVal;
        this.falseVal = falseVal;
    }

    @Override
    public String toString() {
        return String.format("Terniary. Linea: %d - Columna: %d - LValue: $b. Condicion: %s - Cierto: %s - Falso: %s", getLine(), getColumn(),getLValue(),condition.toString(),trueVal.toString(),falseVal.toString());
    }

    @Override
    public String toString(String tab) {
        return null;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR, TP> v, TP p) {
        return v.visit(this,p);
    }
}
