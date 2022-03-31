package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ComplexDefiniens extends Definiens {

    private Label label;
    private PartialDefiniensList partialDefiniensList;
    private Otherwise otherwise;

    public ComplexDefiniens(Element element) {
        super(element);
        label = new Label(element.element(ElementNames.LABEL));
        partialDefiniensList = new PartialDefiniensList(element.element(ElementNames.PARTIAL_DEFINIENS_LIST));
        otherwise = Otherwise.buildOtherwise(element.element(ElementNames.OTHERWISE));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        label.run();
        partialDefiniensList.run();
        otherwise.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
