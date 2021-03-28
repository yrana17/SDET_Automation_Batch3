package json;

import java.io.FileWriter;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonWriting {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		JSONObject hm = new JSONObject();
		hm.put("firstname", "test1");
		hm.put("lastname", "test2");
		hm.put("email", "test001@gmail.com");

		HashMap<String, String> h = new HashMap<String, String>();
		h.put("add1", "House No-15, Main Street");
		h.put("City", "New Delhi");
		h.put("Zip", "110001");
		h.put("Country", "India");

		hm.put("address", h);

		JSONArray arr = new JSONArray();

		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("empname", "e01");
		h1.put("empid", "eid01");

		arr.add(h1);

		//h1 = new HashMap<String, String>();
		h1.put("empname", "e02");
		h1.put("empid", "eid02");

		arr.add(h1);

		hm.put("EmployeeDetails", arr);

		try {
			FileWriter fw = new FileWriter("src/main/resources/TestJsonWriting.json");
			fw.write(hm.toJSONString());
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
