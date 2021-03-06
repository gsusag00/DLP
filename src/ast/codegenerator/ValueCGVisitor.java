package ast.codegenerator;

import ast.Expression;
import ast.expression.*;
import ast.expression.Boolean;
import ast.statement.Assignment;
import ast.statement.Function;
import ast.type.BooleanType;
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
        value[[arithmetic: expression => left:expression op right:expression]]()=
            value[[left]]
            value[[right]]
            cg.arithmetic(arithmetic.type,op)
     */
    @Override
    public Object visit(Arithmetic arithmetic, Object p) {
        arithmetic.getLeft().accept(this,p);
        arithmetic.getRight().accept(this,p);
        cg.arithmetic(arithmetic.getType(),arithmetic.getOperator());
        return null;
    }

    /*
        value[[boolean: expression => left:expression op right:expression]]()=
            value[[left]]
            value[[right]]
            cg.logical(boolean.type,op)
     */
    @Override
    public Object visit(Boolean bool, Object p) {
        bool.getLeft().accept(this,p);
        bool.getRight().accept(this,p);
        cg.logical(bool.getOperator());
        return null;
    }

    /*
        value[[cast: expression => Type exp:expression]]()=
            value[[exp]]
            cg.cast(cast.getType(), Type)
     */
    @Override
    public Object visit(Cast cast, Object p) {
        cast.getExpression().accept(this,p);
        cg.cast(cast.getExpression().getType(),cast.getCastType());
        return null;
    }

    /*
        value[[charLiteral: expresion => CHAR_CONSTANT]]()=
            <pushb>(int) CHAR_CONSTANT
     */
    @Override
    public Object visit(CharLiteral lit, Object p) {
        cg.push(lit.getType(),String.valueOf((int)lit.getValue()));
        return null;
    }

    /*
        value[[comparison: expression => left:expression op right:expression]]()=
            value[[left]]
            value[[right]]
            cg.comparison(comparison.type,op)
     */
    @Override
    public Object visit(Comparison comp, Object p) {
        comp.getLeft().accept(this,p);
        comp.getRight().accept(this,p);
        cg.comparison(comp.getLeft().getType(),comp.getOperator());
        return null;
    }

    /*
        value[[doubleLiteral: expression => DOUBLE_LITERAL]]()=
            <pushf> DOUBLE_LITERAL
     */
    @Override
    public Object visit(DoubleLiteral lit, Object p) {
        cg.push(lit.getType(),String.valueOf(lit.getValue()));
        return null;
    }

    /*
        value[[intLiteral: expression => INT_LITERAL]]()=
            <pushi> INT_LITERAL
     */
    @Override
    public Object visit(IntLiteral lit, Object p) {
        cg.push(lit.getType(), String.valueOf(lit.getValue()));
        return null;
    }

    /*
        value[[BoolLiteral: expression => BOOL_LITERAL]]()=
            <pushi> INT_LITERAL
     */
    @Override
    public Object visit(BoolLiteral lit, Object p) {
        cg.push(lit.getType(), lit.getValue()? String.valueOf(1) : String.valueOf(0));
        return null;
    }

    /*
        value[[not: expression=> negated:expression]]()=
            value[[negated]]
            <not>
     */
    @Override
    public Object visit(Not not, Object p) {
        not.getExpression().accept(this,p);
        cg.not();
        return null;
    }

    /*
        value[[point: expression=> left:expression ID]]()=
            address[[point]]
            <load> left.getType().suffix()
     */
    @Override
    public Object visit(Point point, Object p) {
        point.accept(this.addressCGVisitor,p);
        cg.load(point.getType());
        return null;
    }

    /*
        value[[squareBrackets: expression=> in:expression out:expression]]()=
            address[[squareBrackets]]
            <load> squareBrackets.getType().suffix()
     */
    @Override
    public Object visit(SquareBrackets sB, Object p) {
        sB.accept(this.addressCGVisitor,p);
        cg.load(sB.getType());
        return null;
    }

    /*
        value[[unaryMinus: expression=> exp:expression]]()=
            <push> exp.getType().suffix() 0
            value[[exp]]
            <sub> exp.getType().suffix()
     */
    @Override
    public Object visit(UnaryMinus minus, Object p) {
        cg.push(minus.getExpression().getType(),String.valueOf(0));
        minus.getExpression().accept(this,p);
        cg.sub(minus.getExpression().getType());
        return null;
    }

    /*
        value[[variable: expression => ID]]()=
            address[[variable]]
            <load> variable.getType().suffix()
     */
    @Override
    public Object visit(Variable var, Object p) {
        var.accept(this.addressCGVisitor,null);
        if(var.getType().equals(BooleanType.getInstance()))
            cg.load(Integer.getInstance());
        else
            cg.load(var.getType());
        return null;
    }

    /*
        value[[function: expression => variable:expression args:expression]]()=
            for(Expression exp: args)
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
