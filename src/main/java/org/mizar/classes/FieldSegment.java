package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FieldSegment extends XMLElement {

    private Selectors selectors;
    private Type type;

    public FieldSegment(Element element) {
        super(element);
        selectors = new Selectors(element.element(ElementNames.SELECTORS));
        type = Type.buildType(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        selectors.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
