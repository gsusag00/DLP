// Generated from C:/Users/uo271723/Desktop/DLP/src/parser\Pmm.g4 by ANTLR 4.10.1
package parser;

    import ast.*;
    import ast.expression.*;
    import ast.definition.*;
    import ast.type.*;
    import ast.type.Integer;
    import ast.type.Double;
    import ast.type.Character;
    import ast.type.BooleanType;
    import ast.statement.*;
    import java.util.ArrayList;
    import java.util.List;
    import ast.expression.Boolean;
    import ast.expression.BoolLiteral;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PmmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PmmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PmmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PmmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#definitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinitions(PmmParser.DefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#mainFunc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMainFunc(PmmParser.MainFuncContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDef(PmmParser.FuncDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcVarList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVarList(PmmParser.FuncVarListContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#funcVar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncVar(PmmParser.FuncVarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDef(PmmParser.VarDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#varDec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDec(PmmParser.VarDecContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(PmmParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#recordFields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordFields(PmmParser.RecordFieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PmmParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(PmmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PmmParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(PmmParser.ExpressionContext ctx);
}