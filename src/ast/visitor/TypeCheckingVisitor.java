package ast.visitor;

import ast.Expression;
import ast.Program;
import ast.definition.FuncDefinition;
import ast.definition.VarDefinition;
import ast.expression.*;
import ast.expression.Boolean;
import ast.statement.*;
import ast.type.*;
import ast.type.Character;
import ast.type.Double;
import ast.type.Integer;

public class TypeCheckingVisitor<TR,TP> extends AbstractVisitor<TR,TP> {

    @Override
    public TR visit(Program program, TP p) {
        super.visit(program,p);
        return null;
    }

    @Override
    public TR visit(FuncDefinition funcDef, TP p) {
        super.visit(funcDef,p);
        return null;
    }

    @Override
    public TR visit(VarDefinition varDef, TP p) {
        super.visit(varDef,p);
        return null;
    }

    @Override
    public TR visit(Arithmetic arithmetic, TP p) {
        arithmetic.setLValue(false);
        super.visit(arithmetic,p);
        return null;
    }

    @Override
    public TR visit(Boolean bool, TP p) {
        bool.setLValue(false);
        super.visit(bool,p);
        return null;
    }

    @Override
    public TR visit(Cast cast, TP p) {
        cast.setLValue(false);
        super.visit(cast, p);
        return null;
    }

    @Override
    public TR visit(CharLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(Comparison comp, TP p) {
        comp.setLValue(false);
        super.visit(comp,p);
        return null;
    }

    @Override
    public TR visit(DoubleLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(IntLiteral lit, TP p) {
        lit.setLValue(false);
        super.visit(lit,p);
        return null;
    }

    @Override
    public TR visit(Not not, TP p) {
        not.setLValue(false);
        super.visit(not,p);
        return null;
    }

    @Override
    public TR visit(Point point, TP p) {
        point.setLValue(true);
        super.visit(point,p);
        return null;
    }

    @Override
    public TR visit(SquareBrackets sB, TP p) {
        sB.setLValue(true);
        super.visit(sB,p);
        return null;
    }

    @Override
    public TR visit(UnaryMinus minus, TP p) {
        minus.setLValue(false);
        super.visit(minus,p);
        return null;
    }

    @Override
    public TR visit(Variable var, TP p) {
        var.setLValue(true);
        super.visit(var,p);
        return null;
    }

    @Override
    public TR visit(Assignment assignment, TP p) {
        super.visit(assignment,p);
    if(!assignment.getLeft().getLValue()){
        new ErrorType(assignment.getLine(),assignment.getColumn(),"Error: Not LValue");
    }
        return null;
    }

    @Override
    public TR visit(Function function, TP p) {
        super.visit(function,p);
        return null;
    }

    @Override
    public TR visit(IfElse ifElse, TP p) {
        super.visit(ifElse,p);
        return null;
    }

    @Override
    public TR visit(Input input, TP p) {
        super.visit(input,p);
        for(Expression exp: input.getExpressions()){
            if(!exp.getLValue()){
                new ErrorType(exp.getLine(),exp.getColumn(),"Error: Not LValue");
            }
        }
        return null;
    }

    @Override
    public TR visit(Print print, TP p) {
        super.visit(print,p);
        return null;
    }

    @Override
    public TR visit(Return ret, TP p) {
        super.visit(ret,p);
        return null;
    }

    @Override
    public TR visit(While whil, TP p) {
        super.visit(whil,p);
        return null;
    }

    @Override
    public TR visit(Array arr, TP p) {
        super.visit(arr,p);
        return null;
    }

    @Override
    public TR visit(Character character, TP p) {
        super.visit(character,p);
        return null;
    }

    @Override
    public TR visit(Double doub, TP p) {
        super.visit(doub,p);
        return null;
    }

    @Override
    public TR visit(ErrorType err, TP p) {
        super.visit(err,p);
        return null;
    }

    @Override
    public TR visit(FunctionType funcType, TP p) {
        super.visit(funcType,p);
        return null;
    }

    @Override
    public TR visit(Integer integer, TP p) {
        super.visit(integer,p);
        return null;
    }

    @Override
    public TR visit(RecordField recordField, TP p) {
        super.visit(recordField,p);
        return null;
    }

    @Override
    public TR visit(Struct struct, TP p) {
        super.visit(struct,p);
        return null;
    }

    @Override
    public TR visit(VoidType voidType, TP p) {
        super.visit(voidType,p);
        return null;
    }
}
