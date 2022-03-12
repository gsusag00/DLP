package ast.expression;

import ast.BaseNode;
import ast.Expression;


public class Operation extends BaseNode {

     public Operation(int line, int column, Expression left, Expression right, String operator){
         super(line,column);
         this.left = left;
         this.right = right;
         this.operator = operator;
     }

     protected Expression left, right;
     protected String operator;


    public Expression DoOperation(){
         return null;
     }
}
