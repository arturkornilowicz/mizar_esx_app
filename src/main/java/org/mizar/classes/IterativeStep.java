package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class IterativeStep extends XMLElement {

    private Term term;
    private Justification justification;

    public IterativeStep(Element element) {
        super(element);
        term = Term.buildTerm(element.elements().get(0));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        term.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
