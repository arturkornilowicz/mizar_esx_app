package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class SchemeHead extends Item {

    private Scheme schemeName;
    private SchematicVariables schematicVariables;
    private Formula schemeThesis;
    private ProvisionalFormulas provisionalFormulas;

    public SchemeHead(Element element) {
        super(element);
        schemeName = new Scheme(element.element(ESXElementName.SCHEME));
        schematicVariables = new SchematicVariables(element.element(ESXElementName.SCHEMATIC_VARIABLES));
        schemeThesis = Formula.buildFormula(element.elements().get(2));
        if (element.element(ESXElementName.PROVISIONAL_FORMULAS) != null) {
            provisionalFormulas = new ProvisionalFormulas(element.element(ESXElementName.PROVISIONAL_FORMULAS));
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        schemeName.run();
        schematicVariables.run();
        schemeThesis.run();
        if (provisionalFormulas != null) {
            provisionalFormulas.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
