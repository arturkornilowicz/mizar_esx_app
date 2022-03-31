package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Properties extends XMLElement {

    private Type type;

    public Properties(Element element) {
        super(element);
        if (element.elements().size() > 0) {
            type = Type.buildType(element.elements().get(0));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        if (type != null) {
            type.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
