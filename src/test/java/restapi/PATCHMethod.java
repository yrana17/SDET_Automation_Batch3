package restapi;

import org.json.simple.JSONObject;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PATCHMethod {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		
		
		String baseUri = "http://localhost:3000/users";

		RestAssured.baseURI = baseUri;
		RequestSpecification httpreq = RestAssured.given();

		JSONObject hm = new JSONObject();
		hm.put("firstname", "UserFirstName6");

		httpreq.header("Content-Type", "application/json");

		httpreq.body(hm);

		Response resp = httpreq.patch("/6");

		System.out.println(resp.getStatusCode());

		System.out.println(resp.getBody().asString());

	}

}
