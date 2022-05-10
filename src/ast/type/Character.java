package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class Character extends AbstractType {

    private static Character character;

    private Character(int line, int column) {
        super(line, column);
    }

    public static Character getInstance() {
        if(character == null) {
            character = new Character(0,0);
        }
        return character;
    }

    @Override
    public String toString() {
        return "char";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if(type.equals(Character.getInstance())) {
            return Integer.getInstance();
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar operaciones aritmeticas entre %s y Character, tienen que ser del mismo tipo.",type.getName()));
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return Integer.getInstance();
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type.equals(Character.getInstance())) {
            return Integer.getInstance();
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar comparaciones entre %s y Double, tienen que ser del mismo tipo.",type.getName()));
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type.equals(Character.getInstance())) {
            return type;
        }
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se permite la asignacion entre %s y Character",type.getName()));
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
        return 1;
    }

    @Override
    public char suffix() {
        return 'b';
    }

    @Override
    public String getName() {
        return "Character";
    }
}
