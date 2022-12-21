package Lab1;

import java.util.ArrayList;
import java.util.List;

public class SubChapter 
{
	String sub_chapter;
	List <Element> elements = new ArrayList <Element>();
	
	public SubChapter(String sub_chapter)
	{
		this.sub_chapter=sub_chapter;
	}
	
	public void addElement(Element element)
	{
		elements.add(element);
	}
	
	public void createNewParagraph(String paragraph)
	{
		elements.add(new Paragraph(paragraph));
	}
	
	public void createNewTable(String table)
	{
		elements.add(new Table(table));
	}
	
	public void createNewImage(String image)
	{
		elements.add(new Image(image));
	}
	
	public void print()
	{
		System.out.println("Subchapter: " + sub_chapter);
		elements.forEach(System.out::println);
		
	}

}
