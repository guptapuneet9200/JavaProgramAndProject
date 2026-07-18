package testNG;

import org.testng.annotations.Test;

public class Annotation1 {

//	@Test(description="This is test case 1")
//	@Test(priority =-1)
	@Test(dependsOnMethods = {"testCase3"})
	public void testCase1() {
		System.out.println("Mobile login Test Case");
	}


	
//	@Test(description="This is test case 2")
//	@Test(timeOut=200)
//	@Test(priority =2)
	@Test
	public void testCase2() {

		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Web login Test Case");
	}


//	@Test(description="This is test case 3")

	@Test
	public void testCase3() {
		System.out.println("API login Test Case");
	}

	
//	@Test(priority =0)
	@Test
	public void testCase4() {
		System.out.println("Laptop login Test Case");
	}


}
