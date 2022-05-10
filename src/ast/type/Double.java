package ast.type;

import ast.ASTNode;
import ast.BaseNode;
import ast.Expression;
import ast.Type;
import ast.visitor.Visitor;

import java.util.List;

public class Double extends AbstractType {

    private static Double doub;

    private Double(int line, int column) {
        super(line, column);
    }

    public static Double getInstance() {
        if(doub == null) {
            doub = new Double(0,0);
        }
        return doub;
    }

    @Override
    public String toString() {
        return "RealType";
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
    public Type arithmetic(Type type, ASTNode node) {
        if (type.equals(Double.getInstance())) {
            return type;
        }
        else {
            if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
                return type;
            }
            return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar operaciones aritmeticas entre %s y Double, tienen que ser del mismo tipo.",type.getName()));
        }
    }

    @Override
    public Type arithmetic(ASTNode node) {
        return Double.getInstance();
    }

    @Override
    public Type comparison(Type type, ASTNode node) {
        if (type.equals(Integer.getInstance())) {
            return type;
        }
        else {
            if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
                return type;
            }
            return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se pueden realizar comparaciones entre %s y Double, tienen que ser del mismo tipo.",type.getName()));
        }
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if (type.equals(Double.getInstance())) {
            return type;
        } else {
            if(type instanceof ErrorType){ //Pensar en una manera de cambiar el instanceof por algo mejor.
                return type;
            }
            return new ErrorType(node.getLine(),node.getColumn(), String.format("Error: No se permite la asignacion entre %s y Double",type.getName()));
        }
    }

    @Override
    public Type canBeCastTo(Type type, ASTNode node) {
        if (type.equals(Double.getInstance()) || type.equals(Character.getInstance()) || type.equals(Integer.getInstance())) {
            return type;
        } else {
            return super.canBeCastTo(type,node);
        }
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
        return 4;
    }

    @Override
    public char suffix() {
        return 'f';
    }

    @Override
    public String getName() {
        return "Double";
    }
}
