package testLogIn;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import base.Config;
import pageHelper.LocatorAndValue;

public class TestSanitizedBuses extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
//      @Ignore("working on it")
      @Test
	public void ListYourProperty(){
		System.out.println ("Test Sanitized Buses");
		// click on Sanitized Buses link from header
		clickByXpath (signIn.sanitizedbuseslinkloc);
		
		//Input Origin
		
		

		
		
		//Assert
//				String act = driver.findElement(By.xpath(signIn.myActuallistproloc)).getText(); 
//				String exp = "List your property";
//				Assert.assertEquals(act, exp);
//				
		


   }
	
}
