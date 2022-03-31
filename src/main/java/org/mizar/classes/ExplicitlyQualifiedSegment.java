package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ExplicitlyQualifiedSegment extends QualifiedSegment {

    private Variables variables;
    private Type type;

    public ExplicitlyQualifiedSegment(Element element) {
        super(element);
        variables = new Variables(element.element(ElementNames.VARIABLES));
        type = Type.buildType(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variables.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
