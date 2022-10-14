package core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ActualElement {

    String name;

    private  static final List<ActualElement> ELEMENTS_LIST;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    static {
        ELEMENTS_LIST = new ArrayList<>();
        ELEMENTS_LIST.add(new ActualElement());
    }

    public static List<ActualElement> getActualElemenstByName(String name){
        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).collect(Collectors.toList());
    }

    Map<String, String> attrs = new HashMap<>();

    public String getAttr(String attrName){
        return attrs.get(attrName);
    }

    public ActualElement(Map<String, String> attrs) {
        this.attrs = attrs;
    }


    public ActualElement() {

    }
}
