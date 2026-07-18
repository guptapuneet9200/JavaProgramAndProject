import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class FirstGetRequest {

	@Test
	void testcase01() {

		Response res = RestAssured.get("https://jsonplaceholder.typicode.com/posts/1");
		System.out.println("Response of API Is  " + res.asString());
		System.out.println("Status code   " + res.getStatusCode());
	}
}
