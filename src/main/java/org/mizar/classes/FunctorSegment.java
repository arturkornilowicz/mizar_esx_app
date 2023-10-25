package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class FunctorSegment extends SchematicVariableSegment {

    private Variables variables;
    private TypeList typeList;
    private TypeSpecification typeSpecification;

    public FunctorSegment(Element element) {
        super(element);
        variables = new Variables(element.element(ESXElementName.VARIABLES));
        typeList = new TypeList(element.element(ESXElementName.TYPE_LIST));
        typeSpecification = new TypeSpecification(element.element(ESXElementName.TYPE_SPECIFICATION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variables.run();
        typeList.run();
        typeSpecification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
