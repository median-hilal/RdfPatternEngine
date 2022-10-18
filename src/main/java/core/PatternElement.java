package core;

import java.util.ArrayList;
import java.util.List;

public class PatternElement {

    String name;

    public PatternElement(String name) {
        this.name = name;
    }

    private  static final List<PatternElement> ELEMENTS_LIST;
    static {
        ELEMENTS_LIST = new ArrayList<>();

        ELEMENTS_LIST.add(new PatternElement("measure"));
        ELEMENTS_LIST.add(new PatternElement("fact"));
        ELEMENTS_LIST.add(new PatternElement("dimension"));
        ELEMENTS_LIST.add(new PatternElement("dimensionLevel"));
        ELEMENTS_LIST.add(new PatternElement("siSlice"));
        ELEMENTS_LIST.add(new PatternElement("scSlice"));
        ELEMENTS_LIST.add(new PatternElement("sharedSlice"));
        ELEMENTS_LIST.add(new PatternElement("baseSlice"));
        ELEMENTS_LIST.add(new PatternElement("compMeasure"));
        ELEMENTS_LIST.add(new PatternElement("compHaving"));
    }

    public static PatternElement getElementByName(String name){

        String s = "\"SELECT * WHERE{\" \"{ SELECT \" !SL !VM \"SI_\" !+ <dimensionLevel.name>  !SL  \" \" !SL !VM \"SI_\" !+  <measure.name>  !SL \" \" !SL !VM \"SC_\" !+ <measure.name>  !SL \" \" !SL ![ <compMeasure.expression> AS !VM \"\" !+ <compMeasure.name>  !] !SL \" WHERE { { SELECT\" !SL ![ <dimensionLevel.var> AS !VM \"SI_\" !+ <dimensionLevel.name> !] !SL \" \" !SL ![ <measure.expression> AS !VM \"SI_\" !+ <measure.name> !] !SL \"WHERE { \" !DL <measure.path> !DL  !DL <dimension.path> !DL !FL <siSlice.expression> !FL  !FL <sharedSlice.expression> !FL  \"} GROUP BY\" !SL <dimensionLevel.var> !SL \" }\" \" { SELECT\" !SL ![<dimensionLevel.var> AS !VM \"SC_\" !+ <dimensionLevel.name> !] !SL \" \" !SL ![ <measure.expression> AS !VM \"SC_\"!+ <measure.name> !] !SL \"WHERE { \" !DL <measure.path> !DL !DL  <dimension.path> !DL  !FL <scSlice.expression> !FL !FL <sharedSlice.expression> !FL  \"} GROUP BY\" !SL <dimensionLevel.var> !SL \" }\" !JFL !VM \"SI_\" !+ <dimensionLevel.name> = !VM \"SC_\"  !+ <dimensionLevel.name> !JFL \" \" \" } } \" !FL <compHaving.expression> !FL \" }\"";

        return ELEMENTS_LIST.stream().filter(elem -> elem.getName().equals(name)).findAny().orElse(null);
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
