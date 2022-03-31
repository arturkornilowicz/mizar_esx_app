package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class PredicateDefinition extends Item {

    private Redefine redefine;
    private PredicatePattern predicatePattern;
    private Definiens definiens;

    public PredicateDefinition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ElementNames.REDEFINE));
        predicatePattern = new PredicatePattern(element.element(ElementNames.PREDICATE_PATTERN));
        if (element.element(ElementNames.DEFINIENS) != null) {
            definiens = Definiens.buildDefiniens(element.element(ElementNames.DEFINIENS));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        redefine.run();
        predicatePattern.run();
        if (definiens != null) {
            definiens.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
