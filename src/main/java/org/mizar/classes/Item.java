package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Item extends XMLElement {

    public Item(Element element) {
        super(element);
    }

    public static Item buildItem(Element element) {
        switch (element.attributeValue(ESXAttributeName.KIND)) {
            case ESXElementName.ASSUMPTION:
                return Assumption.buildAssumption(element.elements().get(0).elements().get(0));
            case ESXElementName.ATTR_ANTONYM:
                return new AttrAntonym(element.element(ESXElementName.ATTR_ANTONYM));
            case ESXElementName.ATTR_SYNONYM:
                return new AttrSynonym(element.element(ESXElementName.ATTR_SYNONYM));
            case ESXElementName.ATTRIBUTE_DEFINITION:
                return new AttributeDefinition(element.element(ESXElementName.ATTRIBUTE_DEFINITION));
            case ESXElementName.CASE_BLOCK:
                return new CaseBlock(element.element(ESXElementName.CASE_BLOCK));
            case ESXElementName.CASE_HEAD:
                return new CaseHead(element.element(ESXElementName.CASE_HEAD));
            case ESXElementName.CHOICE_STATEMENT:
                return new ChoiceStatement(element.element(ESXElementName.CHOICE_STATEMENT));
            case ESXElementName.CLUSTER:
                return Cluster.buildCluster(element.elements().get(0).elements().get(0));
            case ESXElementName.CONCLUSION:
                return Conclusion.buildConclusion(element.element(ESXElementName.CONCLUSION));
            case ESXElementName.CONSTANT_DEFINITION:
                return new ConstantDefinition(element.element(ESXElementName.CONSTANT_DEFINITION));
            case ESXElementName.CORRECTNESS:
                return new Correctness(element.element(ESXElementName.CORRECTNESS));
            case ESXElementName.CORRECTNESS_CONDITION:
                return new CorrectnessCondition(element.element(ESXElementName.CORRECTNESS_CONDITION));
            case ESXElementName.DEFAULT_GENERALIZATION:
                return new DefaultGeneralization(element.element(ESXElementName.DEFAULT_GENERALIZATION));
            case ESXElementName.DEFINITION_ITEM:
                return new DefinitionItem(element.element(ESXElementName.DEFINITION_ITEM));
            case ESXElementName.EXEMPLIFICATION:
                return new Exemplification(element.element(ESXElementName.EXEMPLIFICATION));
            case ESXElementName.EXISTENTIAL_ASSUMPTION:
                return new ExistentialAssumption(element.element(ESXElementName.EXISTENTIAL_ASSUMPTION));
            case ESXElementName.FUNC_SYNONYM:
                return new FuncSynonym(element.element(ESXElementName.FUNC_SYNONYM));
            case ESXElementName.FUNCTOR_DEFINITION:
                return new FunctorDefinition(element.element(ESXElementName.FUNCTOR_DEFINITION));
            case ESXElementName.GENERALIZATION:
                return new Generalization(element.element(ESXElementName.GENERALIZATION));
            case ESXElementName.IDENTIFY:
                return new Identify(element.element(ESXElementName.IDENTIFY));
            case ESXElementName.MODE_DEFINITION:
                return new ModeDefinition(element.element(ESXElementName.MODE_DEFINITION));
            case ESXElementName.MODE_SYNONYM:
                return new ModeSynonym(element.element(ESXElementName.MODE_SYNONYM));
            case ESXElementName.LOCI_DECLARATION:
                return new LociDeclaration(element.element(ESXElementName.LOCI_DECLARATION));
            case ESXElementName.PER_CASES:
                return new PerCases(element.element(ESXElementName.PER_CASES));
            case ESXElementName.PRAGMA:
                return new Pragma(element.element(ESXElementName.PRAGMA));
            case ESXElementName.PRED_ANTONYM:
                return new PredAntonym(element.element(ESXElementName.PRED_ANTONYM));
            case ESXElementName.PRED_SYNONYM:
                return new PredSynonym(element.element(ESXElementName.PRED_SYNONYM));
            case ESXElementName.PREDICATE_DEFINITION:
                return new PredicateDefinition(element.element(ESXElementName.PREDICATE_DEFINITION));
            case ESXElementName.PRIVATE_FUNCTOR_DEFINITION:
                return new PrivateFunctorDefinition(element.element(ESXElementName.PRIVATE_FUNCTOR_DEFINITION));
            case ESXElementName.PRIVATE_PREDICATE_DEFINITION:
                return new PrivatePredicateDefinition(element.element(ESXElementName.PRIVATE_PREDICATE_DEFINITION));
            case ESXElementName.PROPERTY:
                return new Property(element.element(ESXElementName.PROPERTY));
            case ESXElementName.PROPERTY_REGISTRATION:
                return new PropertyRegistration(element.element(ESXElementName.PROPERTY_REGISTRATION));
            case ESXElementName.REDUCTION:
                return new Reduction(element.element(ESXElementName.REDUCTION));
            case ESXElementName.REGULAR_STATEMENT:
                return RegularStatement.buildRegularStatement(element.elements().get(0));
            case ESXElementName.RESERVATION:
                return new Reservation(element.element(ESXElementName.RESERVATION));
            case ESXElementName.SCHEME_BLOCK_ITEM:
                return new SchemeBlockItem(element.element(ESXElementName.SCHEME_BLOCK_ITEM));
            case ESXElementName.SCHEME_HEAD:
                return new SchemeHead(element.element(ESXElementName.SCHEME_HEAD));
            case ESXElementName.SECTION_PRAGMA:
                return new SectionPragma(element.element(ESXElementName.SECTION_PRAGMA));
            case ESXElementName.STRUCTURE_DEFINITION:
                return new StructureDefinition(element.element(ESXElementName.STRUCTURE_DEFINITION));
            case ESXElementName.SUPPOSE_HEAD:
                return new SupposeHead(element.element(ESXElementName.SUPPOSE_HEAD));
            case ESXElementName.THEOREM_ITEM:
                return new TheoremItem(element.element(ESXElementName.THEOREM_ITEM));
            case ESXElementName.TYPE_CHANGING_STATEMENT:
                return new TypeChangingStatement(element.element(ESXElementName.TYPE_CHANGING_STATEMENT));
            default:
                Errors.error(element, "Missing Element in buildItem [" + element.attributeValue(ESXAttributeName.KIND) + "]");
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
