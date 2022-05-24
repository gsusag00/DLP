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

public interface Visitor<TR, TP> {

    TR visit(Program program,TP p);
    TR visit(FuncDefinition funcDef,TP p);
    TR visit(VarDefinition varDef,TP p);
    TR visit(Arithmetic arithmetic,TP p);
    TR visit(Boolean bool,TP p);
    TR visit(Cast cast,TP p);
    TR visit(CharLiteral lit,TP p);
    TR visit(Comparison comp, TP p);
    TR visit(DoubleLiteral lit,TP p);
    TR visit(IntLiteral lit,TP p);
    TR visit(Not not,TP p);
    TR visit(Point point,TP p);
    TR visit(SquareBrackets sB,TP p);
    TR visit(UnaryMinus minus,TP p);
    TR visit(Variable var,TP p);
    TR visit(Assignment assignment,TP p);
    TR visit(Function function,TP p);
    TR visit(IfElse ifElse,TP p);
    TR visit(Input input, TP p);
    TR visit(Print print,TP p);
    TR visit(Return ret,TP p);
    TR visit(While whil,TP p);
    TR visit(Array arr,TP p);
    TR visit(Character character,TP p);
    TR visit(Double doub,TP p);
    TR visit(ErrorType err,TP p);
    TR visit(FunctionType funcType,TP p);
    TR visit(Integer integer,TP p);
    TR visit(RecordField recordField,TP p);
    TR visit(Struct struct,TP p);
    TR visit(VoidType voidType,TP p);
    TR visit(Terniary terniary, TP p);


}
