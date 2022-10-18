package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActualPatternElement {

    String name;

    String iri;

    Map<String, String> attrs = new HashMap<>();
    public ActualPatternElement(Map<String, String> attrs) {
        this.attrs = attrs;
    }

    public ActualPatternElement() {

    }

    public static ActualPatternElement create(String name){
        return new ActualPatternElement(name);
    }

    public  ActualPatternElement (String name){
        this.name = name;
    }

    public String getIri() {
        return iri;
    }

    private  static final List<ActualPatternElement> ELEMENTS_LIST;

    static {
        ELEMENTS_LIST = new ArrayList<>();

        ELEMENTS_LIST.add(ActualPatternElement.create("migAsylumApps"));
        ELEMENTS_LIST.add(ActualPatternElement.create("deltaSumOfNumOfApps"));
        ELEMENTS_LIST.add(ActualPatternElement.create("deltaSumOfNumOfApps"));
        ELEMENTS_LIST.add(ActualPatternElement.create("geo"));
        ELEMENTS_LIST.add(ActualPatternElement.create("citizen"));
        ELEMENTS_LIST.add(ActualPatternElement.create("refPeriod"));
        ELEMENTS_LIST.add(ActualPatternElement.create("sumOfNumberOfApplications"));
        ELEMENTS_LIST.add(ActualPatternElement.create("dateFrom2014"));
        ELEMENTS_LIST.add(ActualPatternElement.create("Germany"));
        ELEMENTS_LIST.add(ActualPatternElement.create("UK"));

    }

    public ActualPatternElement setIri(String iri) {
        this.iri = iri;
        return this;
    }

    public String getName() {
        return name;
    }

    public ActualPatternElement setName(String name) {
        this.name = name;
        return this;
    }

    public ActualPatternElement setAttrName(String value){
        attrs.put("name", value);
        return this;
    }

    public ActualPatternElement setAttrVar(String value){
        attrs.put("var", value);
        return this;
    }

    public ActualPatternElement setAttrPath(String value){
        attrs.put("path", value);
        return this;
    }


    public static List<ActualPatternElement> getElementList(String name){
        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).collect(Collectors.toList());
    }

    public String getAttribute(String attrName){
        return attrs.get(attrName);
    }

}
