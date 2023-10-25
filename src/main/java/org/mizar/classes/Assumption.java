package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Assumption extends Item {

    public Assumption(Element element) {
        super(element);
    }

    public static Assumption buildAssumption(Element element) {
        switch (element.getName()) {
            case ESXElementName.SINGLE_ASSUMPTION:
                return new SingleAssumption(element);
            case ESXElementName.COLLECTIVE_ASSUMPTION:
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
