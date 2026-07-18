package session_08;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class OauthAuthorization {

	/*When third party client(i.e. gorest.co.in) send request to (i.e. microsoft.com) to access the data then we use oauth 2.0
	 * 
	 */
	
	//https://api-m.sandbox.paypal.com/v1/oauth2/token
	
	static String accessToken;
	@Test
	public void GetAccessToken() {
		String clientID= "AWSMM1bvkNeXHSO2915xvYCkRZg8YOMp5-bJHgNpWSn0SiqQqmpuviHOO1cR7vE84FnGPVtEFqnUfisr";
		String clientSecret ="EMrbRGw4JcWDu1FVA9nGAXjAZfod7rmirZm9fK-Q_z-pgXwSB85J7KnlCuMwyFrNfHNcotiT201s2zfy";
		
		
		RequestSpecification reqsec = RestAssured.given();
		reqsec.baseUri("https://api-m.sandbox.paypal.com");
		reqsec.basePath("/v1/oauth2/token");
		
	Response resp=	reqsec.auth().preemptive().basic(clientID,clientSecret).param("grant_type", "client_credentials").post();
		resp.prettyPrint();
		
		//Print response code and statusLine
		System.out.println("Response code"+resp.statusCode());
		System.out.println("Response statusline"+resp.statusLine());
		
		//Validate response code
		
		Assert.assertEquals(resp.statusCode(), 200,"check for response code");
		
		//get access token
		
		accessToken= resp.getBody().path("access_token");
		
		System.out.println("Access Token is "+ accessToken);
		
	}
	
	@Test (dependsOnMethods = "GetAccessToken")
	public void ListInvoice() {
		
		//We can call directly also without using Request Specification
	Response resp =	RestAssured.given().auth().oauth2(accessToken).queryParam("page", "3").queryParam("page_size", "4")
		.queryParam("total_count_required", "true")
		.get("https://api-m.sandbox.paypal.com/v1/invoicing/invoices");
		
	System.out.println("\n----------------ListInvoice--------------------");
		resp.prettyPrint();
		System.out.println("Response code id"+resp.statusCode());
		System.out.println("Response codeLine is "+resp.statusLine());
		Assert.assertEquals(resp.statusCode(), 200,"check for response code");
	}
	
	
}
