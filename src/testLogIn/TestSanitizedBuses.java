package testLogIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.Config;
import pageHelper.LocatorAndValue;

public class TestSanitizedBuses extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
	
	
      @Test(priority=2)
	public void ListYourProperty(){
		System.out.println ("Test Sanitized Buses");
		// click on Sanitized Buses link from header
		clickByXpath (signIn.sanitizedbuseslinkloc);
		
		// Assert 
				String act = driver.findElement(By.xpath(signIn.myActualIDLoc)).getText(); 
				// act is coming from Domain -- the one developer build and release
				// coding needed -- genius level 1
				String exp = "CONTRACT SERVICES"; // exp is coming from Requirement or Mock-up
				Assert.assertEquals(act, exp);

		
      }
//      @Ignore("working on it")
      @Test(priority=4,enabled = true)
      public void Tours(){
    		System.out.println ("Test Tours link");
//    		Click on Tour Link
    		clickByXpath (signIn.tourlinkloc);
    		
      }
      @Test(priority=5,enabled = true)
      public void Charters(){
    		System.out.println ("Test Tours link");
    		clickByXpath (signIn.chartersloc);
    	
  		
      
		
		

		
		
		//Assert
//				String act = driver.findElement(By.xpath(signIn.myActuallistproloc)).getText(); 
//				String exp = "List your property";
//				Assert.assertEquals(act, exp);
//				
		


   }
	
}
