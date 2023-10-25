package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ConstantDefinition extends Item {

    private List<Equating> equatings = new LinkedList<>();

    public ConstantDefinition(Element element) {
        super(element);
        for (Element element1: element.elements(ESXElementName.EQUATING)) {
            equatings.add(new Equating(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Equating equating: equatings) {
            equating.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
