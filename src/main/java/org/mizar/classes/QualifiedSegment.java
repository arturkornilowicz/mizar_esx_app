package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class QualifiedSegment extends XMLElement {

    public QualifiedSegment(Element element) {
        super(element);
    }

    public static QualifiedSegment buildQualifiedSegment(Element element) {
        switch (element.getName()) {
            case ElementNames.EXPLICITLY_QUALIFIED_SEGMENT:
                return new ExplicitlyQualifiedSegment(element);
            case ElementNames.FREE_VARIABLE_SEGMENT:
                return new FreeVariableSegment(element);
            case ElementNames.IMPLICITLY_QUALIFIED_SEGMENT:
                return new ImplicitlyQualifiedSegment(element);
            default:
                Errors.error(element, "Missing Element in buildQualifiedSegment [" + element.getName() + "]");
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
