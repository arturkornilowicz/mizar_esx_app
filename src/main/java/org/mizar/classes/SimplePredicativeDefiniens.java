package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class SimplePredicativeDefiniens extends Definiens {

    private Label label;
    private Formula formula;

    public SimplePredicativeDefiniens(Element element) {
        super(element);
        label = new Label(element.element(ESXElementName.LABEL));
        formula = Formula.buildFormula(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        label.run();
        formula.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
