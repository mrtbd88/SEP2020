package testLogIn;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import base.Config;
import pageHelper.LocatorAndValue;



public class LogInWithValidCredential extends Config{

	LocatorAndValue signIn = new LocatorAndValue();
	
	@Test
	public void logInWithValidCredential(){
		System.out.println ("login With Valid Credential");
		// click on sign in link from header
		clickByXpath (signIn.signinlinkloc);
		
		//Click on again sign in link
		clickByXpath (signIn.signinlinklocagain);
		
		//Input email address
		typeByXpath (signIn.emailloc, signIn.emailval);
		
		// click continue button after entering the email
		clickByXpath (signIn.continuebuttonloc);
		
		//Input password
		typeByXpath (signIn.passloc, signIn.passval);
		
		// click Sign In button after entering the password
		clickByXpath (signIn.lastsigninbuttonloc);
		
		
		//Assert
		String act = driver.findElement(By.xpath(signIn.myActualFullNameLoc)).getText(); 
		String exp = "Mahfujur";
		Assert.assertEquals(act, exp);
		
	
		
	}
}
