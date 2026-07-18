package session_13;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class QueryRequestSpecification {
	/*
	 * Here we learn about how to retrieve the data (like BaseUri, Path/Query Param, Headers data) from URL
	 */
	
	@Test
	public void createUser() {

		//Create Json Data

		JSONObject jsonData = new JSONObject();
		jsonData.put("name","Sumit");
		jsonData.put("job","QA");

		//Create request specification

		RequestSpecification reqSpec = RestAssured.given();

		//Specify Url
		reqSpec.baseUri("https://reqres.in")
		.basePath("/api/users")
		.contentType(ContentType.JSON)
		.body(jsonData.toJSONString());

		// REMEMBER => 'SpecificationQuerier' is a class , it contain 'query()' method
		QueryableRequestSpecification qrSpec = SpecificationQuerier.query(reqSpec);

		//Get base URI	
		String requestBaseUri= qrSpec.getBaseUri();
		System.out.println("Base Uri is "+requestBaseUri);

		//Get base Path	
		String requestBasePath= qrSpec.getBasePath();
		System.out.println("Base Path is "+requestBasePath);

		//Get Body
		String requestBody= qrSpec.getBody();
		System.out.println("Request Body is "+requestBody);	
		
		//Get All Headers
		
		Headers allheaders =qrSpec.getHeaders();
		
		System.out.println("---------------Request Header--------");
		for (Header header : allheaders) {
			
			System.out.println("Header name :"+header.getName()+"\tHeader value :"+header.getValue());
			
		}

	}
}
