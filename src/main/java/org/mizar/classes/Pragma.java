package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Pragma extends Item {

    private PragmaKind pragma;

    public Pragma(Element element) {
        super(element);
        pragma = PragmaKind.buildPragmaKind(element.elements().get(0));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        pragma.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
