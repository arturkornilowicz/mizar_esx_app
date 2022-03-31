package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CircumfixFunctorPattern extends FunctorPattern {

    private RightCircumflexSymbol rightCircumflexSymbol;
    private Loci loci;

    public CircumfixFunctorPattern(Element element) {
        super(element);
        rightCircumflexSymbol = new RightCircumflexSymbol(element.element(ElementNames.RIGHT_CIRCUMFLEX_SYMBOL));
        loci = new Loci(element.element(ElementNames.LOCI));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        rightCircumflexSymbol.run();
        loci.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
