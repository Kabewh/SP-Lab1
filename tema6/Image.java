package src;

import java.util.LinkedList;
import java.util.concurrent.TimeUnit;

public class Image implements Element {
    String name;
    LinkedList<Element> elements;

    public Image(String name) {
        this.name = name;
        this.elements = new LinkedList<>();
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
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
        visitor.visitImage(this);
    }
}
