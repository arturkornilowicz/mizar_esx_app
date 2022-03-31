package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class IterativeStepsList extends XMLElement {

    private List<IterativeStep> iterativeSteps = new LinkedList<>();

    public IterativeStepsList(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.ITERATIVE_STEP)) {
            iterativeSteps.add(new IterativeStep(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (IterativeStep iterativeStep: iterativeSteps) {
            iterativeStep.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
