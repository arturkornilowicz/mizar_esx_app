package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CorrectnessConditions extends XMLElement {

    private List<CorrectnessConditionKind> correctnessConditionKinds = new LinkedList<>();

    public CorrectnessConditions(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            correctnessConditionKinds.add(CorrectnessConditionKind.buildCorrectnessConditionKind(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (CorrectnessConditionKind correctnessConditionKind: correctnessConditionKinds) {
            correctnessConditionKind.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
