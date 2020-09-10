package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Config extends WebDriverFunctions {

	@BeforeSuite
	public void startTestSuite(){
		getCurrentTime();
	}
							
	@BeforeMethod
	public void beforeEachTestMethod(){
		
		System.setProperty("webdriver.chrome.driver", (System.getProperty("user.dir")+"/drivers/chromedriver.exe"));
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mahfuj Tuhin\\eclipse-workspace\\NN07\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(45, TimeUnit.SECONDS);
		// open browser	
		driver.get("https://www.coachusa.com/");
	}
	

	@AfterMethod
	public void afterEachTestMethod(){
		// close browser
	    driver.close();
		System.out.println (" Test is ended and browser is closeded +++++++ ");
	}

	@AfterSuite
	public void tearDown(){
//		driver.quit();
		System.out.println (" Terminated WD +++++++ ");
		
		
	
				
	}

}
