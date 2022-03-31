package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class PartialDefiniens extends XMLElement {

    public PartialDefiniens(Element element) {
        super(element);
    }

    public static PartialDefiniens buildPartialDefiniens(Element element) {
        switch (element.getParent().getParent().attributeValue(AttributeNames.SHAPE)) {
            case AttributeValues.FORMULA_EXPRESSION:
                return new PartialPredicativeDefiniens(element);
            case AttributeValues.TERM_EXPRESSION:
                return new PartialEquationalDefiniens(element);
            default:
                Errors.error(element, "Missing Element in buildPartialDefiniens [" + element.getParent().getParent().attributeValue(AttributeNames.SHAPE) + "]");
                return null;
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
