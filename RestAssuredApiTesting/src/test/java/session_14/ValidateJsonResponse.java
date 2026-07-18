package session_14;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class ValidateJsonResponse {
	
	/* JSON SYNTAX RULES
	 * -----------------
	 * 1) Data is in name/value pair
	 * 2) Data is separated by commas
	 * 3) Curly braces hold object
	 * 4) Square braces hold array
	 */
	// Here we learn how to validate the response data
	@Test
	public void ValidateJsonResponseBody() {
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.baseUri("https://reqres.in");
		reqSpec.basePath("/api/users?page=2");
		
		//Create get request
	Response response=	reqSpec.get();
	
	//read response body
	ResponseBody responseBody=	response.getBody();
	
			String responseString = responseBody.asString();
		//Print response body	
		System.out.println("response Body :"+responseString);
		
		//Check for presence of George in response Body
		
		Assert.assertEquals(responseString.contains("George"),true,"Check for presence of george");
		
		//Get Json path view of response body
		JsonPath jsonpath =	responseBody.jsonPath();
		String first_name =	jsonpath.get("data[4].first_name"); 
// "data[4].first_name"<- Yeh humko Json Path view ke site pr ja k json response body ko paste kr k next side pe path address mil jayega
		
		
		Assert.assertEquals(first_name, "George","Check for presence of first name George");
	}
}
