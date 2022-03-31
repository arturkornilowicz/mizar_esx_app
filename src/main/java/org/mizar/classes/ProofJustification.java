package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class ProofJustification extends Justification {

    private Block proofBlock;

    public ProofJustification(Element element) {
        super(element);
        proofBlock = Block.buildBlock(element);
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        proofBlock.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
