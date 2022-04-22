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
        return "Character";
    }

    @Override
    public <TR, TP> TR accept(Visitor<TR,TP> v, TP p) {
        return v.visit(this,p);
    }

    @Override
    public Type arithmetic(Type type, ASTNode node) {
        if(type instanceof ErrorType){
            return type;
        }
        if(type.equals(Character.getInstance())) {
            return Integer.getInstance();
        }
        return super.arithmetic(type,node);
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
        return super.comparison(type,node);
    }

    @Override
    public Type promotesTo(Type type, ASTNode node) {
        if(type.equals(Character.getInstance())) {
            return type;
        }
        return super.promotesTo(type,node);
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
}
