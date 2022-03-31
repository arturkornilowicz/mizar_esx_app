package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PredSynonym extends Item {

    private PredicatePattern predicatePattern;
    private PatternShapedExpression patternShapedExpression;

    public PredSynonym(Element element) {
        super(element);
        predicatePattern = new PredicatePattern(element.element(ElementNames.PREDICATE_PATTERN));
        patternShapedExpression = new PatternShapedExpression(element.element(ElementNames.PATTERN_SHAPED_EXPRESSION));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        predicatePattern.run();
        patternShapedExpression.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
