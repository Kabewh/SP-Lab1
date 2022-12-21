package Lab1;

import java.util.ArrayList;
import java.util.List;

public class TableOfContents implements Element{
	String something;
	List <Element> elements = new ArrayList <Element>();
	
	public TableOfContents(String something)
	{
		this.something=something;
	}
	
	public void print()
	{
		System.out.println(something);
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
