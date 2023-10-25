package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Correctness extends Item {

    private CorrectnessConditions correctnessConditions;
    private Justification justification;

    public Correctness(Element element) {
        super(element);
        correctnessConditions = new CorrectnessConditions(element.element(ESXElementName.CORRECTNESS_CONDITIONS));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        correctnessConditions.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
