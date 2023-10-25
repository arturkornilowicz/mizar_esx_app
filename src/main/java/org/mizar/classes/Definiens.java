package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Definiens extends XMLElement {

    public Definiens(Element element) {
        super(element);
    }

    public static Definiens buildDefiniens(Element element) {
        switch (element.attributeValue(ESXAttributeName.KIND)) {
            case AttributeValues.SIMPLE_DEFINIENS:
                switch (element.attributeValue(ESXAttributeName.SHAPE)) {
                    case AttributeValues.FORMULA_EXPRESSION:
                        return new SimplePredicativeDefiniens(element);
                    case AttributeValues.TERM_EXPRESSION:
                        return new SimpleEquationalDefiniens(element);
                    default:
                        Errors.error(element, "Missing Element in buildDefiniensSimple [" + element.attributeValue(ESXAttributeName.SHAPE) + "]");
                        return null;
                }
            case AttributeValues.CONDITIONAL_DEFINIENS:
                switch (element.attributeValue(ESXAttributeName.SHAPE)) {
                    case AttributeValues.FORMULA_EXPRESSION:
                        return new ComplexDefiniens(element);
                    case AttributeValues.TERM_EXPRESSION:
                        return new ComplexDefiniens(element);
                    default:
                        Errors.error(element, "Missing Element in buildDefiniensComplex [" + element.attributeValue(ESXAttributeName.SHAPE) + "]");
                        return null;
                }
            default:
                Errors.error(element, "Missing Element in buildDefiniens [" + element.attributeValue(ESXAttributeName.KIND) + "]");
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
