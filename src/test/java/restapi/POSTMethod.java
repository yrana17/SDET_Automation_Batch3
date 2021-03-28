package restapi;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class POSTMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		String baseUri = "http://localhost:3000/users";

		RestAssured.baseURI = baseUri;
		RequestSpecification httpreq = RestAssured.given();

		JSONObject hm = new JSONObject();
		hm.put("firstname", "User6");
		hm.put("lastname", "UserLast6");
		hm.put("courseid", Integer.parseInt("3"));

		httpreq.header("Content-Type", "application/json");

		httpreq.body(hm);

		Response resp = httpreq.post();

		System.out.println(resp.getStatusCode());

		System.out.println(resp.getBody().asString());

	}

}
