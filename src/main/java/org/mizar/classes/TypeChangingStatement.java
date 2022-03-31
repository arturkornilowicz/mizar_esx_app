package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class TypeChangingStatement extends Item {

    private EqualitiesList equalitiesList;
    private Type type;
    private Justification justification;

    public TypeChangingStatement(Element element) {
        super(element);
        equalitiesList = new EqualitiesList(element.element(ElementNames.EQUALITIES_LIST));
        type = Type.buildType(element.elements().get(1));
        justification = Justification.buildJustification(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        equalitiesList.run();
        type.run();
        justification.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
