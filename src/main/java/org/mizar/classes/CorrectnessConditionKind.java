package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class CorrectnessConditionKind extends XMLElement {

    public CorrectnessConditionKind(Element element) {
        super(element);
    }

    public static CorrectnessConditionKind buildCorrectnessConditionKind(Element element) {
        switch (element.getName()) {
            case ElementNames.COHERENCE:
                return new Coherence(element);
            case ElementNames.COMPATIBILITY:
                return new Compatibility(element);
            case ElementNames.CONSISTENCY:
                return new Consistency(element);
            case ElementNames.EXISTENCE:
                return new Existence(element);
            case ElementNames.REDUCIBILITY:
                return new Reducibility(element);
            case ElementNames.UNIQUENESS:
                return new Uniqueness(element);
            default:
                Errors.error(element, "Missing Element in buildCorrectnessConditionKind [" + element.getName() + "]");
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
