package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FunctorSegment extends SchematicVariableSegment {

    private Variables variables;
    private TypeList typeList;
    private TypeSpecification typeSpecification;

    public FunctorSegment(Element element) {
        super(element);
        variables = new Variables(element.element(ElementNames.VARIABLES));
        typeList = new TypeList(element.element(ElementNames.TYPE_LIST));
        typeSpecification = new TypeSpecification(element.element(ElementNames.TYPE_SPECIFICATION));
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
