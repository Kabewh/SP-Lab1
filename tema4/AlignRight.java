package Lab1;

public class AlignRight implements AlignStrategy{

	
	public AlignRight()
	{
	}

	@Override
	public void Render(Paragraph paragraph) {
		System.out.println(paragraph.getText() + "##");
		
	}
	
	
}
