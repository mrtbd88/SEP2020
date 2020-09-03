package testLogIn;

import org.testng.annotations.Test;

import base.Config;
import pageHelper.LocatorAndValue;

public class LookingForScheduales extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
	@Test
	public void ListYourProperty(){
		System.out.println ("Test Bus Routes");
		// click on Bus Routes link from header
		clickByXpath (signIn.busrouteslinkloc);
		
		//Input Origin
		
		

		
		
		//Assert
//				String act = driver.findElement(By.xpath(signIn.myActuallistproloc)).getText(); 
//				String exp = "List your property";
//				Assert.assertEquals(act, exp);
//				
		


   }
	
}
