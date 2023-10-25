package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ExemplificationKind extends Item {

    public ExemplificationKind(Element element) {
        super(element);
    }

    public static ExemplificationKind buildExemplificationKind(Element element) {
        switch (element.getName()) {
            case ESXElementName.EXAMPLE:
                return new Example(element);
            case ESXElementName.EXEMPLIFYINGVARIABLE:
                return new ExemplifyingVariable(element);
            case ESXElementName.IMPLICITEXEMPLIFICATION:
                return new ImplicitExemplification(element);
            default:
                Errors.error(element, "Missing Element in buildExemplificationKind [" + element.getName() + "]");
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
