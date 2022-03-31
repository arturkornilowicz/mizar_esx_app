package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class CaseBlock extends Item {

    private Block block;

    public CaseBlock(Element element) {
        super(element);
        block = Block.buildBlock(element.element(ElementNames.BLOCK));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        block.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
