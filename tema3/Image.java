package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Image implements Element 
{
	String image;
	List <Element> elements = new ArrayList <Element>();
	
	public Image(String image)
	{
		this.image=image;
	}
	
	public void print()
	{
		System.out.println("Image with name: " + image);
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
