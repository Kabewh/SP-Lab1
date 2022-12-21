package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Paragraph implements Element 
{
	String paragraph;
	List <Element> elements = new ArrayList <Element>();
	
	public Paragraph(String paragraph)
	{
		this.paragraph=paragraph;
	}
	
	public void print()
	{
		System.out.println("Paragraph with name: " + paragraph);
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