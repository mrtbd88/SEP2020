package testLogIn;

import org.testng.annotations.Test;

import base.Config;
import pageHelper.LocatorAndValue;

public class TestListYourProperty extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
	@Test
	public void ListYourProperty(){
		System.out.println ("Test List Your Property of Expedia");
		// click on sign in link from header
		clickByXpath (signIn.listyourpropertyloc);
		
		
		
		//Assert
//				String act = driver.findElement(By.xpath(signIn.myActuallistproloc)).getText(); 
//				String exp = "List your property";
//				Assert.assertEquals(act, exp);
//				
		


   }
	
}
