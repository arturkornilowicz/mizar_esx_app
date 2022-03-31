package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Pattern extends XMLElement {

    public Pattern(Element element) {
        super(element);
    }

    public static Pattern buildPattern(Element element) {
        switch (element.getName()) {
            case ElementNames.ATTRIBUTE_PATTERN:
                return new AttributePattern(element);
            case ElementNames.CIRCUMFIXFUNCTOR_PATTERN:
                return new CircumfixFunctorPattern(element);
            case ElementNames.INFIXFUNCTOR_PATTERN:
                return new InfixFunctorPattern(element);
            case ElementNames.MODE_PATTERN:
                return new ModePattern(element);
            case ElementNames.PREDICATE_PATTERN:
                return new PredicatePattern(element);
            default:
                Errors.error(element, "Missing Element in buildPattern [" + element.getName() + "]");
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
