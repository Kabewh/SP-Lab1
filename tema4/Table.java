package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Table implements Element 
{
	String table;
	List <Element> elements = new ArrayList <Element>();
	
	public Table(String table)
	{
		this.table=table;
	}
	
	public void print()
	{
		System.out.println("Table with name: " + table);
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
