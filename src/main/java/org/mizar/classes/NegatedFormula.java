package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class NegatedFormula extends Formula {

    private Formula formula;

    public NegatedFormula(Element element) {
        super(element);
        formula = Formula.buildFormula(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        formula.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
