package src;

import java.util.LinkedList;

public class Table implements Element {
    String name;
    LinkedList<Element> elements;

    public Table(String name) {
        this.name = name;
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
        visitor.visitTable(this);
    }
}
