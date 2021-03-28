package restapi;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class DELETEMethod {

	public static void main(String[] args) {

		String baseUri = "http://localhost:3000/users";

		RestAssured.baseURI = baseUri;
		RequestSpecification httpreq = RestAssured.given();

		Response resp = httpreq.delete("/6");
		System.out.println(resp.getStatusCode());

	}

}
