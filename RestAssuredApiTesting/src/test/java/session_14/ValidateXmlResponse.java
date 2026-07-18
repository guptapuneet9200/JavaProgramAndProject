package session_14;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.path.xml.XmlPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.List;

import org.hamcrest.Matchers; 
public class ValidateXmlResponse {

	@Test(enabled = false)

	public void AddPet() {

		// Base uri => https://petstore.swagger.io/v2/pet
		String xmlData="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"
				+ "<Pet>\r\n"
				+ "	<id>0</id>\r\n"
				+ "	<Category>\r\n"
				+ "		<id>0</id>\r\n"
				+ "		<name>string</name>\r\n"
				+ "	</Category>\r\n"
				+ "	<name>doggie</name>\r\n"
				+ "	<photoUrls>\r\n"
				+ "		<photoUrl>string</photoUrl>\r\n"
				+ "	</photoUrls>\r\n"
				+ "	<tags>\r\n"
				+ "		<Tag>\r\n"
				+ "			<id>0</id>\r\n"
				+ "			<name>string</name>\r\n"
				+ "		</Tag>\r\n"
				+ "	</tags>\r\n"
				+ "	<status>available</status>\r\n"
				+ "</Pet>";

		//Below is the another way to pass the payload previous we are using JsonObject
		String JsonData="{\r\n"
				+ "  \"id\": 0,\r\n"
				+ "  \"category\": {\r\n"
				+ "    \"id\": 0,\r\n"
				+ "    \"name\": \"string\"\r\n"
				+ "  },\r\n"
				+ "  \"name\": \"doggie\",\r\n"
				+ "  \"photoUrls\": [\r\n"
				+ "    \"string\"\r\n"
				+ "  ],\r\n"
				+ "  \"tags\": [\r\n"
				+ "    {\r\n"
				+ "      \"id\": 0,\r\n"
				+ "      \"name\": \"string\"\r\n"
				+ "    }\r\n"
				+ "  ],\r\n"
				+ "  \"status\": \"available\"\r\n"
				+ "}";
		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.baseUri("https://petstore.swagger.io")
		.basePath("/v2/pet")
		.header("accept", "application/xml")  // Response xml format mai chaheyeh toh "application/xml" aur agr json mai chaheyeh toh "application/json"  
		.header("Content-Type", "application/xml") //Hum agr payload Json format mai denge toh "application/json" agr xml mai denge toh "application/xml"
		//	.body(JsonData);
		.body(xmlData);	
		Response response=reqSpec.post();

		// Print Response
		response.prettyPrint();

		System.out.println(response.statusCode());
		Assert.assertEquals(response.statusCode()/*Actual Status Code*/, /*Expected Status Code*/200,"Check status code");

		//Below we match the response body

		response.then().body("Pet.name", Matchers.equalTo("doggie"));

	}

	@Test
	public void GetTravellerData() {

		RequestSpecification reqSpec = RestAssured.given();
		reqSpec.baseUri("http://restapi.adequateshop.com")
		.basePath("/api/Traveler")
		.queryParam("page", "1")
		.header("accept", "application/xml");   

		Response response=reqSpec.get();
		response.prettyPrint();

		//Remember Below we validate the response data
		//APPROACH- 1
		response.then().body("TravelerinformationRespnse.travelers.Travelerinformation[2].name", Matchers.equalTo("vano"));

		//APPROACH- 2
		XmlPath objXmlPath= new XmlPath(response.asString());
		String TravellerName = objXmlPath.get("TravelerinformationRespnse.travelers.Travelerinformation[2].name").toString();
		Assert.assertEquals(TravellerName, "vano","check for traveller name");

		//Concept -1   Verify total Traveller to be 10

		List<String> listOfTraveller = objXmlPath.getList("TravelerinformationRespnse.travelers.Travelerinformation");
		int	totalTravelCount =	listOfTraveller.size();
		Assert.assertEquals(totalTravelCount, "10","check for total no. of trveller on page-1 ");

		//Concept -2   Verify name 'vano' in traveller list
		List<String> listOfTravellerName =	objXmlPath.getList("TravelerinformationRespnse.travelers.Travelerinformation.name");

		//Print all the names in the traveller list

		boolean found =false;
		for (String traveller : listOfTravellerName) {

			if(traveller.equals("vano")) {

				found=true;
				break;
			}

		}
		Assert.assertEquals(found, true);
	}
}
