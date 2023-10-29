package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ModeDefinition extends Definition {

    private ModePatternKind modePatternKind;

    public ModeDefinition(Element element) {
        super(element);
        modePatternKind = ModePatternKind.buildModePatternKind(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        getRedefine().run();
        getPattern().run();
        modePatternKind.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
