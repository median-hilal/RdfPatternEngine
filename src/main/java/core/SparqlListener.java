package core;

import antlr4.SPARQLPatternsGrammarBaseListener;
import antlr4.SPARQLPatternsGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparqlListener extends SPARQLPatternsGrammarBaseListener {
    @Override
    public void enterSparqlTemplate(SPARQLPatternsGrammarParser.SparqlTemplateContext ctx) {
        System.out.println(" here ");
    }

    @Override
    public void exitSparqlTemplate(SPARQLPatternsGrammarParser.SparqlTemplateContext ctx) {
        System.out.println(" here 1");
    }

    @Override
    public void enterPatternFunction(SPARQLPatternsGrammarParser.PatternFunctionContext ctx) {
        System.out.println(" here 2");
    }

    @Override
    public void exitPatternFunction(SPARQLPatternsGrammarParser.PatternFunctionContext ctx) {
        System.out.println(" here 3");
    }

    @Override
    public void enterSingleton(SPARQLPatternsGrammarParser.SingletonContext ctx) {
        System.out.println(" here 4");
    }

    @Override
    public void exitSingleton(SPARQLPatternsGrammarParser.SingletonContext ctx) {

    }

    @Override
    public void enterSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx) {

    }

    @Override
    public void exitSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx) {

    }

    @Override
    public void enterFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx) {

    }

    @Override
    public void exitFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx) {

    }

    @Override
    public void enterDotList(SPARQLPatternsGrammarParser.DotListContext ctx) {

    }

    @Override
    public void exitDotList(SPARQLPatternsGrammarParser.DotListContext ctx) {

    }

    @Override
    public void enterJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx) {

    }

    @Override
    public void exitJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx) {

    }

    @Override
    public void enterAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx) {

    }

    @Override
    public void exitAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx) {

    }

    @Override
    public void enterBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx) {

    }

    @Override
    public void exitBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx) {

    }

    @Override
    public void enterPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx) {

    }

    @Override
    public void exitPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx) {

    }

    @Override
    public void enterPrefix(SPARQLPatternsGrammarParser.PrefixContext ctx) {

    }

    @Override
    public void exitPrefix(SPARQLPatternsGrammarParser.PrefixContext ctx) {

    }

    @Override
    public void enterElementRole(SPARQLPatternsGrammarParser.ElementRoleContext ctx) {

    }

    @Override
    public void exitElementRole(SPARQLPatternsGrammarParser.ElementRoleContext ctx) {

        String elementName = ctx.ID().getText();
        String attribute=ctx.attribute()!=null?
                (/*ctx.attribute().TABLEPREFIX()!=null*/ false?
                        "table"
                        :ctx.attribute().ID().getText())
                :"name";
        FormalElement element= FormalElement.getFormalElementByName(elementName);

        List<ActualElement> elementVals = ActualElement.getActualElemenstByName(element.getName());
        Map<ActualElement, String> processedElements = new HashMap<>();

        if(elementVals!=null)//in Case of Only JoinElements in a NJList
            for (ActualElement elementVal : elementVals){
                processedElements.put(elementVal, helper.escapeIfReserved(elementVal.getAttribute(attribute)));
            }

        values.put(ctx, processedElements);
    }

    @Override
    public void enterAttribute(SPARQLPatternsGrammarParser.AttributeContext ctx) {

    }

    @Override
    public void exitAttribute(SPARQLPatternsGrammarParser.AttributeContext ctx) {

    }

    @Override
    public void visitTerminal(TerminalNode node) {

    }

    @Override
    public void visitErrorNode(ErrorNode node) {

    }

    @Override
    public void enterEveryRule(ParserRuleContext ctx) {

    }

    @Override
    public void exitEveryRule(ParserRuleContext ctx) {

    }
}
