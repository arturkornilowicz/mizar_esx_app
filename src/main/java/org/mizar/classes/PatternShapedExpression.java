package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PatternShapedExpression extends XMLElement {

    private Pattern pattern;

    public PatternShapedExpression(Element element) {
        super(element);
        pattern = Pattern.buildPattern(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        pattern.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
