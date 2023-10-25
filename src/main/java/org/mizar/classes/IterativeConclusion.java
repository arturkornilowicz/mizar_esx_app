package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class IterativeConclusion extends Conclusion {

    private IterativeEquality iterativeEquality;

    public IterativeConclusion(Element element) {
        super(element);
        iterativeEquality = new IterativeEquality(element.element(ESXElementName.ITERATIVE_EQUALITY));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        iterativeEquality.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
