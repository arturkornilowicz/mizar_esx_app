package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FuncSynonym extends Item {

    private FunctorPattern functorPattern;
    private PatternShapedExpression patternShapedExpression;

    public FuncSynonym(Element element) {
        super(element);
        functorPattern = FunctorPattern.buildFunctorPattern(element.elements().get(0));
        patternShapedExpression = new PatternShapedExpression(element.element(ElementNames.PATTERN_SHAPED_EXPRESSION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        functorPattern.run();
        patternShapedExpression.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
