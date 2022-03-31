package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ExistentialQuantifierFormula extends Formula {

    private VariableSegments variableSegments;
    private Scope scope;

    public ExistentialQuantifierFormula(Element element) {
        super(element);
        variableSegments = new VariableSegments(element.element(ElementNames.VARIABLE_SEGMENTS));
        scope = new Scope(element.element(ElementNames.SCOPE));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variableSegments.run();
        scope.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
