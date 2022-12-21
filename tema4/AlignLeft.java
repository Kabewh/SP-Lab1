package Lab1;

public class AlignLeft implements AlignStrategy{

	
	public AlignLeft()
	{
	}

	@Override
	public void Render(Paragraph paragraph) {
		System.out.println("##" + paragraph.getText());
		
	}
	
	
}
