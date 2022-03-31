package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@Setter
@Getter
@ToString

public class TextProper extends Block {

    public TextProper(Element element) {
        super(element);
    }

    @Override
    public void preProcess() { super.preProcess(); }

    @Override
    public void process() { super.process(); }

    @Override
    public void postProcess() { super.postProcess(); }
}
