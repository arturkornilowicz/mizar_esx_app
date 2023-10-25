package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Formula extends XMLElement {

    public Formula(Element element) {
        super(element);
    }

    public static Formula buildFormula(Element element) {
        switch (element.getName()) {
            case ESXElementName.BICONDITIONAL_FORMULA:
                return new BiconditionalFormula(element);
            case ESXElementName.CONDITIONAL_FORMULA:
                return new ConditionalFormula(element);
            case ESXElementName.CONJUNCTIVE_FORMULA:
                return new ConjunctiveFormula(element);
            case ESXElementName.CONTRADICTION:
                return new Contradiction(element);
            case ESXElementName.DISJUNCTIVE_FORMULA:
                return new DisjunctiveFormula(element);
            case ESXElementName.EXISTENTIAL_QUANTIFIER_FORMULA:
                return new ExistentialQuantifierFormula(element);
            case ESXElementName.FLEXARYCONJUNCTIVE_FORMULA:
                return new FlexaryConjunctiveFormula(element);
            case ESXElementName.FLEXARYDISJUNCTIVE_FORMULA:
                return new FlexaryDisjunctiveFormula(element);
            case ESXElementName.MULTI_ATTRIBUTIVE_FORMULA:
                return new MultiAttributiveFormula(element);
            case ESXElementName.MULTI_RELATION_FORMULA:
                return new MultiRelationFormula(element);
            case ESXElementName.NEGATED_FORMULA:
                return new NegatedFormula(element);
            case ESXElementName.QUALIFYING_FORMULA:
                return new QualifyingFormula(element);
            case ESXElementName.PRIVATE_PREDICATE_FORMULA:
                return new PrivatePredicateFormula(element);
            case ESXElementName.RELATION_FORMULA:
                return new RelationFormula(element);
            case ESXElementName.THESIS:
                return new Thesis(element);
            case ESXElementName.UNIVERSAL_QUANTIFIER_FORMULA:
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
