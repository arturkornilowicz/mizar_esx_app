package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Identify extends Item {

    private PatternShapedExpression leftPattern;
    private PatternShapedExpression rightPattern;
    private LociEqualities lociEqualities;

    public Identify(Element element) {
        super(element);
        leftPattern = new PatternShapedExpression(element.elements(ElementNames.PATTERN_SHAPED_EXPRESSION).get(0));
        rightPattern = new PatternShapedExpression(element.elements(ElementNames.PATTERN_SHAPED_EXPRESSION).get(1));
        lociEqualities = new LociEqualities(element.element(ElementNames.LOCI_EQUALITIES));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        leftPattern.run();
        rightPattern.run();
        lociEqualities.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
