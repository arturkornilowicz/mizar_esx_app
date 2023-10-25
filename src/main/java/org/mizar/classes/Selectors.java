package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Selectors extends XMLElement {

    private List<Selector> selectors = new LinkedList<>();

    public Selectors(Element element) {
        super(element);
        for (Element element1: element.elements(ESXElementName.SELECTOR)) {
            selectors.add(new Selector(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Selector selector: selectors) {
            selector.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
