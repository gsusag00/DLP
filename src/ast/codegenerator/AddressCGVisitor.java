package ast.codegenerator;

import ast.expression.Variable;
import ast.visitor.AbstractVisitor;

public class AddressCGVisitor extends AbstractVisitor<Object,Object> {

    //Variable, Point (FieldAccess), AccessoArray.

    @Override
    public Object visit(Variable var, Object p) {

        return null;
    }


}
