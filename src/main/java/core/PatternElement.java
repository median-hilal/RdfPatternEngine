package core;

import java.util.ArrayList;
import java.util.List;

public class PatternElement {

    private  static final List<PatternElement> ELEMENTS_LIST;
    static {
        ELEMENTS_LIST = new ArrayList<>();
        ELEMENTS_LIST.add(new PatternElement("measure"));
    }

    public static PatternElement getElementByName(String name){
        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).findAny().orElse(null);
    }
    String name;

    public PatternElement(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
