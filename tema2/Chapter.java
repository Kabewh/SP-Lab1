package Lab1;

import java.util.ArrayList;
import java.util.List;

public class Chapter 
{
	String chapter;
	List <SubChapter> sub_chapters = new ArrayList <SubChapter>();
	
	public Chapter(String chapter)
	{
		this.chapter=chapter;
	}
	
	public int createSubChapter(String subch)
	{
		sub_chapters.add(new SubChapter(subch));
		return sub_chapters.indexOf(sub_chapters.size() - 1);
	}
	
	public SubChapter getSubChapter(int index)
	{
		return sub_chapters.get(index);
	}
	
	public void print()
	{
		System.out.println("Chapter: " + chapter);
		for(SubChapter subch : sub_chapters)
		{
			System.out.println();
			subch.print();
		}
	}
}

