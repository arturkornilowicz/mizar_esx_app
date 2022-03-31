package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Generalization extends Item {

    private QualifiedSegments qualifiedSegments;
    private Conditions conditions;

    public Generalization(Element element) {
        super(element);
        qualifiedSegments = new QualifiedSegments(element.element(ElementNames.QUALIFIED_SEGMENTS));
        if (element.element(ElementNames.CONDITIONS) != null) {
            conditions = new Conditions(element.element(ElementNames.CONDITIONS));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        qualifiedSegments.run();
        if (conditions != null) {
            conditions.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
