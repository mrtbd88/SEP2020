package testLogIn;

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
		
      }
//      @Ignore("working on it")
      @Test(priority=4,enabled = true)
      public void Tours(){
    		System.out.println ("Test Tours link");
    		
      }
      @Test(priority=5,enabled = false)
      public void Charters(){
    		System.out.println ("Test Tours link");
    	
  		
      
		
		

		
		
		//Assert
//				String act = driver.findElement(By.xpath(signIn.myActuallistproloc)).getText(); 
//				String exp = "List your property";
//				Assert.assertEquals(act, exp);
//				
		


   }
	
}
