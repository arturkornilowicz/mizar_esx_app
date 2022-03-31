package org.mizar.classes;

import lombok.*;
import org.dom4j.*;

@AllArgsConstructor
@ToString
@Getter
@Setter

public class XMLElement {

    private Element element;

    public void preProcess() {}

    public void process() {}

    public void postProcess() {}

    public void run() {
        preProcess();
        process();
        postProcess();
    }
}
