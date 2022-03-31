package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CorrectnessCondition extends Item {

    private CorrectnessConditionKind correctnessConditionKind;
    private Justification justification;

    public CorrectnessCondition(Element element) {
        super(element);
        correctnessConditionKind = CorrectnessConditionKind.buildCorrectnessConditionKind(element.elements().get(0));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        correctnessConditionKind.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
