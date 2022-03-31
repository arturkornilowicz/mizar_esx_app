package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class SimpleEquationalDefiniens extends Definiens {

    private Label label;
    private Term term;

    public SimpleEquationalDefiniens(Element element) {
        super(element);
        label = new Label(element.element(ElementNames.LABEL));
        term = Term.buildTerm(element.elements().get(1));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        label.run();
        term.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
