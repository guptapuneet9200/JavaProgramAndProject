package session_12;

import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class DeserializationJsonDemo {

	/* 1) Object (Or class object) to Byte stream (or json data) is called Serialization
	 * 2) Byte stream to oject us called De-Serialization
	 */
	
	@Test
	public void createUser() {
		
		// https://reqres.in/api/users
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.baseUri("https://reqres.in");
		reqSpec.basePath("/api/users");
		
		
		//Create Request Body
		JSONObject payload = new JSONObject();
		payload.put("name", "Punit");
		payload.put("job", "QA");
		
		//Perform post request
		
		Response resp=	reqSpec.
		contentType(ContentType.JSON).
		body(payload.toJSONString()).
		post();
		
		ResponseBody responseBody = resp.getBody();
		
		//Deserialization responseBody i.e. json response body to class object
		
		/*Note 1.: JsonPostRequestResponse is naam ki class bne hue hai follow that class also.
		 * 2. Yeh api run krne pr fail ho rhe hai kyunki api wrk ni kr rhe hai
		 */
		
		JsonPostRequestResponse responseClass = responseBody.as(JsonPostRequestResponse.class);
		
		Assert.assertEquals(responseClass.name, "Punit","check for name .");
		Assert.assertEquals(responseClass.job, "QA","check for QA .");
	}
}

