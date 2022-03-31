package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class RightSideOfRelationFormula extends Formula {

    private Arguments arguments;

    public RightSideOfRelationFormula(Element element) {
        super(element);
        arguments = new Arguments(element.element(ElementNames.ARGUMENTS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        arguments.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
