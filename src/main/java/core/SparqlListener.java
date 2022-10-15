package core;

import antlr4.SPARQLPatternsGrammarBaseListener;
import antlr4.SPARQLPatternsGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTreeProperty;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SparqlListener extends SPARQLPatternsGrammarBaseListener {

    private String sparqlString = "";

    private Exception ex=null;

    ParseTreeProperty<Map<ActualPatternElement, String>> values = new ParseTreeProperty<>();

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
        ParserRuleContext childCtx = ctx.asClause() != null ? ctx.asClause() : ctx.baseElement();
        Map<ActualPatternElement, String> elements = values.get(childCtx);

        if (elements.size() > 1)
            ex=new Exception(childCtx.getText());
        else
            for (ActualPatternElement element : elements.keySet())
                sparqlString += elements.get(element);
    }

    @Override
    public void enterSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx) {

    }

    @Override
    public void exitSpaceList(SPARQLPatternsGrammarParser.SpaceListContext ctx) {
        ParserRuleContext childCtx = ctx.asClause() != null ? ctx.asClause() : ctx.baseElement();
        addStringElement(childCtx, " ");
    }

    @Override
    public void enterFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx) {

    }

    @Override
    public void exitFilterList(SPARQLPatternsGrammarParser.FilterListContext ctx) {
        addStringElement(ctx.baseElement(), " ");
    }

    @Override
    public void enterDotList(SPARQLPatternsGrammarParser.DotListContext ctx) {

    }

    @Override
    public void exitDotList(SPARQLPatternsGrammarParser.DotListContext ctx) {
        addStringElement(ctx.baseElement(), " ");
    }

    @Override
    public void enterJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx) {

    }

    @Override
    public void exitJoinFilterList(SPARQLPatternsGrammarParser.JoinFilterListContext ctx) {
        Map<ActualPatternElement, String> elements1 = values.get(ctx.baseElement(0));
        String condition="";

        Map<ActualPatternElement, String> elements2 = values.get(ctx.baseElement(1));

        for (ActualPatternElement val1 : elements1.keySet()) {
            String iri = val1.getIri();
            for (ActualPatternElement val2 : elements2.keySet()) {
                //If the values are based on the same actual pattern element
                if (iri.equalsIgnoreCase(val2.getIri())) {
                    condition += "FILTER ( " + elements1.get(val1) + " = " + elements2.get(val2)+" ) ";
                }
            }
        }
        sparqlString += condition;
    }

    @Override
    public void enterAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx) {

    }

    @Override
    public void exitAsClause(SPARQLPatternsGrammarParser.AsClauseContext ctx) {

        Map<ActualPatternElement, String> elements1 = values.get(ctx.baseElement(0));
        Map<ActualPatternElement, String> elements2 = values.get(ctx.baseElement(1));

        Map<ActualPatternElement, String> processedElements = new HashMap<>();

        String str = "";

        for (ActualPatternElement element : elements1.keySet()) {
            str = "(" + elements1.get(element) + " AS ?";

            if (ctx.prefix() != null) {
                str += ctx.prefix().SPARQLTEXT().getText().replace("\"", "").replace(" ", "") + element.getName();
            } else if (ctx.SPARQLTEXT() != null)
                str += ctx.SPARQLTEXT().getText().replace("\"", "").replace(" ", "");
            else
                str += element.getName();

            str += ")";

            processedElements.put(element, str);
        }

        values.put(ctx, processedElements);

    }

    @Override
    public void enterBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx) {

    }

    @Override
    public void exitBaseElement(SPARQLPatternsGrammarParser.BaseElementContext ctx) {

        ParserRuleContext childCtx = ctx.elementRole() != null ? ctx.elementRole()
                :  ctx.prefixedElementRole();

        Map<ActualPatternElement, String> elementValues = values.get(childCtx);
        Map<ActualPatternElement, String> processedElements = new HashMap<>();

        if(true /*ctx.tablePrefix()!=null*/){
            if(false /* ctx.tablePrefix().SQLTEXT()!=null*/){
                //String prefix=ctx.pretablePrefix().SQLTEXT().getText().replaceAll("\"", "");

                //for(ActualPatternElement val : elementValues.keySet())
                //	processedElements.put(val, helper.escapeIfReserved(prefix)+"."+elementValues.get(val));
            }
            else{//dynamic TABLEPREFIX

                String partOf;
                String elementName=ctx.elementRole() != null ? ctx.elementRole().ID().getText()
                        :  ctx.prefixedElementRole().elementRole().ID().getText();
                PatternElement element =PatternElement.getElementByName(elementName);

                for (ActualPatternElement elementVal : elementValues.keySet()){
                    partOf=elementVal.getAttribute("partOf");
/*
                    if(partOf!=null){
                        String tableprefix="fact";
                        for(PatternElement elemPartOf : element.getPartOf()){

                            ActualPatternElement partOfValue=instance.getElementValue(elemPartOf, partOf);

                            //Can only be contained in one elment, although it may be part of multiple relations
                            if (partOfValue!=null&&partOfValue instanceof PatternElementDimLevel) {
                                PatternElementDimLevel dimLvl = (PatternElementDimLevel) partOfValue;
                                if(dimLvl.getDimension().getImplementation()==DimensionImplementation.Star //check Star-Dimension
                                        &&!dimLvl.getIri().equalsIgnoreCase(elementVal.getIri())) //check ElementVal!= Joined DimensionLevel e.g. LevelRole
                                    tableprefix=helper.escapeIfReserved(dimLvl.getName());
                            }
                        }
                        processedElements.put(elementVal, tableprefix+"."+elementValues.get(elementVal));
                    }
                    else*/
                        processedElements.put(elementVal, elementValues.get(elementVal));
                }
            }
        }
        else
            processedElements=elementValues;

        values.put(ctx,processedElements);

    }

    @Override
    public void enterPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx) {

    }

    @Override
    public void exitPrefixedElementRole(SPARQLPatternsGrammarParser.PrefixedElementRoleContext ctx) {

        Map<ActualPatternElement, String> elements = values.get(ctx.elementRole());
        Map<ActualPatternElement, String> processedElements = new HashMap<>();
        String val;

        for (ActualPatternElement element : elements.keySet()){
            val=elements.get(element);
            processedElements.put(element,
                    ((ctx.VARAIBLEMARKER() != null)? "?":"")
                            + ctx.prefix().SPARQLTEXT().getText()
                            .replace("\"", "")
                            .replace(" ", "") + val );
        }

        values.put(ctx, processedElements);

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
        PatternElement element= PatternElement.getElementByName(elementName);

        List<ActualPatternElement> elementVals = ActualPatternElement.getElementList(element.getName());
        Map<ActualPatternElement, String> processedElements = new HashMap<>();

        if(elementVals!=null)//in Case of Only JoinElements in a NJList
            for (ActualPatternElement elementVal : elementVals){
                processedElements.put(elementVal, elementVal.getAttribute(attribute));
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

    private void addStringElement(ParserRuleContext ctx, String seperator) {
        Map<ActualPatternElement, String> elements = values.get(ctx);

        String klListSQL = createList(elements.values(), seperator);

        sparqlString += " " + klListSQL + " ";
    }

    private String createList(Collection<String> list, String seperator) {
        String listSQL = "";

        for (String entry : list)
            listSQL += entry + " " + seperator + " ";

        listSQL = listSQL.substring(0, listSQL.lastIndexOf(seperator));

        return listSQL;
    }
}
