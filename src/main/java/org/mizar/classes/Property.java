package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Property extends Item {

    private Properties properties;
    private Justification justification;

    public Property(Element element) {
        super(element);
        properties = new Properties(element.element(ElementNames.PROPERTIES));
        justification = Justification.buildJustification(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        properties.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
