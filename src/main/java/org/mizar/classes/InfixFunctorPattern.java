package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class InfixFunctorPattern extends FunctorPattern {

    private Loci leftLoci;
    private Loci rightLoci;

    public InfixFunctorPattern(Element element) {
        super(element);
        leftLoci = new Loci(element.elements(ElementNames.LOCI).get(0));
        rightLoci = new Loci(element.elements(ElementNames.LOCI).get(1));
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
