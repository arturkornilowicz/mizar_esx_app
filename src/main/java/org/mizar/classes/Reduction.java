package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.ESXElementName;

@Setter
@Getter
@ToString

public class Reduction extends Item {

    private Redex redex;
    private Reduct reduct;

    public Reduction(Element element) {
        super(element);
        redex = new Redex(element.element(ESXElementName.REDEX));
        reduct = new Reduct(element.element(ESXElementName.REDUCT));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        redex.run();
        reduct.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
