package Lab1;

import java.util.List;

public class Author 
{
	String name;
	
	public Author(String name)
	{
		this.name=name;
	}
	
	public String getAuthor() {
		return name;
	}


	public void print()
	{
		System.out.println("Author: " + name);
	}


	
	
}
