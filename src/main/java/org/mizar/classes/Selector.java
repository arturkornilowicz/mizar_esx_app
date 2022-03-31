package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Selector extends XMLElement {

    private Locus locus;

    public Selector(Element element) {
        super(element);
        locus = new Locus(element.element(ElementNames.LOCUS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        locus.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
