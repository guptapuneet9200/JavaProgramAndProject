package session_03;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class TestPutMethod {

	@Test
	
	public void test04() {
		
		JSONObject jsondata = new JSONObject();
		jsondata.put("employee_name", "Punit");
		jsondata.put("employee_salary", "10000");
		jsondata.put("employee_age", "61");
		jsondata.put("profile_image", "");
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees/1";
		RestAssured.given().header("Content-type","application/json")
		.contentType(ContentType.JSON)
		.body(jsondata.toJSONString())
		.when().put()
		.then().statusCode(405).log().all();
	}
}
