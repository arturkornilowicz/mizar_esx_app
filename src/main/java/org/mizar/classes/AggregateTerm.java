package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class AggregateTerm extends TermWithArguments {

    public AggregateTerm(Element element) {
        super(element);
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        super.process();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
