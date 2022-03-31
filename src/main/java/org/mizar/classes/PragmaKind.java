package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class PragmaKind extends Item {

    public PragmaKind(Element element) {
        super(element);
    }

    public static PragmaKind buildPragmaKind(Element element) {
        switch (element.getName()) {
            case ElementNames.CANCELED:
                return new Canceled(element);
            case ElementNames.NOTION_NAME:
                return new NotionName(element);
            case ElementNames.UNKNOWN:
                return new Unknown(element);
            default:
                Errors.error(element, "Missing Element in buildPragmaKind [" + element.getName() + "]");
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
