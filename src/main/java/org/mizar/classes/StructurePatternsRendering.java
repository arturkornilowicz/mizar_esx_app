package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class StructurePatternsRendering extends XMLElement {

    private AggregateFunctorPattern aggregateFunctorPattern;
    private ForgetfulFunctorPattern forgetfulFunctorPattern;
    private StrictPattern strictPattern;
    private SelectorsList selectorsList;

    public StructurePatternsRendering(Element element) {
        super(element);
        aggregateFunctorPattern = new AggregateFunctorPattern(element.element(ESXElementName.AGGREGATEFUNCTOR_PATTERN));
        forgetfulFunctorPattern = new ForgetfulFunctorPattern(element.element(ESXElementName.FORGETFULFUNCTOR_PATTERN));
        strictPattern = new StrictPattern(element.element(ESXElementName.STRICT_PATTERN));
        selectorsList = new SelectorsList(element.element(ESXElementName.SELECTORS_LIST));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        aggregateFunctorPattern.run();
        forgetfulFunctorPattern.run();
        strictPattern.run();
        selectorsList.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
