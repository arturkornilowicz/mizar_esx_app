package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PartialPredicativeDefiniens extends PartialDefiniens {

    private Formula formula;
    private Formula guard;

    public PartialPredicativeDefiniens(Element element) {
        super(element);
        formula = Formula.buildFormula(element.elements().get(0));
        guard = Formula.buildFormula(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        formula.run();
        guard.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
