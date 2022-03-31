package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Item extends XMLElement {

    public Item(Element element) {
        super(element);
    }

    public static Item buildItem(Element element) {
        switch (element.attributeValue(AttributeNames.KIND)) {
            case ElementNames.ASSUMPTION:
                return Assumption.buildAssumption(element.elements().get(0).elements().get(0));
            case ElementNames.ATTR_ANTONYM:
                return new AttrAntonym(element.element(ElementNames.ATTR_ANTONYM));
            case ElementNames.ATTR_SYNONYM:
                return new AttrSynonym(element.element(ElementNames.ATTR_SYNONYM));
            case ElementNames.ATTRIBUTE_DEFINITION:
                return new AttributeDefinition(element.element(ElementNames.ATTRIBUTE_DEFINITION));
            case ElementNames.CASE_BLOCK:
                return new CaseBlock(element.element(ElementNames.CASE_BLOCK));
            case ElementNames.CASE_HEAD:
                return new CaseHead(element.element(ElementNames.CASE_HEAD));
            case ElementNames.CHOICE_STATEMENT:
                return new ChoiceStatement(element.element(ElementNames.CHOICE_STATEMENT));
            case ElementNames.CLUSTER:
                return Cluster.buildCluster(element.elements().get(0).elements().get(0));
            case ElementNames.CONCLUSION:
                return Conclusion.buildConclusion(element.element(ElementNames.CONCLUSION));
            case ElementNames.CONSTANT_DEFINITION:
                return new ConstantDefinition(element.element(ElementNames.CONSTANT_DEFINITION));
            case ElementNames.CORRECTNESS:
                return new Correctness(element.element(ElementNames.CORRECTNESS));
            case ElementNames.CORRECTNESS_CONDITION:
                return new CorrectnessCondition(element.element(ElementNames.CORRECTNESS_CONDITION));
            case ElementNames.DEFAULT_GENERALIZATION:
                return new DefaultGeneralization(element.element(ElementNames.DEFAULT_GENERALIZATION));
            case ElementNames.DEFINITION_ITEM:
                return new DefinitionItem(element.element(ElementNames.DEFINITION_ITEM));
            case ElementNames.EXEMPLIFICATION:
                return new Exemplification(element.element(ElementNames.EXEMPLIFICATION));
            case ElementNames.EXISTENTIAL_ASSUMPTION:
                return new ExistentialAssumption(element.element(ElementNames.EXISTENTIAL_ASSUMPTION));
            case ElementNames.FUNC_SYNONYM:
                return new FuncSynonym(element.element(ElementNames.FUNC_SYNONYM));
            case ElementNames.FUNCTOR_DEFINITION:
                return new FunctorDefinition(element.element(ElementNames.FUNCTOR_DEFINITION));
            case ElementNames.GENERALIZATION:
                return new Generalization(element.element(ElementNames.GENERALIZATION));
            case ElementNames.IDENTIFY:
                return new Identify(element.element(ElementNames.IDENTIFY));
            case ElementNames.MODE_DEFINITION:
                return new ModeDefinition(element.element(ElementNames.MODE_DEFINITION));
            case ElementNames.MODE_SYNONYM:
                return new ModeSynonym(element.element(ElementNames.MODE_SYNONYM));
            case ElementNames.LOCI_DECLARATION:
                return new LociDeclaration(element.element(ElementNames.LOCI_DECLARATION));
            case ElementNames.PER_CASES:
                return new PerCases(element.element(ElementNames.PER_CASES));
            case ElementNames.PRAGMA:
                return new Pragma(element.element(ElementNames.PRAGMA));
            case ElementNames.PRED_ANTONYM:
                return new PredAntonym(element.element(ElementNames.PRED_ANTONYM));
            case ElementNames.PRED_SYNONYM:
                return new PredSynonym(element.element(ElementNames.PRED_SYNONYM));
            case ElementNames.PREDICATE_DEFINITION:
                return new PredicateDefinition(element.element(ElementNames.PREDICATE_DEFINITION));
            case ElementNames.PRIVATE_FUNCTOR_DEFINITION:
                return new PrivateFunctorDefinition(element.element(ElementNames.PRIVATE_FUNCTOR_DEFINITION));
            case ElementNames.PRIVATE_PREDICATE_DEFINITION:
                return new PrivatePredicateDefinition(element.element(ElementNames.PRIVATE_PREDICATE_DEFINITION));
            case ElementNames.PROPERTY:
                return new Property(element.element(ElementNames.PROPERTY));
            case ElementNames.PROPERTY_REGISTRATION:
                return new PropertyRegistration(element.element(ElementNames.PROPERTY_REGISTRATION));
            case ElementNames.REDUCTION:
                return new Reduction(element.element(ElementNames.REDUCTION));
            case ElementNames.REGULAR_STATEMENT:
                return RegularStatement.buildRegularStatement(element.elements().get(0));
            case ElementNames.RESERVATION:
                return new Reservation(element.element(ElementNames.RESERVATION));
            case ElementNames.SCHEME_BLOCK_ITEM:
                return new SchemeBlockItem(element.element(ElementNames.SCHEME_BLOCK_ITEM));
            case ElementNames.SCHEME_HEAD:
                return new SchemeHead(element.element(ElementNames.SCHEME_HEAD));
            case ElementNames.SECTION_PRAGMA:
                return new SectionPragma(element.element(ElementNames.SECTION_PRAGMA));
            case ElementNames.STRUCTURE_DEFINITION:
                return new StructureDefinition(element.element(ElementNames.STRUCTURE_DEFINITION));
            case ElementNames.SUPPOSE_HEAD:
                return new SupposeHead(element.element(ElementNames.SUPPOSE_HEAD));
            case ElementNames.THEOREM_ITEM:
                return new TheoremItem(element.element(ElementNames.THEOREM_ITEM));
            case ElementNames.TYPE_CHANGING_STATEMENT:
                return new TypeChangingStatement(element.element(ElementNames.TYPE_CHANGING_STATEMENT));
            default:
                Errors.error(element, "Missing Element in buildItem [" + element.attributeValue(AttributeNames.KIND) + "]");
                return null;
        }
    }

    @Override
    public void preProcess() { super.preProcess(); }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
