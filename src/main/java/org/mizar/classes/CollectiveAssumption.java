package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CollectiveAssumption extends Assumption {

    private Conditions conditions;

    public CollectiveAssumption(Element element) {
        super(element);
        conditions = new Conditions(element.element(ElementNames.CONDITIONS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        conditions.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
