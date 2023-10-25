package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class CorrectnessConditionKind extends XMLElement {

    public CorrectnessConditionKind(Element element) {
        super(element);
    }

    public static CorrectnessConditionKind buildCorrectnessConditionKind(Element element) {
        switch (element.getName()) {
            case ESXElementName.COHERENCE:
                return new Coherence(element);
            case ESXElementName.COMPATIBILITY:
                return new Compatibility(element);
            case ESXElementName.CONSISTENCY:
                return new Consistency(element);
            case ESXElementName.EXISTENCE:
                return new Existence(element);
            case ESXElementName.REDUCIBILITY:
                return new Reducibility(element);
            case ESXElementName.UNIQUENESS:
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
