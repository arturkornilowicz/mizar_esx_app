package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Type extends XMLElement {

    public Type(Element element) {
        super(element);
    }

    public static Type buildType(Element element) {
        switch (element.getName()) {
            case ESXElementName.CLUSTERED_TYPE:
                return new ClusteredType(element);
            case ESXElementName.STANDARD_TYPE:
                return new StandardType(element);
            case ESXElementName.STRUCT_TYPE:
                return new StructType(element);
            default:
                Errors.error(element, "Missing Element in buildType [" + element.getName() + "]");
                return null;
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {}

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
