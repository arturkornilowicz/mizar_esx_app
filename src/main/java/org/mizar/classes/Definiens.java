package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Definiens extends XMLElement {

    public Definiens(Element element) {
        super(element);
    }

    public static Definiens buildDefiniens(Element element) {
        switch (element.attributeValue(AttributeNames.KIND)) {
            case AttributeValues.SIMPLE_DEFINIENS:
                switch (element.attributeValue(AttributeNames.SHAPE)) {
                    case AttributeValues.FORMULA_EXPRESSION:
                        return new SimplePredicativeDefiniens(element);
                    case AttributeValues.TERM_EXPRESSION:
                        return new SimpleEquationalDefiniens(element);
                    default:
                        Errors.error(element, "Missing Element in buildDefiniensSimple [" + element.attributeValue(AttributeNames.SHAPE) + "]");
                        return null;
                }
            case AttributeValues.CONDITIONAL_DEFINIENS:
                switch (element.attributeValue(AttributeNames.SHAPE)) {
                    case AttributeValues.FORMULA_EXPRESSION:
                        return new ComplexDefiniens(element);
                    case AttributeValues.TERM_EXPRESSION:
                        return new ComplexDefiniens(element);
                    default:
                        Errors.error(element, "Missing Element in buildDefiniensComplex [" + element.attributeValue(AttributeNames.SHAPE) + "]");
                        return null;
                }
            default:
                Errors.error(element, "Missing Element in buildDefiniens [" + element.attributeValue(AttributeNames.KIND) + "]");
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
