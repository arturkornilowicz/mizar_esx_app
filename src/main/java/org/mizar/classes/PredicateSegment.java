package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class PredicateSegment extends SchematicVariableSegment {

    private Variables variables;
    private TypeList typeList;

    public PredicateSegment(Element element) {
        super(element);
        variables = new Variables(element.element(ESXElementName.VARIABLES));
        typeList = new TypeList(element.element(ESXElementName.TYPE_LIST));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variables.run();
        typeList.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
