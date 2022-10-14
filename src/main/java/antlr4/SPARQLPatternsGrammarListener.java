package antlr4;// Generated from C:/Users/Median/workspace/RdfPatternEngine/src/main/antlr4\SPARQLPatternsGrammar.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SPARQLPatternsGrammarParser}.
 */
public interface SPARQLPatternsGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#sparqlTemplate}.
	 * @param ctx the parse tree
	 */
	void enterSparqlTemplate(SPARQLPatternsGrammarParser.SparqlTemplateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#sparqlTemplate}.
	 * @param ctx the parse tree
	 */
	void exitSparqlTemplate(SPARQLPatternsGrammarParser.SparqlTemplateContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#patternFunction}.
	 * @param ctx the parse tree
	 */
	void enterPatternFunction(SPARQLPatternsGrammarParser.PatternFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#patternFunction}.
	 * @param ctx the parse tree
	 */
	void exitPatternFunction(SPARQLPatternsGrammarParser.PatternFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#singleton}.
	 * @param ctx the parse tree
	 */
	void enterSingleton(SPARQLPatternsGrammarParser.SingletonContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#singleton}.
	 * @param ctx the parse tree
	 */
	void exitSingleton(SPARQLPatternsGrammarParser.SingletonContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#spaceList}.
	 * @param ctx the parse tree
	 */
	void enterSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#spaceList}.
	 * @param ctx the parse tree
	 */
	void exitSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#filterList}.
	 * @param ctx the parse tree
	 */
	void enterFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#filterList}.
	 * @param ctx the parse tree
	 */
	void exitFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#dotList}.
	 * @param ctx the parse tree
	 */
	void enterDotList(SPARQLPatternsGrammarParser.DotListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#dotList}.
	 * @param ctx the parse tree
	 */
	void exitDotList(SPARQLPatternsGrammarParser.DotListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#joinFilterList}.
	 * @param ctx the parse tree
	 */
	void enterJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#joinFilterList}.
	 * @param ctx the parse tree
	 */
	void exitJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#asClause}.
	 * @param ctx the parse tree
	 */
	void enterAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#asClause}.
	 * @param ctx the parse tree
	 */
	void exitAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#baseElement}.
	 * @param ctx the parse tree
	 */
	void enterBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#baseElement}.
	 * @param ctx the parse tree
	 */
	void exitBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#prefixedElementRole}.
	 * @param ctx the parse tree
	 */
	void enterPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#prefixedElementRole}.
	 * @param ctx the parse tree
	 */
	void exitPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#prefix}.
	 * @param ctx the parse tree
	 */
	void enterPrefix(SPARQLPatternsGrammarParser.PrefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#prefix}.
	 * @param ctx the parse tree
	 */
	void exitPrefix(SPARQLPatternsGrammarParser.PrefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#elementRole}.
	 * @param ctx the parse tree
	 */
	void enterElementRole(SPARQLPatternsGrammarParser.ElementRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#elementRole}.
	 * @param ctx the parse tree
	 */
	void exitElementRole(SPARQLPatternsGrammarParser.ElementRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link SPARQLPatternsGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterAttribute(SPARQLPatternsGrammarParser.AttributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SPARQLPatternsGrammarParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitAttribute(SPARQLPatternsGrammarParser.AttributeContext ctx);
}