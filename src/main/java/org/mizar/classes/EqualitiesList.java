package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class EqualitiesList extends XMLElement {

    private List<EqualityKind> equalities = new LinkedList<>();

    public EqualitiesList(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            equalities.add(Equality.buildEqualityKind(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (EqualityKind equalityKind: equalities) {
            equalityKind.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
