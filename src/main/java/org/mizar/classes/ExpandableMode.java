package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ExpandableMode extends ModePatternKind {

    private Type type;

    public ExpandableMode(Element element) {
        super(element);
        type = Type.buildType(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
