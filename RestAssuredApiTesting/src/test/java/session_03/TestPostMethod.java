package session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestPostMethod {
	
	
	@Test
	public void test03() {
		
		JSONObject jsonData = new JSONObject();
		jsonData.put("name", "Punit");
		jsonData.put("salary", "123");
		jsonData.put("age", "23");
		
		RestAssured.baseURI="http://dummy.restapiexample.com/create";
		RestAssured.given().header("Content-type", "applicaion/json").
		contentType(ContentType.JSON).
		body(jsonData.toJSONString()).
		when().post()
		.then().statusCode(405).log().all();
		
	}
}
