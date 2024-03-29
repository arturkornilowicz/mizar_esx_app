package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Cluster extends Item {

    public Cluster(Element element) {
        super(element);
    }

    public static Cluster buildCluster(Element element) {
        switch (element.getName()) {
            case ESXElementName.CONDITIONAL_REGISTRATION:
                return new ConditionalRegistration(element);
            case ESXElementName.EXISTENTIAL_REGISTRATION:
                return new ExistentialRegistration(element);
            case ESXElementName.FUNCTORIAL_REGISTRATION:
                return new FunctorialRegistration(element);
            default:
                Errors.error(element, "Missing Element in buildCluster [" + element.getName() + "]");
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
