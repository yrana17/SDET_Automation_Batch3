package restapi;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GETMethod {

	public static void main(String[] args) {

		String baseUri = "http://localhost:3000";
		String methodUrl = "/users";

		RestAssured.baseURI = baseUri;
		RequestSpecification httpreq = RestAssured.given();
		Response resp = httpreq.request(Method.GET, methodUrl);

		System.out.println("Response Code:" + resp.getStatusCode());

		System.out.println("Body:");
		System.out.println(resp.getBody().asString());

		System.out.println("Headers----");
		System.out.println(resp.getHeaders());

	}

}
