package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class DefaultGeneralization extends Item {

    private QualifiedSegments qualifiedSegments;

    public DefaultGeneralization(Element element) {
        super(element);
        qualifiedSegments = new QualifiedSegments(element.element(ElementNames.QUALIFIED_SEGMENTS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        qualifiedSegments.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
