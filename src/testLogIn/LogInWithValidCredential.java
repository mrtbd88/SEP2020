package testLogIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Config;
import pageHelper.LocatorAndValue;



public class LogInWithValidCredential extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
	@Test(priority=1)
	public void logInWithValidCredential(){
		System.out.println ("login With Valid Credential");
		// click on sign in link from header
		clickByXpath (signIn.signinlinkloc);
		
		//Input email address
		typeByXpath (signIn.emailloc, signIn.emailval);
	
		
		//Input password
		typeByXpath (signIn.passloc, signIn.passval);
		
		// click Sign In button after entering the password
		clickByXpath (signIn.loginloc);
		
		
		//Assert
//		String act = driver.findElement(By.xpath(signIn.myActualIDLoc)).getText(); 
//		String exp = "MRTBD88";
//		Assert.assertEquals(act, exp);
//		
	
		
	}
}
