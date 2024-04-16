package org.xyz.automation.fb;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DifferentControl
{
	WebDriver driver;
	
	@Test
	public void loginpage() throws Exception
	{
		driver= new ChromeDriver();   //launch chrome browser
		
		driver.manage().window().maximize(); 
		
		driver.get("https://thetestingworld.com/testings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.name("fld_username")).sendKeys("user1");
		
		driver.findElement(By.name("fld_username")).clear();
		
		driver.findElement(By.name("fld_username")).sendKeys("user2");
		
		WebElement b = driver.findElement(By.cssSelector("[value='home']"));
		b.click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //false
		
		driver.findElement(By.name("terms")).click();
		
		System.out.println(driver.findElement(By.name("terms")).isSelected()); //true
		
		Select gen = new Select(driver.findElement(By.name("sex")));
		//gen.selectByIndex(1);
		//gen.selectByValue("2");
		gen.selectByVisibleText("Male");
		//gen.deselectByIndex(1);
		//gen.deselectAll();
		
		Select con = new Select(driver.findElement(By.name("country")));
		con.selectByVisibleText("United States");
		
		Select st = new Select(driver.findElement(By.name("state")));
		
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
	//	wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.id("stateId")), "Arizona"));
		
		
		st.selectByVisibleText("Florida");
		
		Select ct = new Select(driver.findElement(By.name("city")));
		ct.selectByVisibleText("Beach");
		
		//driver.findElement(By.className("displayPopup")).click();
		
	}
	
	
	
}
