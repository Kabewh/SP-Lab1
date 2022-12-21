package Lab1;
import java.util.ArrayList;
import java.util.List;

public class Book 
{
	String title;
	Author author;
	List <Element> elements = new ArrayList <Element>();
	
	
	public Book(String title)
	{
		this.title=title;
	}
	
	public void addAuthor(Author a)
	{
		author=a;
	}

	
	public void addContent(Element element) {
		elements.add(element);
		
	}
	
	
	public void print()
	{
		System.out.println("Title: " + title);
		author.print();
		for(Element element : elements)
			element.print();
	}
}
