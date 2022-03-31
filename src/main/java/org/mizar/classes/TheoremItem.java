package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class TheoremItem extends Item {

    private Proposition proposition;
    private Justification justification;

    public TheoremItem(Element element) {
        super(element);
        proposition = new Proposition(element.element(ElementNames.PROPOSITION));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        proposition.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
