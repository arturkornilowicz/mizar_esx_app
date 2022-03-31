package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PropertyRegistration extends Item {

    private Properties properties;
    private Justification justification;

    public PropertyRegistration(Element element) {
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
