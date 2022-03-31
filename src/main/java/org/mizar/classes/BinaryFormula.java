package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class BinaryFormula extends Formula {

    private Formula formula1;
    private Formula formula2;

    public BinaryFormula(Element element) {
        super(element);
        formula1 = Formula.buildFormula(element.elements().get(0));
        formula2 = Formula.buildFormula(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        formula1.run();
        formula2.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
