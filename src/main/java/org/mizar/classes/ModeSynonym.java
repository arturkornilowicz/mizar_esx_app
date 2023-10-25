package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class ModeSynonym extends Item {

    private ModePattern modePattern;
    private PatternShapedExpression patternShapedExpression;

    public ModeSynonym(Element element) {
        super(element);
        modePattern = new ModePattern(element.element(ESXElementName.MODE_PATTERN));
        patternShapedExpression = new PatternShapedExpression(element.element(ESXElementName.PATTERN_SHAPED_EXPRESSION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        modePattern.run();
        patternShapedExpression.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
