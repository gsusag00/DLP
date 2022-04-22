package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Expression;
import ast.Type;

import java.util.List;

public abstract class AbstractType extends BaseNode implements Type{

    public AbstractType(int line, int column) {
        super(line, column);
    }

    @Override
    public boolean isLogical(ASTNode node) {
        return false;
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "El nodo no se permite en una operacion aritmetica");
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), "El nodo no se permite en una operacion aritmetica");
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "El nodo no se permite en una operacion de comparacion");
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "El nodo no se permite en una operacion logica");
    }

    @Override
    public Type logical(ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), "El nodo no se permite en una operacion de comparacion");
    }

    @Override
    public Type Dot(String var, ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), String.format("%s debe de ser una id valida ",var));
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "No es un array");
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "No se permite la asignacion entre estos nodos ");
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "No se puede hacer cast de este elemento");
    }

    @Override
    public boolean isBuiltInType(ASTNode node) {
        return false;
    }

    @Override
    public Type parenthesis(ASTNode node, List<Expression> expressions) {
        return new ErrorType(node.getLine(),node.getColumn(), "Uso erroneo de los parentesis");
    }

    @Override
    public char suffix(){
        throw new IllegalStateException("No existe sufijo para este tipo");
    }
}
