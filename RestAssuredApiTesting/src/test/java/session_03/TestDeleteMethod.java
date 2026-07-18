package session_03;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class TestDeleteMethod {

	
	@Test
	
	public void test05() {
		
		RestAssured.baseURI="https://dummy.restapiexample.com/api/v1/employees/1";
		RestAssured.given()
		.when().delete()
		.then()
		.log().all()
		.statusCode(405);
	}
}
