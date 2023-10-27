package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class TermWithArguments extends Term {

    private Arguments arguments;

    public TermWithArguments(Element element) {
        super(element);
        arguments = new Arguments(element.element(ESXElementName.ARGUMENTS));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        arguments.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
