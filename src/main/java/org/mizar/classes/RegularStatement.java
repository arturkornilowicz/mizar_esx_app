package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class RegularStatement extends Item {

    public RegularStatement(Element element) {
        super(element);
    }

    public static RegularStatement buildRegularStatement(Element element) {
        switch (element.elements().get(0).getName()) {
            case ESXElementName.DIFFUSE_STATEMENT:
                return new RegularStatementNow(element);
            case ESXElementName.ITERATIVE_EQUALITY:
                return new IterativeEquality(element.element(ESXElementName.ITERATIVE_EQUALITY));
            case ESXElementName.PROPOSITION:
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
