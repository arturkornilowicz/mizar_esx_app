package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PartialDefiniensList extends XMLElement {

    private List<PartialDefiniens> partialDefiniensList = new LinkedList<>();

    public PartialDefiniensList(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.PARTIAL_DEFINIENS)) {
            partialDefiniensList.add(PartialDefiniens.buildPartialDefiniens(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (PartialDefiniens partialDefiniens: partialDefiniensList) {
            partialDefiniens.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
