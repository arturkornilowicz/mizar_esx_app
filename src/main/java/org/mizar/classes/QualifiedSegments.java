package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class QualifiedSegments extends XMLElement {

    private List<QualifiedSegment> qualifiedSegments = new LinkedList<>();

    public QualifiedSegments(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            qualifiedSegments.add(QualifiedSegment.buildQualifiedSegment(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (QualifiedSegment qualifiedSegment: qualifiedSegments) {
            qualifiedSegment.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
