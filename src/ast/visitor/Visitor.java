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

public interface Visitor<TP,TR> {

    TP visit(Program program, TR p);
    TP visit(FuncDefinition funcDef, TR p);
    TP visit(VarDefinition varDef, TR p);
    TP visit(Arithmetic arithmetic, TR p);
    TP visit(Boolean bool, TR p);
    TP visit(Cast cast, TR p);
    TP visit(CharLiteral lit, TR p);
    TP visit(Comparison comp, TR p);
    TP visit(DoubleLiteral lit, TR p);
    TP visit(IntLiteral lit, TR p);
    TP visit(Not not, TR p);
    TP visit(Point point, TR p);
    TP visit(SquareBrackets sB, TR p);
    TP visit(UnaryMinus minus, TR p);
    TP visit(Variable var, TR p);
    TP visit(Assignment assignment, TR p);
    TP visit(Function function, TR p);
    TP visit(IfElse ifElse, TR p);
    TP visit(Input input, TR p);
    TP visit(Print print, TR p);
    TP visit(Return ret, TR p);
    TP visit(While whil, TR p);
    TP visit(Array arr, TR p);
    TP visit(Character character, TR p);
    TP visit(Double doub, TR p);
    TP visit(ErrorType err, TR p);
    TP visit(FunctionType funcType, TR p);
    TP visit(Integer integer, TR p);
    TP visit(RecordField recordField, TR p);
    TP visit(Struct struct, TR p);
    TP visit(VoidType voidType, TR p);


}
