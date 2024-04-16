package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAutomation
{
	WebDriver driver;
	
	@BeforeMethod
	public void launchBrowser()
	{
		//WebDriverManager.chromedriver().setup();
		
		
		driver= new ChromeDriver();   //launch chrome browser
		
					
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(300));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	
	@AfterMethod
	public void closeBroswer()
	{
		driver.close();
		
	}
	

	@Test
	public void validatLogin()
	{
		driver.findElement(By.id("email")).sendKeys("modisantosh@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("pass1234");
		driver.findElement(By.cssSelector("[type='submit']")).click();
		
		
	}
	
	@Test
	public void validateSignup() throws Exception
	{
		driver.findElement(By.linkText("Create new account")).click();
		
		//Thread.sleep(2000);
		
		driver.findElement(By.name("firstname")).sendKeys("Selenium");
		
		driver.findElement(By.name("websubmit")).click();
		
		
	}
	
}
