package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActualPatternElement {

    String name;

    String iri;

    public String getIri() {
        return iri;
    }

    public void setIri(String iri) {
        this.iri = iri;
    }

    private  static final List<ActualPatternElement> ELEMENTS_LIST;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        ELEMENTS_LIST = new ArrayList<>();
        ELEMENTS_LIST.add(new ActualPatternElement());
    }

    public static List<ActualPatternElement> getElementList(String name){
        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).collect(Collectors.toList());
    }

    Map<String, String> attrs = new HashMap<>();

    public String getAttribute(String attrName){
        return attrs.get(attrName);
    }

    public ActualPatternElement(Map<String, String> attrs) {
        this.attrs = attrs;
    }


    public ActualPatternElement() {

    }
}
