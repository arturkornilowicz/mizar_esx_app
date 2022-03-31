package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class VariableSegments extends XMLElement {

    private List<QualifiedSegment> segments = new LinkedList<>();

    public VariableSegments(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            segments.add(QualifiedSegment.buildQualifiedSegment(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (QualifiedSegment segment: segments) {
            segment.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
