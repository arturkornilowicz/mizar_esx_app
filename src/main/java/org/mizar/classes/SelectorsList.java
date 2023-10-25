package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class SelectorsList extends XMLElement {

    private List<SelectorFunctorPattern> selectorFunctorPatterns = new LinkedList<>();

    public SelectorsList(Element element) {
        super(element);
        for (Element element1: element.elements(ESXElementName.SELECTORFUNCTOR_PATTERN)) {
            selectorFunctorPatterns.add(new SelectorFunctorPattern(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (SelectorFunctorPattern selectorFunctorPattern: selectorFunctorPatterns) {
            selectorFunctorPattern.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
