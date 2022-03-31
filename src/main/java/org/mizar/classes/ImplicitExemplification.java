package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ImplicitExemplification extends ExemplificationKind {

    private Term example;

    public ImplicitExemplification(Element element) {
        super(element);
        example = Term.buildTerm(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        example.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
