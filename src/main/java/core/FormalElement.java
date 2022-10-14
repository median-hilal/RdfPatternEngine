package core;

import java.util.ArrayList;
import java.util.List;

public class FormalElement {

    private  static final List<FormalElement> ELEMENTS_LIST;
    static {
        ELEMENTS_LIST = new ArrayList<>();
        ELEMENTS_LIST.add(new FormalElement("measure"));
    }

    public static FormalElement getFormalElementByName(String name){
        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).findAny().orElse(null);
    }
    String name;

    public FormalElement(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
