package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CaseHead extends Item {

    private Assumption assumption;

    public CaseHead(Element element) {
        super(element);
        assumption = Assumption.buildAssumption(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        assumption.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
