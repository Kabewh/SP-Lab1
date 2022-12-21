package Lab1;
import java.util.ArrayList;
import java.util.List;

public class Book 
{
	String title;
	Author author;
	List <Chapter> chapters = new ArrayList <Chapter>();
	
	
	public Book(String title)
	{
		this.title=title;
	}
	
	public void addAuthor(Author a)
	{
		author=a;
	}
	
	public int createChapter(String ch)
	{
		chapters.add(new Chapter(ch));
		return chapters.indexOf(chapters.size() - 1);
	}
	
	public Chapter getChapter(int index)
	{
		return chapters.get(index);
	}
	
	

	
	public void print()
	{
		System.out.println("Title: " + title);
		author.print();
		for(Chapter ch : chapters)
		{
			System.out.println();
			ch.print();
		}
	}
	
	
	
	
}
