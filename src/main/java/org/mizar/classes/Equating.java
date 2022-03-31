package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Equating extends XMLElement {

    private Variable variable;
    private Term term;

    public Equating(Element element) {
        super(element);
        variable = new Variable(element.element(ElementNames.VARIABLE));
        term = Term.buildTerm(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variable.run();
        term.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
