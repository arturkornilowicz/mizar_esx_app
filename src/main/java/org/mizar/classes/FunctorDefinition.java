package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class FunctorDefinition extends Definition {

    private TypeSpecification typeSpecification;

    public FunctorDefinition(Element element) {
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
        getRedefine().run();
        getPattern().run();
        if (typeSpecification != null) {
            typeSpecification.run();
        }
        if (getDefiniens() != null) {
            getDefiniens().run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
