package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class AttrSynonym extends Item {

    private AttributePattern attributePattern;
    private PatternShapedExpression patternShapedExpression;

    public AttrSynonym(Element element) {
        super(element);
        attributePattern = new AttributePattern(element.element(ElementNames.ATTRIBUTE_PATTERN));
        patternShapedExpression = new PatternShapedExpression(element.element(ElementNames.PATTERN_SHAPED_EXPRESSION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        attributePattern.run();
        patternShapedExpression.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
