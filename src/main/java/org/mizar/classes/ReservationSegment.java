package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ReservationSegment extends XMLElement {

    private Variables variables;
    private VariableSegments variableSegments;
    private Type type;

    public ReservationSegment(Element element) {
        super(element);
        variables = new Variables(element.element(ESXElementName.VARIABLES));
        variableSegments = new VariableSegments(element.element(ESXElementName.VARIABLE_SEGMENTS));
        type = Type.buildType(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variables.run();
        variableSegments.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
