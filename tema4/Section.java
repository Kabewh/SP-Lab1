package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Section implements Element
{
	String section;
	List <Element> elements = new ArrayList <Element>();
	
	public Section(String section)
	{
		this.section=section;
	}
	
	
	
	public void print()
	{
		System.out.println(section);
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
