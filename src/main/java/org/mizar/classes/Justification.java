package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Justification extends XMLElement {

    public Justification(Element element) {
        super(element);
    }

    public static Justification buildJustification(Element element) {
        switch (element.getName()) {
            case ESXElementName.BLOCK:
                return new ProofJustification(element);
            case ESXElementName.SCHEME_JUSTIFICATION:
                return new SchemeJustification(element);
            case ESXElementName.STRAIGHTFORWARD_JUSTIFICATION:
                return new StraightforwardJustification(element);
            default:
                Errors.error(element, "Missing Element in buildJustification [" + element.getName() + "]");
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
