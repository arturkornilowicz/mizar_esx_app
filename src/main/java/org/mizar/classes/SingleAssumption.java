package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class SingleAssumption extends Assumption {

    private Proposition proposition;

    public SingleAssumption(Element element) {
        super(element);
        proposition = new Proposition(element.element(ElementNames.PROPOSITION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        proposition.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
