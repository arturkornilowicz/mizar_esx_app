package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PrivatePredicateDefinition extends Item {

    private Variable variable;
    private TypeList typeList;
    private Formula formula;

    public PrivatePredicateDefinition(Element element) {
        super(element);
        variable = new Variable(element.element(ElementNames.VARIABLE));
        typeList = new TypeList(element.element(ElementNames.TYPE_LIST));
        formula = Formula.buildFormula(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        variable.run();
        typeList.run();
        formula.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
