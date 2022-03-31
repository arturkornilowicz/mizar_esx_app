package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Term extends XMLElement {

    public Term(Element element) {
        super(element);
    }

    public static Term buildTerm(Element element) {
        switch (element.getName()) {
            case ElementNames.AGGREGATE_TERM:
                return new AggregateTerm(element);
            case ElementNames.CIRCUMFIX_TERM:
                return new CircumfixTerm(element);
            case ElementNames.FORGETFUL_FUNCTOR_TERM:
                return new ForgetfulFunctorTerm(element);
            case ElementNames.FRAENKEL_TERM:
                return new FraenkelTerm(element);
            case ElementNames.GLOBAL_CHOICE_TERM:
                return new GlobalChoiceTerm(element);
            case ElementNames.INFIX_TERM:
                return new InfixTerm(element);
            case ElementNames.INTERNAL_SELECTOR_TERM:
                return new InternalSelectorTerm(element);
            case ElementNames.IT_TERM:
                return new ItTerm(element);
            case ElementNames.NUMERAL_TERM:
                return new NumeralTerm(element);
            case ElementNames.PLACEHOLDER_TERM:
                return new PlaceholderTerm(element);
            case ElementNames.PRIVATE_FUNCTOR_TERM:
                return new PrivateFunctorTerm(element);
            case ElementNames.QUALIFICATION_TERM:
                return new QualificationTerm(element);
            case ElementNames.SELECTOR_TERM:
                return new SelectorTerm(element);
            case ElementNames.SIMPLE_FRAENKEL_TERM:
                return new SimpleFraenkelTerm(element);
            case ElementNames.SIMPLE_TERM:
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
