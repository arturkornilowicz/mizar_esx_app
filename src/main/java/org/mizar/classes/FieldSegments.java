package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FieldSegments extends XMLElement {

    private List<FieldSegment> segments = new LinkedList<>();

    public FieldSegments(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.FIELD_SEGMENT)) {
            segments.add(new FieldSegment(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (FieldSegment fieldSegment: segments) {
            fieldSegment.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
