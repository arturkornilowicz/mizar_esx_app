package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class StrictPattern extends XMLElement {

    private Locus locus;
    private Loci loci;

    public StrictPattern(Element element) {
        super(element);
        locus = new Locus(element.element(ESXElementName.LOCUS));
        loci = new Loci(element.element(ESXElementName.LOCI));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        locus.run();
        loci.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
