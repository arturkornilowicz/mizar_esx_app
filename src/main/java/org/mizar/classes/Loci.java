package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Loci extends XMLElement {

    private List<Locus> loci = new LinkedList<>();

    public Loci(Element element) {
        super(element);
        for (Element element1: element.elements(ESXElementName.LOCUS)) {
            loci.add(new Locus(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Locus locus: loci) {
            locus.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
