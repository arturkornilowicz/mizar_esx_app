package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class AttributeDefinition extends Item {

    private Redefine redefine;
    private AttributePattern attributePattern;
    private Definiens definiens;

    public AttributeDefinition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ESXElementName.REDEFINE));
        attributePattern = new AttributePattern(element.element(ESXElementName.ATTRIBUTE_PATTERN));
        if (element.element(ESXElementName.DEFINIENS) != null) {
            definiens = Definiens.buildDefiniens(element.element(ESXElementName.DEFINIENS));
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
