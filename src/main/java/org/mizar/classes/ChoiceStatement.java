package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ChoiceStatement extends Item {

    private QualifiedSegments qualifiedSegments;
    private Conditions conditions;
    private Justification justification;

    public ChoiceStatement(Element element) {
        super(element);
        qualifiedSegments = new QualifiedSegments(element.element(ElementNames.QUALIFIED_SEGMENTS));
        conditions = new Conditions(element.element(ElementNames.CONDITIONS));
        justification = Justification.buildJustification(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        qualifiedSegments.run();
        conditions.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
