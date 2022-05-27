import ast.ASTNode;
import ast.codegenerator.CodeGenerator;
import ast.codegenerator.ExecuteCGVisitor;
import ast.codegenerator.OffsetVisitor;
import ast.errorHandler.ErrorHandler;
import ast.visitor.IdentificationVisitor;
import ast.visitor.TypeCheckingVisitor;
import parser.*;

import org.antlr.v4.runtime.*;

import ast.Program;
import introspector.model.IntrospectorModel;
import introspector.view.IntrospectorTree;

public class Main {
	
	public static void main(String... args) throws Exception {
		if (args.length<1) {
			System.err.println("Please, pass me the input file.");
			return;
		}
		// create a lexer that feeds off of input CharStream
		CharStream input = CharStreams.fromFileName(args[0]);
		PmmLexer lexer = new PmmLexer(input);

		// create a parser that feeds off the tokens buffer
		CommonTokenStream tokens = new CommonTokenStream(lexer); 
		PmmParser parser = new PmmParser(tokens);	
		Program ast = parser.program().ast;

		ast.accept(new IdentificationVisitor(), null);
		ast.accept(new TypeCheckingVisitor(),null);


		// * Check errors
		if(ErrorHandler.getInstance().hasErrors()){
			// * Show errors
			ErrorHandler.getInstance().showErrors(System.err);
		}
		else{
			// * The AST is shown
			//TODO Mirar los errores repetidos y cambiar los mensajes para que den mejor informacion.
			ast.accept(new OffsetVisitor(),null);
			ast.accept(new ExecuteCGVisitor(CodeGenerator.getInstance(args[0],args[1])),null);
//			IntrospectorModel model=new IntrospectorModel("Program", ast);
//			new IntrospectorTree("Introspector", model);
		}
	}
}
