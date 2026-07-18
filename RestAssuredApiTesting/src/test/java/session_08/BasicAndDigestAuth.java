package session_08;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BasicAndDigestAuth {
	
	@Test
	
	public void BasicAuth() {
		
		RequestSpecification reqSpec=RestAssured.given();
		reqSpec.baseUri("http://httpbin.org");
		reqSpec.basePath("/basic-auth/punit/password");
		
	//	Response   resp =reqSpec.auth().basic("punit", "password").get();
		Response   resp =reqSpec.auth().preemptive().basic("punit", "password").get();
		
		System.out.println("Basic auth response is : "+resp.statusLine());
		System.out.println("Basic auth response body is : "+resp.body().asString());
		System.out.println("Basic auth response getbody is : "+resp.getBody().asString()); //body & getbody give same resp.
	}
	
	@Test
	
	public void DigestAuth() {
		RequestSpecification reqspec=RestAssured.given();
		reqspec.baseUri("http://httpbin.org");
		reqspec.basePath("/basic-auth/punit/password");
		
		Response resp=	reqspec.auth().digest("punit", "password").get();
		
		System.out.println("Basic auth response statusline is :"+resp.statusLine());
		System.out.println("Basic auth response body is :"+resp.getBody() );
	}

}
