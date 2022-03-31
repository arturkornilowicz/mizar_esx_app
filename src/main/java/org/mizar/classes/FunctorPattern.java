package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class FunctorPattern extends Pattern {

    public FunctorPattern(Element element) {
        super(element);
    }

    public static FunctorPattern buildFunctorPattern(Element element) {
        switch (element.getName()) {
            case ElementNames.CIRCUMFIXFUNCTOR_PATTERN:
                return new CircumfixFunctorPattern(element);
            case ElementNames.INFIXFUNCTOR_PATTERN:
                return new InfixFunctorPattern(element);
            default:
                Errors.error(element, "Missing Element in buildFunctorPattern [" + element.getName() + "]");
                return null;
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
