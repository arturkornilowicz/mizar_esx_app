package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class SchemeJustification extends Justification {

    private List<Reference> references = new LinkedList<>();

    public SchemeJustification(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            references.add(Reference.buildReference(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Reference reference: references) {
            reference.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
