package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class DiffuseConclusion extends Conclusion {

    private DiffuseStatement diffuseStatement;
    private Block block;

    public DiffuseConclusion(Element element) {
        super(element);
        diffuseStatement = new DiffuseStatement(element.element(ESXElementName.DIFFUSE_STATEMENT));
        block = Block.buildBlock(element.element(ESXElementName.BLOCK));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        diffuseStatement.run();
        block.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
