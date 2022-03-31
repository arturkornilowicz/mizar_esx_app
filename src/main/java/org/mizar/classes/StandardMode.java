package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class StandardMode extends ModePatternKind {

    private TypeSpecification typeSpecification;
    private Definiens definiens;

    public StandardMode(Element element) {
        super(element);
        if (element.element(ElementNames.TYPE_SPECIFICATION) != null) {
            typeSpecification = new TypeSpecification(element.element(ElementNames.TYPE_SPECIFICATION));
        }
        if (element.element(ElementNames.DEFINIENS) != null) {
            definiens = Definiens.buildDefiniens(element.element(ElementNames.DEFINIENS));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        if (typeSpecification != null) {
            typeSpecification.run();
        }
        if (definiens != null) {
            definiens.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
