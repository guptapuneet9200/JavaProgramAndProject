package session_15;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class JsonObjectUsingJavaMapDemo {
	
	//Concept - 1
	@Test
	public void createAuthToken() {
		
		/*{
		 * "username":"admin",
		 * "password":"password123"		 * 
		 */
		
		Map<String, String> authToken = new HashMap<String, String>();
		authToken.put("username", "admin");
		authToken.put("password", "password123");
		
		Response response = RestAssured.given()
				.baseUri("https://restful-booker.herokuapp.com/auth")
				.contentType(ContentType.JSON)
				.body(authToken)
				.post();
		
		response.prettyPrint();
		
		
	}
	
//	Concept - 2
	
	@Test
	
	public void createUser() {
		/*{
		 * "firstName":"Amod",
		 * "lastName":"Mahajan",
		 * "age":28,
		 * "salary":1000.56,
		 * "IsMarried":true,
		 * "Hobbies":["Music","Computer","Games"],
		 * "TechSkill":{
		 * 				"Programming language":"Java",
		 * 				"WebAutomation":"Selenium",
		 * 				"Api Testing":"Rest Assured"
		 * 				}		 * 
		 */
		
		HashMap<String, Object> userData = new HashMap<String, Object>();
		userData.put("firstName", "Amod");
		userData.put("lastName", "Mahajan");
		userData.put("age", 28);
		userData.put("salary", 1000.56);
		userData.put("IsMarried", true);
		
		ArrayList<String> hobbies = new ArrayList<String>();
		hobbies.add("Music");
		hobbies.add("Computer");
		hobbies.add("Games");
		userData.put("Hobbies", hobbies);
		
		HashMap<String, Object> techskill = new HashMap<String, Object>();
		techskill.put("Programming language", "Java");
		techskill.put("WebAutomation", "Selenium");
		techskill.put("Api Testing", "Rest Assured");
		userData.put("TechSkill", techskill);
		
		
		Response response = RestAssured.given()
				.baseUri("https://reqres.in/api/users")
				.contentType(ContentType.JSON)
				.body(userData)
				.post();
		
		response.prettyPrint();
		
	}
}
