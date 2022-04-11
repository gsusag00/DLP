import ast.Expression;
import ast.Statement;
import ast.definition.VarDefinition;
import ast.expression.Variable;
import ast.statement.Function;
import ast.type.FunctionType;
import ast.type.Integer;

import java.util.ArrayList;
import java.util.List;

public class Prueba {

    public static void main(String... args){
        Variable a = new Variable("a",0,0);
        VarDefinition adef = new VarDefinition(0,0,"a");
        adef.setType(new FunctionType(0,0,new ArrayList<>(), Integer.getInstance()));
        a.setDef(adef);


        Function exp = new Function(0,0, a, null);
        exp.getVariable();

        System.out.println(exp.getVariable().getDef().getType().toString());
    }
}
