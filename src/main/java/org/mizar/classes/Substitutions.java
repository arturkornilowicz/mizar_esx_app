package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Substitutions extends XMLElement {

    private List<Substitution> substitutions = new LinkedList<>();

    public Substitutions(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.SUBSTITUTION)) {
            substitutions.add(new Substitution(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Substitution substitution: substitutions) {
            substitution.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
