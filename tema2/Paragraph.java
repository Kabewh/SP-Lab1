package Lab1;

public class Paragraph implements Element 
{
	String paragraph;
	
	public Paragraph(String paragraph)
	{
		this.paragraph=paragraph;
	}
	
	public void print()
	{
		System.out.println("p=Paragraph with name: " + paragraph);
	}
}