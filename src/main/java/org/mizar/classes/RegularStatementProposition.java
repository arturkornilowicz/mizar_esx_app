package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class RegularStatementProposition extends RegularStatement {

    private Proposition proposition;
    private Justification justification;

    public RegularStatementProposition(Element element) {
        super(element);
        proposition = new Proposition(element.element(ESXElementName.PROPOSITION));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        proposition.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
