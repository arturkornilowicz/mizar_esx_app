package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Otherwise extends XMLElement {

    public Otherwise(Element element) { super(element); }

    public static Otherwise buildOtherwise(Element element) {
        switch (element.getParent().attributeValue(AttributeNames.SHAPE)) {
            case AttributeValues.FORMULA_EXPRESSION:
                return new OtherwisePredicative(element);
            case AttributeValues.TERM_EXPRESSION:
                return new OtherwiseEquational(element);
            default:
                Errors.error(element, "Missing Element in buildOtherwise [" + element.getParent().attributeValue(AttributeNames.SHAPE) + "]");
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
