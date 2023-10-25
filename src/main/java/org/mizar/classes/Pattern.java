package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Pattern extends XMLElement {

    public Pattern(Element element) {
        super(element);
    }

    public static Pattern buildPattern(Element element) {
        switch (element.getName()) {
            case ESXElementName.ATTRIBUTE_PATTERN:
                return new AttributePattern(element);
            case ESXElementName.CIRCUMFIXFUNCTOR_PATTERN:
                return new CircumfixFunctorPattern(element);
            case ESXElementName.INFIXFUNCTOR_PATTERN:
                return new InfixFunctorPattern(element);
            case ESXElementName.MODE_PATTERN:
                return new ModePattern(element);
            case ESXElementName.PREDICATE_PATTERN:
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
