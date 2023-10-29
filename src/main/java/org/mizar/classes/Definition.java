package org.mizar.classes;

import lombok.*;
import org.dom4j.*;
import org.mizar.misc.Errors;
import org.mizar.xml_names.*;

@Setter
@Getter
@ToString

public class Definition extends Item {

    private Redefine redefine;
    private Pattern pattern;
    private Definiens definiens;

    public Definition(Element element) {
        super(element);
        redefine = new Redefine(element.element(ESXElementName.REDEFINE));
        pattern = Pattern.buildPattern(element.elements().get(1));
        if (element.elements().size() > 2 && element.elements().get(2).getName().equals(ESXElementName.STANDARD_MODE)) {
            if (element.elements().get(2).element(ESXElementName.DEFINIENS) != null) {
                definiens = Definiens.buildDefiniens(element.elements().get(2).element(ESXElementName.DEFINIENS));
            }
        } else {
            if (element.element(ESXElementName.DEFINIENS) != null) {
                definiens = Definiens.buildDefiniens(element.element(ESXElementName.DEFINIENS));
            }
        }
    }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        redefine.run();
        pattern.run();
        if (definiens != null) {
            definiens.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess(); }
}
