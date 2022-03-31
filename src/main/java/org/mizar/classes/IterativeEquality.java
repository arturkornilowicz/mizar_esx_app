package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class IterativeEquality extends RegularStatement {

    private Label label;
    private RelationFormula relationFormula;
    private Justification justification;
    private IterativeStepsList iterativeStepsList;

    public IterativeEquality(Element element) {
        super(element);
        label = new Label(element.element(ElementNames.LABEL));
        relationFormula = new RelationFormula(element.element(ElementNames.RELATION_FORMULA));
        justification = Justification.buildJustification(element.elements().get(2));
        iterativeStepsList = new IterativeStepsList(element.element(ElementNames.ITERATIVE_STEPS_LIST));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        label.run();
        relationFormula.run();
        justification.run();
        iterativeStepsList.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
