package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class LociEqualities extends XMLElement {

    private List<LociEquality> lociEqualities = new LinkedList<>();

    public LociEqualities(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.LOCI_EQUALITY)) {
            lociEqualities.add(new LociEquality(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (LociEquality lociEquality: lociEqualities) {
            lociEquality.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
