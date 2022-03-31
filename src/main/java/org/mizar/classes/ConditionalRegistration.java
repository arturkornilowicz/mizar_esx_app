package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ConditionalRegistration extends Cluster {

    private AdjectiveCluster pred;
    private AdjectiveCluster succ;
    private Type type;

    public ConditionalRegistration(Element element) {
        super(element);
        pred = new AdjectiveCluster(element.elements().get(0));
        succ = new AdjectiveCluster(element.elements().get(1));
        type = Type.buildType(element.elements().get(2));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        pred.run();
        succ.run();
        type.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
