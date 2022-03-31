package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class ModePatternKind extends XMLElement {

    public ModePatternKind(Element element) {
        super(element);
    }

    public static ModePatternKind buildModePatternKind(Element element) {
        switch (element.getName()) {
            case ElementNames.EXPANDABLE_MODE:
                return new ExpandableMode(element);
            case ElementNames.STANDARD_MODE:
                return new StandardMode(element);
            default:
                Errors.error(element, "Missing Element in buildModePatternKind [" + element.getName() + "]");
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
