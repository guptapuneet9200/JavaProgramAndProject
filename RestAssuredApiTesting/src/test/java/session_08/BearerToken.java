package session_08;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BearerToken {
	
	@Test
	
	public void Token() {
		
		RequestSpecification reqSpec= RestAssured.given();
		reqSpec.baseUri("https://gorest.co.in");
		reqSpec.basePath("/public/v2/users");
		
		JSONObject payload = new JSONObject();
		payload.put("name", "punitkumar");
		payload.put("gender", "male");
		payload.put("email", "punitkumar123@gmail.com");
		payload.put("status", "active");
		
		String AuthToken = "Bearer 3772300283f6feac76e8737e64fb198ef34e9ca350ea4a57fd5b303d34abd72d";
		reqSpec.headers("Authorization", AuthToken)
		.contentType(ContentType.JSON)
		.body(payload);
		
		Response resp =	reqSpec.post();
		
		System.out.println("Status line message is :"+resp.statusLine());
		System.out.println("Status body message is :"+resp.body().asString());
	}

}
