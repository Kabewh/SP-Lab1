package src;

import java.util.LinkedList;

public class TableOfContents implements Element {
    String text;
    LinkedList<Element> elements;

    public TableOfContents(String text) {
        this.text = text;
        this.elements = new LinkedList<>();
    }

    @Override
    public void add(Element element) {
        elements.add(element);
    }

    @Override
    public void remove(Element element) {
        elements.remove(element);
    }

    @Override
    public Element get(int index) {
        return elements.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTableOfContents(this);
    }
}
