package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class StructureDefinition extends Item {

    private Ancestors ancestors;
    private StructurePattern structurePattern;
    private FieldSegments fieldSegments;
    private StructurePatternsRendering structurePatternsRendering;

    public StructureDefinition(Element element) {
        super(element);
        ancestors = new Ancestors(element.element(ESXElementName.ANCESTORS));
        structurePattern = new StructurePattern(element.element(ESXElementName.STRUCTURE_PATTERN));
        fieldSegments = new FieldSegments(element.element(ESXElementName.FIELD_SEGMENTS));
        structurePatternsRendering = new StructurePatternsRendering(element.element(ESXElementName.STRUCTURE_PATTERNS_RENDERING));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        ancestors.run();
        structurePattern.run();
        fieldSegments.run();
        structurePatternsRendering.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
