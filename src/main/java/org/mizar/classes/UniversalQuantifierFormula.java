package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class UniversalQuantifierFormula extends Formula {

    private VariableSegments variableSegments;
    private Restriction restriction;
    private Scope scope;

    public UniversalQuantifierFormula(Element element) {
        super(element);
        variableSegments = new VariableSegments(element.element(ElementNames.VARIABLE_SEGMENTS));
        if (element.element(ElementNames.RESTRICTION) != null) {
            restriction = new Restriction(element.element(ElementNames.RESTRICTION));
        }
        scope = new Scope(element.element(ElementNames.SCOPE));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variableSegments.run();
        if (restriction != null) {
            restriction.run();
        }
        scope.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
