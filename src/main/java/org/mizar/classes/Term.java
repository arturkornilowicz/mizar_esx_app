package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Term extends XMLElement implements SmallExpression {

    public Term(Element element) {
        super(element);
    }

    public static Term buildTerm(Element element) {
        switch (element.getName()) {
            case ESXElementName.AGGREGATE_TERM:
                return new AggregateTerm(element);
            case ESXElementName.CIRCUMFIX_TERM:
                return new CircumfixTerm(element);
            case ESXElementName.FORGETFUL_FUNCTOR_TERM:
                return new ForgetfulFunctorTerm(element);
            case ESXElementName.FRAENKEL_TERM:
                return new FraenkelTerm(element);
            case ESXElementName.GLOBAL_CHOICE_TERM:
                return new GlobalChoiceTerm(element);
            case ESXElementName.INFIX_TERM:
                return new InfixTerm(element);
            case ESXElementName.INTERNAL_SELECTOR_TERM:
                return new InternalSelectorTerm(element);
            case ESXElementName.IT_TERM:
                return new ItTerm(element);
            case ESXElementName.NUMERAL_TERM:
                return new NumeralTerm(element);
            case ESXElementName.PLACEHOLDER_TERM:
                return new PlaceholderTerm(element);
            case ESXElementName.PRIVATE_FUNCTOR_TERM:
                return new PrivateFunctorTerm(element);
            case ESXElementName.QUALIFICATION_TERM:
                return new QualificationTerm(element);
            case ESXElementName.SELECTOR_TERM:
                return new SelectorTerm(element);
            case ESXElementName.SIMPLE_FRAENKEL_TERM:
                return new SimpleFraenkelTerm(element);
            case ESXElementName.SIMPLE_TERM:
                return new SimpleTerm(element);
            default:
                Errors.error(element, "Missing Element in buildTerm [" + element.getName() + "]");
                return null;
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
