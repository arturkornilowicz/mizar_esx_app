package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ExistentialAssumption extends Item {

    private QualifiedSegments qualifiedSegments;
    private Conditions conditions;

    public ExistentialAssumption(Element element) {
        super(element);
        qualifiedSegments = new QualifiedSegments(element.element(ElementNames.QUALIFIED_SEGMENTS));
        conditions = new Conditions(element.element(ElementNames.CONDITIONS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        qualifiedSegments.run();
        conditions.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
