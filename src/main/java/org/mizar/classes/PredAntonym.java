package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class PredAntonym extends Item {

    private PredicatePattern predicatePattern;
    private PatternShapedExpression patternShapedExpression;

    public PredAntonym(Element element) {
        super(element);
        predicatePattern = new PredicatePattern(element.element(ESXElementName.PREDICATE_PATTERN));
        patternShapedExpression = new PatternShapedExpression(element.element(ESXElementName.PATTERN_SHAPED_EXPRESSION));
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
