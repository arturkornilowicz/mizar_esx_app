package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

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
        ancestors = new Ancestors(element.element(ElementNames.ANCESTORS));
        structurePattern = new StructurePattern(element.element(ElementNames.STRUCTURE_PATTERN));
        fieldSegments = new FieldSegments(element.element(ElementNames.FIELD_SEGMENTS));
        structurePatternsRendering = new StructurePatternsRendering(element.element(ElementNames.STRUCTURE_PATTERNS_RENDERING));
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
