package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ReservedDscrType extends XMLElement {

    private Substitutions substitutions;
    private Type type;

    public ReservedDscrType(Element element) {
        super(element);
        substitutions = new Substitutions(element.element(ESXElementName.SUBSTITUTIONS));
        type = Type.buildType(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        substitutions.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
