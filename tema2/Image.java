package Lab1;

public class Image implements Element 
{
	String image;
	
	public Image(String image)
	{
		this.image=image;
	}
	
	public void print()
	{
		System.out.println("Image with name: " + image);
	}
}
