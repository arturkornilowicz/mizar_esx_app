package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Cluster extends Item {

    public Cluster(Element element) {
        super(element);
    }

    public static Cluster buildCluster(Element element) {
        switch (element.getName()) {
            case ElementNames.CONDITIONAL_REGISTRATION:
                return new ConditionalRegistration(element);
            case ElementNames.EXISTENTIAL_REGISTRATION:
                return new ExistentialRegistration(element);
            case ElementNames.FUNCTORIAL_REGISTRATION:
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
