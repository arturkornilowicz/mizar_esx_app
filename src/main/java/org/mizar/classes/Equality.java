package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Equality extends EqualityKind {

    private Variable variable;
    private Term term;

    public Equality(Element element) {
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
