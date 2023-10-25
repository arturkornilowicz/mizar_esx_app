package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ChoiceStatement extends Item {

    private QualifiedSegments qualifiedSegments;
    private Conditions conditions;
    private Justification justification;

    public ChoiceStatement(Element element) {
        super(element);
        qualifiedSegments = new QualifiedSegments(element.element(ESXElementName.QUALIFIED_SEGMENTS));
        conditions = new Conditions(element.element(ESXElementName.CONDITIONS));
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
