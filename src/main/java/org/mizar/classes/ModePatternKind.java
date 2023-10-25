package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ModePatternKind extends XMLElement {

    public ModePatternKind(Element element) {
        super(element);
    }

    public static ModePatternKind buildModePatternKind(Element element) {
        switch (element.getName()) {
            case ESXElementName.EXPANDABLE_MODE:
                return new ExpandableMode(element);
            case ESXElementName.STANDARD_MODE:
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
