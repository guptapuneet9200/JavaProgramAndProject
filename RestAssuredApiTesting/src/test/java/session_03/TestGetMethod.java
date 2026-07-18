package session_03;

import org.testng.Assert;
import org.testng.annotations.Test;
// import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;
import io.restassured.response.Response;

public class TestGetMethod {

	@Test
	public void test01() {

//	Response response =	RestAssured.get("https://dummy.restapiexample.com/api/v1/employees");
		Response response = get("https://dummy.restapiexample.com/api/v1/employees");
		System.out.println("Response Body is :" + response.getBody().asString());
		System.out.println("Response Status is :" + response.getStatusCode());
		System.out.println("Response time is :" + response.getTime());
		System.out.println("Response Body is :" + response.getHeader("Content-type"));

		// Validate status code
		// expected status code=200

		int expectedStatusCode = 200;
		int actualStatusCode = response.getStatusCode();

		Assert.assertEquals(expectedStatusCode, actualStatusCode);
	}

	@Test
	public void test02() {
		// given, when, then

		baseURI = "https://jsonplaceholder.typicode.com/posts/1";
		given().when().get().then().statusCode(200);

	}

}
