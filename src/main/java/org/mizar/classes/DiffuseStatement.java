package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class DiffuseStatement extends XMLElement {

    private Label label;

    public DiffuseStatement(Element element) {
        super(element);
        label = new Label(element.element(ESXElementName.LABEL));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        label.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
