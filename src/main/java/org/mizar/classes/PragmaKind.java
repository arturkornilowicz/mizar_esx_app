package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class PragmaKind extends Item {

    public PragmaKind(Element element) {
        super(element);
    }

    public static PragmaKind buildPragmaKind(Element element) {
        switch (element.getName()) {
            case ESXElementName.CANCELED:
                return new Canceled(element);
            case ESXElementName.INSERT_SHORT_TEXT:
                return new InsertShortText(element);
            case ESXElementName.NOTION_NAME:
                return new NotionName(element);
            case ESXElementName.UNKNOWN:
                return new Unknown(element);
            case ESXElementName.URL:
                return new Url(element);
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
