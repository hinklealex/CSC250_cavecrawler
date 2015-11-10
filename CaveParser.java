import java.io.File;
import java.util.Scanner;

public class CaveParser 
{
private String theJSON;

	
	public CaveParser(String json)
	{
		this.theJSON = json;
	}
	
	
	public static JSONObject parse(String theJSON2)
	{
		
		
		 for(int i = 0;i < theJSON2.length();i++){
		     char array = theJSON2.charAt(i);
		     if(array == '[')
		     {		
		    	 System.out.println("JSONObject begin");
		     }
		     else if (array == ']')
		     {
		    	 System.out.println("JSONObject end"); 
		     }
		     else if (array == '{')
		     {
		    	 System.out.println("JSONArray begin");
		     }
		     else if (array == '}')
		     {
		    	 System.out.println("JSONArray end");
		     }
		//will walk through our json string and create a JSONObject (which is a
		//collection of name/value pairs where values can be JSONObjects, JSONArrays,
		//or literals (like 5 or 7)
		
	}
		 return null;

	}
}
