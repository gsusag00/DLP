package ast.codegenerator;

import ast.Expression;
import ast.expression.*;
import ast.expression.Boolean;
import ast.statement.Assignment;
import ast.statement.Function;
import ast.type.Integer;
import ast.visitor.AbstractVisitor;

public class ValueCGVisitor extends AbstractVisitor<Object,Object> {

    private CodeGenerator cg;
    private AddressCGVisitor addressCGVisitor;

    public ValueCGVisitor(){
        cg = CodeGenerator.getInstance();
    }

    public void setAddressCGVisitor(AddressCGVisitor addressCGVisitor){
        this.addressCGVisitor = addressCGVisitor;
    }


    /*
        value[[Arithmetic: expression => expression1 op expression2]]()=
            value[[expression1]]
            value[[expression2]]
            cg.arithmetic(expression.type,op)
     */
    @Override
    public Object visit(Arithmetic arithmetic, Object p) {
        arithmetic.getLeft().accept(this,p);
        arithmetic.getRight().accept(this,p);
        cg.arithmetic(arithmetic.getType(),arithmetic.getOperator());
        return null;
    }

    /*
        value[[Boolean: expression => expression1 op expression2]]()=
            value[[expression1]]
            value[[expression2]]
            cg.logical(expression.type,op)
     */
    @Override
    public Object visit(Boolean bool, Object p) {
        bool.getLeft().accept(this,p);
        bool.getRight().accept(this,p);
        cg.logical(bool.getOperator());
        return null;
    }

    /*
        value[[Cast: expression => Type expression1]]()=
            value[[expression1]]
            cg.cast(expression.getType(), Type)
     */
    @Override
    public Object visit(Cast cast, Object p) {
        cast.getExpression().accept(this,p);
        cg.cast(cast.getExpression().getType(),cast.getCastType());
        return null;
    }

    /*
        value[[CharLiteral: expresion => CHAR_CONSTANT]]()=
            <pushb>(int) CHAR_CONSTANT
     */
    @Override
    public Object visit(CharLiteral lit, Object p) {
        cg.push(lit.getType(),String.valueOf((int)lit.getValue()));
        return null;
    }

    /*
        value[[Comparison: expression => expression1 op expression2]]()=
            value[[expression1]]
            value[[expression2]]
            cg.comparison(expression.type,op)
     */
    @Override
    public Object visit(Comparison comp, Object p) {
        comp.getLeft().accept(this,p);
        comp.getRight().accept(this,p);
        cg.comparison(comp.getType(),comp.getOperator());
        return null;
    }

    /*
        value[[DoubleLiteral: expression => DOUBLE_LITERAL]]()=
            <pushf> DOUBLE_LITERAL
     */
    @Override
    public Object visit(DoubleLiteral lit, Object p) {
        cg.push(lit.getType(),String.valueOf(lit.getValue()));
        return null;
    }

    /*
        value[[DoubleLiteral: expression => INT_LITERAL]]()=
            <pushi> INT_LITERAL
     */
    @Override
    public Object visit(IntLiteral lit, Object p) {
        cg.push(lit.getType(), String.valueOf(lit.getValue()));
        return null;
    }

    /*
        value[[Not: expression=> expression1]]()=
            value[[expression1]]
            <not>
     */
    @Override
    public Object visit(Not not, Object p) {
        not.getExpression().accept(this,p);
        cg.not();
        return null;
    }

    /*
        value[[Point: expression=> expression1 ID]]()=
            address[[expression]]
            <load> expression1.getType().suffix()
     */
    @Override
    public Object visit(Point point, Object p) {
        point.accept(this.addressCGVisitor,p);
        cg.load(point.getType());
        return null;
    }

    /*
        value[[SquareBrackets: expression=> expression1 expression2]]()=
            address[[expression]]
            <load> expression.getType().suffix()
     */
    @Override
    public Object visit(SquareBrackets sB, Object p) {
        sB.getLeft().accept(this.addressCGVisitor,p);
        cg.load(sB.getType());
        return null;
    }

    /*
        value[[UnaryMinus: expression=> expression1]]()=
            <pushf> 0
            value[[expression1]]
            <sub> expression1.getType().suffix()
     */
    @Override
    public Object visit(UnaryMinus minus, Object p) {
        cg.push(minus.getExpression().getType(),String.valueOf(0));
        minus.getExpression().accept(this,p);
        cg.sub(minus.getExpression().getType());
        return null;
    }

    /*
        value[[Variable: expression => ID]]()=
            address[[expression]]
            <load> expression.getType().suffix()
     */
    @Override
    public Object visit(Variable var, Object p) {
        var.accept(this.addressCGVisitor,null);
        cg.load(var.getType());
        return null;
    }

    /*
        value[[Function: expression => variable:expression expression*]]()=
            for(Expression exp: expression*)
                value[[exp]]
            <call> variable.getName()
     */
    @Override
    public Object visit(Function function, Object p) {
        for(Expression exp: function.getExpressions()){
            exp.accept(this,p);
        }
        cg.call(function.getVariable().getName());
        return null;
    }

}
