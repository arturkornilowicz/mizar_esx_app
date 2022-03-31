package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FunctorDefinition extends Item {

    private Redefine redefine;
    private FunctorPattern functorPattern;
    private TypeSpecification typeSpecification;
    private Definiens definiens;

    public FunctorDefinition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ElementNames.REDEFINE));
        functorPattern = FunctorPattern.buildFunctorPattern(element.elements().get(1));
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
        redefine.run();
        functorPattern.run();
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
