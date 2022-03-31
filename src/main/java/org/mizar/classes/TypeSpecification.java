package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class TypeSpecification extends XMLElement {

    private Type type;

    public TypeSpecification(Element element) {
        super(element);
        type = Type.buildType(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
