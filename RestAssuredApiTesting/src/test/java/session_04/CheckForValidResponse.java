package session_04;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
//import static io.restassured.RestAssured.*;   //when run "public void GetsingleUser_BDDStyle()" method then uncomment it
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class CheckForValidResponse {
	
	@Test(enabled = false)
	public void GetsingleUser() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees/1";

		// Get request specification of the request
		RequestSpecification requestSpec = RestAssured.given();

		// call get method
		Response response = requestSpec.get();

		// get response code

		int statusCode = response.getStatusCode();

		// Validate actualStatusCode with expected
		Assert.assertEquals(statusCode/* actual status code */, 200/* expected status code */,
				"Correct status code receive");

	}
	
	@Test
	public void GetSingleUserValidableResponse() {

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1/employees/1";

		// Get request specification of the request
		RequestSpecification requestSpec = RestAssured.given();

		// call get method
		Response response = requestSpec.get();

		// get response code

		ValidatableResponse validateRes = response.then();

		// validate status code
		validateRes.statusCode(200);
	}
	
	@Test
	
	public void GetsingleUser_BDDStyle() {

		given()
		
		.when()
			.get("https://dummy.restapiexample.com/api/v1/employees/1")
			
			.then()
			.statusCode(200).statusLine("HTTP/1.1 200 OK");
	}

}
