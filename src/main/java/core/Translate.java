package core;

import antlr4.SPARQLPatternsGrammarLexer;
import antlr4.SPARQLPatternsGrammarParser;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class Translate {

    static final String patternExp="\"SELECT * WHERE{\" \n" +
            "\"{ SELECT \"\n" +
            " !SL <dimensionLevel.var> !SL \" \"\n" +
            " !SL !VM \"SI_\" !+  <measure.name>  !SL \" \" \n" +
            " !SL !VM \"SC_\" !+ <measure.name>  !SL \" \" \n" +
            " !SL ![ <compMeasure.expression> !] !SL \n" +
            " \" WHERE \"\n" +
            " \" { SELECT\" \n" +
            " !SL ![ <dimensionLevel.var> AS !VM \"SI_\" !+ <dimensionLevel.name> !] !SL \" \" \n" +
            " !SL ![ <measure.expression> AS !VM \"SI_\" !+ <measure.name> !] !SL \n" +
            " \"WHERE { \" \n" +
            " !DL <measure.path> !DL \n" +
            " !DL <dimensionLevel.path> !DL \n" +
            " !FL <siSlice.expression> !FL \n" +
            " \"} GROUP BY\" \n" +
            " !SL <dimensionLevel.var> !SL \" }\" \n" +
            " \" { SELECT\" \n" +
            " !SL ![<dimensionLevel.var> AS !VM \"SC_\" !+ <dimensionLevel.name> !] !SL \" \"\n" +
            " !SL ![ <measure.expression> AS !VM \"SC_\"!+ <measure.name> !] !SL\n" +
            " \"WHERE { \" \n" +
            " !DL <measure.path> !DL\n" +
            " !DL  <dimensionLevel.path> !DL \n" +
            " !FL <scSlice.expression> !FL\n" +
            " \"} GROUP BY\" \n" +
            " !SL <dimensionLevel.var> !SL \" }\" \n" +
            " !JFL !VM \"SI_\" !+ <dimensionLevel.name>\n" +
            " = !VM \"SC_\"  !+ <dimensionLevel.name> !JFL \" \"\n" +
            " \" } WHERE {\" !FL <compHaving.expression> !FL \" }\"";

        public static void main(String[] args) throws Exception {
            // create a CharStream that reads from standard input

            ANTLRInputStream input = new ANTLRInputStream(patternExp);

            SPARQLPatternsGrammarLexer lexer = new SPARQLPatternsGrammarLexer(input);

            CommonTokenStream tokens = new CommonTokenStream(lexer);

            SPARQLPatternsGrammarParser parser = new SPARQLPatternsGrammarParser(tokens);
            ParseTree tree = parser.sparqlTemplate(); // begin parsing at rule 'r'
            System.out.println(tree.toStringTree(parser)); // print LISP-style tree

            InputStream targetStream = new ByteArrayInputStream(patternExp.getBytes());


            // Create a generic parse tree walker that can trigger callbacks
            ParseTreeWalker walker = new ParseTreeWalker();
            // Walk the tree created during the parse, trigger callbacks
            walker.walk(new SparqlListener(), tree);
            System.out.println(); // print a \n after translation


        }

}
