package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ImplicitlyQualifiedSegment extends QualifiedSegment {

    private Variable variable;
    private ReservedDscrType reservedDscrType;

    public ImplicitlyQualifiedSegment(Element element) {
        super(element);
        variable = new Variable(element.element(ElementNames.VARIABLE));
        reservedDscrType = new ReservedDscrType(element.element(ElementNames.RESERVEDDSCR_TYPE));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variable.run();
        reservedDscrType.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
