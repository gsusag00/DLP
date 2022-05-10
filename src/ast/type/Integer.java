package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class Integer extends AbstractType {

    private static Integer integer;

    private Integer(int line, int column) {
        super(line, column);
    }

    public static Integer getInstance() {
        if(integer == null) {
            integer = new Integer(0,0);
        }
        return integer;
    }

    @Override
    public String toString() {
        return "int";
    }

    @Override
    public int getLine() {
        return 0;
    }

    @Override
    public int getColumn() {
        return 0;
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public boolean isLogical(ASTNode node) {
        return true;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if(type.equals(Integer.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar operaciones arimeticas entre %s y Integer, tienen que ser del mismo tipo.",type.getName()));
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return Integer.getInstance();
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type.equals(Integer.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar comparaciones entre %s y Integer, tienen que ser del mismo tipo.",type.getName()));
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if (type.equals(Integer.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar operaciones logicas entre %s y Integer, tienen que ser del mismo tipo.",type.getName()));
    }

    @Override
    public Type logical(ASTNode node) {
        return Integer.getInstance();
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type.equals(Integer.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se permite la asignacion entre %s e Integer",type.getName()));
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if(type.equals(Character.getInstance()) || type.equals(Double.getInstance()) || type.equals(Integer.getInstance()))
            return type;
        return super.canBeCastTo(type,node);
    }

    @Override
    public boolean isBuiltInType(ASTNode node) {
        return true;
    }

    @Override
    public String toString(String tab) {
        return toString();
    }

    @Override
    public int numberOfBytes() {
        return 2;
    }

    @Override
    public char suffix() {
        return 'i';
    }

    @Override
    public String getName() {
        return "Integer";
    }
}
