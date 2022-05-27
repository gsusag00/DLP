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
        return new ErrorType(node.getLine(),node.getColumn(), "Error: El nodo no se permite en una operacion aritmetica");
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), "Error: El nodo no se permite en una operacion aritmetica");
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Error: El nodo no se permite en una operacion de comparacion");
    }

    @Override
    public Type logical(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Error: El nodo no se permite en una operacion logica");
    }

    @Override
    public Type logical(ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), "Error: El nodo no se permite en una operacion de logica, tiene que ser Boolean");
    }

    @Override
    public Type Dot(String var, ASTNode node) {
        return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: %s debe de ser una id valida ",var));
    }

    @Override
    public Type squareBrackets(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Error: %s No es un array");
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Error: No se permite la asignacion entre estos nodos ");
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
            return type;
        }
        return new ErrorType(node.getLine(),node.getColumn(), "Error: No se puede hacer cast de este elemento");
    }

    @Override
    public boolean isBuiltInType(ASTNode node) {
        return false;
    }

    @Override
    public Type parenthesis(ASTNode node, List<Expression> expressions) {
        return new ErrorType(node.getLine(),node.getColumn(), "Error: Uso erroneo de los parentesis");
    }

    @Override
    public char suffix(){
        throw new IllegalStateException("Error: No existe sufijo para este tipo");
    }
}
