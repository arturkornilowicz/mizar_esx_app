package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Assumption extends Item {

    public Assumption(Element element) {
        super(element);
    }

    public static Assumption buildAssumption(Element element) {
        switch (element.getName()) {
            case ElementNames.SINGLE_ASSUMPTION:
                return new SingleAssumption(element);
            case ElementNames.COLLECTIVE_ASSUMPTION:
                return new CollectiveAssumption(element);
            default:
                Errors.error(element, "Missing Element in buildAssumption [" + element.getName() + "]");
                return null;
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
