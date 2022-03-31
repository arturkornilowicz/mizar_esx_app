package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Variables extends XMLElement {

    private List<Variable> variables = new LinkedList<>();

    public Variables(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.VARIABLE)) {
            variables.add(new Variable(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Variable variable: variables) {
            variable.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
