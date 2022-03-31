package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class RegularStatement extends Item {

    public RegularStatement(Element element) {
        super(element);
    }

    public static RegularStatement buildRegularStatement(Element element) {
        switch (element.elements().get(0).getName()) {
            case ElementNames.DIFFUSE_STATEMENT:
                return new RegularStatementNow(element);
            case ElementNames.ITERATIVE_EQUALITY:
                return new IterativeEquality(element.element(ElementNames.ITERATIVE_EQUALITY));
            case ElementNames.PROPOSITION:
                return new RegularStatementProposition(element);
            default:
                Errors.error(element, "Missing Element in buildRegularStatement [" + element.elements().get(0).getName() + "]");
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
