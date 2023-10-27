package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class CircumfixTerm extends TermWithArguments {

    private RightCircumflexSymbol rightCircumflexSymbol;

    public CircumfixTerm(Element element) {
        super(element);
        rightCircumflexSymbol = new RightCircumflexSymbol(element.element(ESXElementName.RIGHT_CIRCUMFLEX_SYMBOL));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        super.process();
        rightCircumflexSymbol.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
