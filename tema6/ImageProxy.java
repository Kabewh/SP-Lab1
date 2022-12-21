package src;

import java.util.LinkedList;

public class ImageProxy implements Element {
    String name;
    Image realimg = null;

    public ImageProxy(String name) {
        this.name = name;
    }

    @Override
    public void add(Element element) {
        loadImage();
        realimg.add(element);
    }

    @Override
    public void remove(Element element) {
        loadImage();
        realimg.remove(element);
    }

    @Override
    public Element get(int index) {
        loadImage();
        return realimg.get(index);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImageProxy(this);
    }

    void loadImage() {
        if (realimg == null) {
            realimg = new Image(name);
        }
    }

    public Image getRealimg() {
        loadImage();
        return realimg;
    }
}
