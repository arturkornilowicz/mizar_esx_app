package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class StandardMode extends ModePatternKind {

    private TypeSpecification typeSpecification;

    public StandardMode(Element element) {
        super(element);
        if (element.element(ESXElementName.TYPE_SPECIFICATION) != null) {
            typeSpecification = new TypeSpecification(element.element(ESXElementName.TYPE_SPECIFICATION));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        if (typeSpecification != null) {
            typeSpecification.run();
        }
    }

    @Override
    public void postProcess() { super.postProcess(); }
}
