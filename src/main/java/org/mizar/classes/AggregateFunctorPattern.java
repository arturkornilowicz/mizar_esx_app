package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class AggregateFunctorPattern extends XMLElement {

    private Loci loci;

    public AggregateFunctorPattern(Element element) {
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
