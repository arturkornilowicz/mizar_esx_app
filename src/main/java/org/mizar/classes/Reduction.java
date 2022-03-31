package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Reduction extends Item {

    private Term term1;
    private Term term2;

    public Reduction(Element element) {
        super(element);
        term1 = Term.buildTerm(element.elements().get(0));
        term2 = Term.buildTerm(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        term1.run();
        term2.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
