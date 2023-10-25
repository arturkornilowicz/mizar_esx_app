package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ExistentialQuantifierFormula extends Formula {

    private VariableSegments variableSegments;
    private Scope scope;

    public ExistentialQuantifierFormula(Element element) {
        super(element);
        variableSegments = new VariableSegments(element.element(ESXElementName.VARIABLE_SEGMENTS));
        scope = new Scope(element.element(ESXElementName.SCOPE));
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
