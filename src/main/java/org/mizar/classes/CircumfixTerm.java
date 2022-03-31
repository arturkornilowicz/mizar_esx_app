package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CircumfixTerm extends Term {

    private RightCircumflexSymbol rightCircumflexSymbol;
    private Arguments arguments;

    public CircumfixTerm(Element element) {
        super(element);
        rightCircumflexSymbol = new RightCircumflexSymbol(element.element(ElementNames.RIGHT_CIRCUMFLEX_SYMBOL));
        arguments = new Arguments(element.element(ElementNames.ARGUMENTS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        rightCircumflexSymbol.run();
        arguments.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
