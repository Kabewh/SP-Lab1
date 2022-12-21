package Lab1;

public class AlignCenter implements AlignStrategy{

	
	public AlignCenter()
	{
	}

	@Override
	public void Render(Paragraph paragraph) {
		System.out.println("##" + paragraph.getText() + "##");
		
	}
	
	
}
