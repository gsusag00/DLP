package ast.visitor;

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

public class IdentificationVisitor extends AbstractVisitor{
    @Override
    public Object visit(Program program, Object p) {
        return null;
    }

    @Override
    public Object visit(FuncDefinition funcDef, Object p) {
        return null;
    }

    @Override
    public Object visit(VarDefinition varDef, Object p) {
        return null;
    }

    @Override
    public Object visit(Arithmetic arithmetic, Object p) {
        return null;
    }

    @Override
    public Object visit(Boolean bool, Object p) {
        return null;
    }

    @Override
    public Object visit(Cast cast, Object p) {
        return null;
    }

    @Override
    public Object visit(CharLiteral lit, Object p) {
        return null;
    }

    @Override
    public Object visit(Comparison comp, Object p) {
        return null;
    }

    @Override
    public Object visit(DoubleLiteral lit, Object p) {
        return null;
    }

    @Override
    public Object visit(IntLiteral lit, Object p) {
        return null;
    }

    @Override
    public Object visit(Not not, Object p) {
        return null;
    }

    @Override
    public Object visit(Point point, Object p) {
        return null;
    }

    @Override
    public Object visit(SquareBrackets sB, Object p) {
        return null;
    }

    @Override
    public Object visit(UnaryMinus minus, Object p) {
        return null;
    }

    @Override
    public Object visit(Variable var, Object p) {
        return null;
    }

    @Override
    public Object visit(Assignment assignment, Object p) {
        return null;
    }

    @Override
    public Object visit(Function function, Object p) {
        return null;
    }

    @Override
    public Object visit(IfElse ifElse, Object p) {
        return null;
    }

    @Override
    public Object visit(Input input, Object p) {
        return null;
    }

    @Override
    public Object visit(Print print, Object p) {
        return null;
    }

    @Override
    public Object visit(Return ret, Object p) {
        return null;
    }

    @Override
    public Object visit(While whil, Object p) {
        return null;
    }

    @Override
    public Object visit(Array arr, Object p) {
        return null;
    }

    @Override
    public Object visit(Character character, Object p) {
        return null;
    }

    @Override
    public Object visit(Double doub, Object p) {
        return null;
    }

    @Override
    public Object visit(ErrorType err, Object p) {
        return null;
    }

    @Override
    public Object visit(FunctionType funcType, Object p) {
        return null;
    }

    @Override
    public Object visit(Integer integer, Object p) {
        return null;
    }

    @Override
    public Object visit(RecordField recordField, Object p) {
        return null;
    }

    @Override
    public Object visit(Struct struct, Object p) {
        return null;
    }

    @Override
    public Object visit(VoidType voidType, Object p) {
        return null;
    }
}
