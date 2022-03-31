package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class RegularStatementNow extends RegularStatement {

    private DiffuseStatement diffuseStatement;
    private Block reasoning;

    public RegularStatementNow(Element element) {
        super(element);
        diffuseStatement = new DiffuseStatement(element.element(ElementNames.DIFFUSE_STATEMENT));
        reasoning = new Block(element.element(ElementNames.BLOCK));
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        diffuseStatement.run();
        reasoning.run();
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
