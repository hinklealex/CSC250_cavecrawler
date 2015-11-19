
public class JSONArrayVariable extends JSONVariable
{
private int value;
	
	public JSONArrayVariable(String name, int value) 
	{
		super(name);
		this.value = value;
	}

	@Override
	void display() 
	{
		System.out.println("Number : " + this.name + " -> " + this.value);
	}

}
