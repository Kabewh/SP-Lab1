package Lab1;

public class Table implements Element 
{
	String table;
	
	public Table(String table)
	{
		this.table=table;
	}
	
	public void print()
	{
		System.out.println("Table with name: " + table);
	}
}
