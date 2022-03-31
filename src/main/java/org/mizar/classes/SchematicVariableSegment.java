package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class SchematicVariableSegment extends XMLElement {

    public SchematicVariableSegment(Element element) {
        super(element);
    }

    public static SchematicVariableSegment buildSchematicVariableSegment(Element element) {
        switch (element.getName()) {
            case ElementNames.FUNCTOR_SEGMENT:
                return new FunctorSegment(element);
            case ElementNames.PREDICATE_SEGMENT:
                return new PredicateSegment(element);
            default:
                Errors.error(element, "Missing Element in buildSchematicVariableSegment [" + element.getName() + "]");
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
