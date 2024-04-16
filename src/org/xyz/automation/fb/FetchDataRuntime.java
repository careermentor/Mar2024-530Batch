package org.xyz.automation.fb;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FetchDataRuntime
{
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		driver= new ChromeDriver();   //launch chrome browser
		
		driver.manage().window().maximize(); 
		
		String ExpURL = "https://www.facebook.com/";
		
		driver.get(ExpURL);
		
		String ActURL = driver.getCurrentUrl();
		System.out.println(ActURL);
		
	//	Assert.assertEquals(ActURL, ExpURL);  //fail    --hard assertion
		
		//Step1
		
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(ActURL, ExpURL,"URL is not matched");  //
		
		String ExpTitle = "Facebook – log in or sign up";
		
		String ActTitle = driver.getTitle();
		System.out.println(ActTitle);
		
		sa.assertEquals(ActTitle, ExpTitle);
		
		String ExpUName = "Email address or phone number";
		String ActUName = driver.findElement(By.id("email")).getAttribute("placeholder");
		System.out.println(ActUName);
		
		sa.assertEquals(ActUName, ExpUName);
		
		//Step2
		
		String ExpLoginName = "Log in";
		String ActLogiNname = driver.findElement(By.name("login")).getText();
		System.out.println(ActLogiNname);
		
		sa.assertEquals(ActLogiNname, ExpLoginName);
		
		Point loclogn = driver.findElement(By.name("login")).getLocation();
		System.out.println(loclogn);
		
		boolean actstate = driver.findElement(By.name("login")).isEnabled();//true
		
		sa.assertEquals(actstate, true, "login button is not enabled");
		
		//System.out.println(driver.getPageSource());
		
		sa.assertAll();
		
	}
	
	
	
}
