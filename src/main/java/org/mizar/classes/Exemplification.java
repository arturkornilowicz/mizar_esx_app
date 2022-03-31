package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Exemplification extends Item {

    private List<ExemplificationKind> examples = new LinkedList<>();

    public Exemplification(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            examples.add(ExemplificationKind.buildExemplificationKind(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (ExemplificationKind exemplificationKind: examples) {
            exemplificationKind.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
