package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class PredicatePattern extends Pattern {

    private Loci leftLoci;
    private Loci rightLoci;

    public PredicatePattern(Element element) {
        super(element);
        leftLoci = new Loci(element.elements(ESXElementName.LOCI).get(0));
        rightLoci = new Loci(element.elements(ESXElementName.LOCI).get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        leftLoci.run();
        rightLoci.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
