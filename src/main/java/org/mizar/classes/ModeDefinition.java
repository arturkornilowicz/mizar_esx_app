package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ModeDefinition extends Item {

    private Redefine redefine;
    private ModePattern modePattern;
    private ModePatternKind modePatternKind;

    public ModeDefinition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ESXElementName.REDEFINE));
        modePattern = new ModePattern(element.element(ESXElementName.MODE_PATTERN));
        modePatternKind = ModePatternKind.buildModePatternKind(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        redefine.run();
        modePattern.run();
        modePatternKind.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
