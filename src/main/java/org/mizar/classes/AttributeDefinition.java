package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class AttributeDefinition extends Item {

    private Redefine redefine;
    private AttributePattern attributePattern;
    private Definiens definiens;

    public AttributeDefinition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ElementNames.REDEFINE));
        attributePattern = new AttributePattern(element.element(ElementNames.ATTRIBUTE_PATTERN));
        if (element.element(ElementNames.DEFINIENS) != null) {
            definiens = Definiens.buildDefiniens(element.element(ElementNames.DEFINIENS));
        }
    }

    @Override
    public void preProcess() { super.preProcess(); }

    @Override
    public void process() {
        redefine.run();
        attributePattern.run();
        if (definiens != null) {
            definiens.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
