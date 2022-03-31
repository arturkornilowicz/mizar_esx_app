package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class DiffuseConclusion extends Conclusion {

    private DiffuseStatement diffuseStatement;
    private Block block;

    public DiffuseConclusion(Element element) {
        super(element);
        diffuseStatement = new DiffuseStatement(element.element(ElementNames.DIFFUSE_STATEMENT));
        block = Block.buildBlock(element.element(ElementNames.BLOCK));
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
