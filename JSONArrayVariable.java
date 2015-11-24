public class JSONArrayVariable extends JSONVariable
{
	private JSONObject[] value;
	private int currSize;
	public JSONArrayVariable(String name)
	{
		super(name);
		this.value = new JSONObject[50];
		this.currSize = 0;
	}
	
	public void addJSONObject(JSONObject obj)
	{
		this.value[this.currSize] = obj;
		this.currSize++;
	}
	
	@Override
	void display() 
	{
		System.out.println("JSON Array - " + this.name + " -> Num Objects: " + this.currSize);
		for(int i = 0; i < this.currSize; i++)
		{
			this.value[i].display();
		}
	}

	@Override
	String exportToJSON() 
	{
		// TODO Auto-generated method stub
		return "\"" + this.name + "\"" + ":" + "["+ "{" + "\"" + this.name + "\":\"" + this.value + "\"" + "," + "\"" + this.name + "\":\"" + this.value + "\"" + "}" + "]";
	}
}
