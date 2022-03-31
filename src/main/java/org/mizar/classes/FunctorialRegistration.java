package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class FunctorialRegistration extends Cluster {

    private Term term;
    private AdjectiveCluster adjectiveCluster;
    private Type type;

    public FunctorialRegistration(Element element) {
        super(element);
        term = Term.buildTerm(element.elements().get(0));
        adjectiveCluster = new AdjectiveCluster(element.element(ElementNames.ADJECTIVE_CLUSTER));
        if (element.elements().size() > 2) {
            type = Type.buildType(element.elements().get(2));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        term.run();
        adjectiveCluster.run();
        if (type != null) {
            type.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
