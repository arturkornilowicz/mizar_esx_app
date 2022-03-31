package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Formula extends XMLElement {

    public Formula(Element element) {
        super(element);
    }

    public static Formula buildFormula(Element element) {
        switch (element.getName()) {
            case ElementNames.BICONDITIONAL_FORMULA:
                return new BiconditionalFormula(element);
            case ElementNames.CONDITIONAL_FORMULA:
                return new ConditionalFormula(element);
            case ElementNames.CONJUNCTIVE_FORMULA:
                return new ConjunctiveFormula(element);
            case ElementNames.CONTRADICTION:
                return new Contradiction(element);
            case ElementNames.DISJUNCTIVE_FORMULA:
                return new DisjunctiveFormula(element);
            case ElementNames.EXISTENTIAL_QUANTIFIER_FORMULA:
                return new ExistentialQuantifierFormula(element);
            case ElementNames.FLEXARYCONJUNCTIVE_FORMULA:
                return new FlexaryConjunctiveFormula(element);
            case ElementNames.FLEXARYDISJUNCTIVE_FORMULA:
                return new FlexaryDisjunctiveFormula(element);
            case ElementNames.MULTI_ATTRIBUTIVE_FORMULA:
                return new MultiAttributiveFormula(element);
            case ElementNames.MULTI_RELATION_FORMULA:
                return new MultiRelationFormula(element);
            case ElementNames.NEGATED_FORMULA:
                return new NegatedFormula(element);
            case ElementNames.QUALIFYING_FORMULA:
                return new QualifyingFormula(element);
            case ElementNames.PRIVATE_PREDICATE_FORMULA:
                return new PrivatePredicateFormula(element);
            case ElementNames.RELATION_FORMULA:
                return new RelationFormula(element);
            case ElementNames.THESIS:
                return new Thesis(element);
            case ElementNames.UNIVERSAL_QUANTIFIER_FORMULA:
                return new UniversalQuantifierFormula(element);
            default:
                Errors.error(element, "Missing Element in buildFormula [" + element.getName() + "]");
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
