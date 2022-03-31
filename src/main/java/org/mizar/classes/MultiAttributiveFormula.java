package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class MultiAttributiveFormula extends Formula {

    private Term term;
    private AdjectiveCluster adjectiveCluster;

    public MultiAttributiveFormula(Element element) {
        super(element);
        term = Term.buildTerm(element.elements().get(0));
        adjectiveCluster = new AdjectiveCluster(element.element(ElementNames.ADJECTIVE_CLUSTER));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        term.run();
        adjectiveCluster.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
