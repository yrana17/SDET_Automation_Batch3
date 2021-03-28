package json;

import java.io.FileReader;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class JsonReading {

	public static void main(String[] args) {

		
		try
		{
			FileReader fr = new FileReader("src/main/resources/Test.json");
			JsonParser jsonParser = new JsonParser();
			
			JsonObject obj=jsonParser.parse(fr).getAsJsonObject();
			
			System.out.println(obj.get("employee").isJsonObject());
			System.out.println(obj.get("employee").isJsonArray());
			
			
			JsonArray arr=obj.get("employee").getAsJsonArray();
			
			
			
			System.out.println(arr.get(1));
			System.out.println(arr.get(1).getAsJsonObject().get("name").getAsString());
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
