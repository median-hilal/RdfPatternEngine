// Generated from C:/Users/Median/workspace/RdfPatternEngine/src/main/antlr4\SPARQLPatternsGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SPARQLPatternsGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SPARQLPatternsGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#sparqlTemplate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSparqlTemplate(SPARQLPatternsGrammarParser.SparqlTemplateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#patternFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatternFunction(SPARQLPatternsGrammarParser.PatternFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#singleton}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleton(SPARQLPatternsGrammarParser.SingletonContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#spaceList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#filterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#dotList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDotList(SPARQLPatternsGrammarParser.DotListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#joinFilterList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#asClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#baseElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#prefixedElementRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrefix(SPARQLPatternsGrammarParser.PrefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#elementRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElementRole(SPARQLPatternsGrammarParser.ElementRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link SPARQLPatternsGrammarParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SPARQLPatternsGrammarParser.AttributeContext ctx);
}