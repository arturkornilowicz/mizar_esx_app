package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Conditions extends XMLElement {

    private List<Proposition> propositions = new LinkedList<>();

    public Conditions(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.PROPOSITION)) {
            propositions.add(new Proposition(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Proposition proposition: propositions) {
            proposition.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
