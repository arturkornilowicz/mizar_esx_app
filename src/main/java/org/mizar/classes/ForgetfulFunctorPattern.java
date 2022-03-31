package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ForgetfulFunctorPattern extends XMLElement {

    private Loci loci;

    public ForgetfulFunctorPattern(Element element) {
        super(element);
        loci = new Loci(element.element(ElementNames.LOCI));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        loci.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
