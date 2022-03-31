package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Reference extends XMLElement {

    public Reference(Element element) {
        super(element);
    }

    public static Reference buildReference(Element element) {
        switch (element.getName()) {
            case ElementNames.DEFINITION_REFERENCE:
                return new DefinitionReference(element);
            case ElementNames.LINK:
                return new Link(element);
            case ElementNames.LOCAL_REFERENCE:
                return new LocalReference(element);
            case ElementNames.THEOREM_REFERENCE:
                return new TheoremReference(element);
            default:
                Errors.error(element, "Missing Element in buildReference [" + element.getName() + "]");
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
