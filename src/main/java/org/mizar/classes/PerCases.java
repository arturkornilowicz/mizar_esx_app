package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PerCases extends Item {

    private Justification justification;

    public PerCases(Element element) {
        super(element);
        justification = Justification.buildJustification(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
