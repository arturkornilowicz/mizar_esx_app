package org.mizar.classes;

import java.util.*;
import lombok.*;
import org.dom4j.*;
import org.mizar.misc.*;

@Setter
@Getter
@ToString

public class Block extends XMLElement {

    private List<Item> items = new LinkedList<>();

    public Block(Element element) {
        super(element);
        for (Element element1: element.elements(ElementNames.ITEM)) {
            items.add(Item.buildItem(element1));
        }
    }

    public static Block buildBlock(Element element) {
        switch (element.attributeValue(AttributeNames.KIND)) {
            case "Case":
                return new Block(element);
            case "Definitional-Block":
                return new Block(element);
            case "Hereby-Reasoning":
                return new Block(element);
            case "Notation-Block":
                return new Block(element);
            case "Now-Reasoning":
                return new Block(element);
            case "Proof":
                return new Block(element);
            case "Registration-Block":
                return new Block(element);
            case "Scheme-Block":
                return new Block(element);
            case "Suppose":
                return new Block(element);
            default:
                Errors.error(element, "Missing Element in buildBlock [" + element.attributeValue(AttributeNames.KIND) + "]");
                return null;
        }
     }

    @Override
    public void preProcess() {
        super.preProcess();
    }

    @Override
    public void process() {
        for (Item item: items) {
            item.run();
        }
    }

    @Override
    public void postProcess() {
        super.postProcess();
    }
}
