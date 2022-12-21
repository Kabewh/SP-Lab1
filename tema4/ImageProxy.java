package Lab1;

import java.util.ArrayList;
import java.util.List;

public class ImageProxy implements Element {
	String url;
	double dim;
	List <Element> elements = new ArrayList <Element>();
	
	public ImageProxy(String image)
	{
		this.url = url;
		this.dim = dim;
	}
	
	public Image LoadImage(Image realImage) {
        if(realImage == null) {
        	realImage = new Image(url);
        }
        return realImage;
    }
	
	public void print()
	{
		System.out.println("Image url: " + url + " Image dim: " + dim);
		for(Element element : elements)
			element.print();
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
}
