package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class Arguments extends XMLElement {

    private List<Term> arguments = new LinkedList<>();

    public Arguments(Element element) {
        super(element);
        for (Element element1: element.elements()) {
            arguments.add(Term.buildTerm(element1));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Term term: arguments) {
            term.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
