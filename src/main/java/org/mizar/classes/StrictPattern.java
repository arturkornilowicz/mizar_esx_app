package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class StrictPattern extends XMLElement {

    private Locus locus;
    private Loci loci;

    public StrictPattern(Element element) {
        super(element);
        locus = new Locus(element.element(ElementNames.LOCUS));
        loci = new Loci(element.element(ElementNames.LOCI));
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
