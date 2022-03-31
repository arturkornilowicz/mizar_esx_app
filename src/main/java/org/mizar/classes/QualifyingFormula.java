package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class QualifyingFormula extends Formula {

    private Term term;
    private Type type;

    public QualifyingFormula(Element element) {
        super(element);
        term = Term.buildTerm(element.elements().get(0));
        type = Type.buildType(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        term.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
