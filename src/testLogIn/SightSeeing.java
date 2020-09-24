package testLogIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import pageHelper.LocatorAndValue;

public class SightSeeing extends Config {

	LocatorAndValue signIn = new LocatorAndValue();
	 
	
	
	
	@Test(priority=3)
    public void TestSightSeeing(){ 
		System.out.println ("Test Sight Seeing");
//	Click on Sight Seeing Link
		clickByXpath (signIn.sseeingloc);
		
		// Assert 
				String act = driver.findElement(By.xpath(signIn.myActualIDLoc)).getText(); 
				// act is coming from Domain -- the one developer build and release
				// coding needed -- genius level 1
				String exp = "CONTRACT SERVICES"; // exp is coming from Requirement or Mock-up
				Assert.assertEquals(act, exp);

		
    } 
	@Test(priority=6,enabled = true)
    public void AirportTransport(){
  		System.out.println ("Test Airport Transport Link link");
//  		Click on Airport Transport link
  		clickByXpath (signIn.airtraloc);
	}
}
