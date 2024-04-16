package org.xyz.automation.fb;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleKeyboardMouse
{
	WebDriver driver;
	
	@Test
	public void handleFrames() throws Exception
	{
		driver= new ChromeDriver(); 
		driver.get("https://demoqa.com/frames");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'Sample Iframe')]")).getText());
		
		CaptureScreenprint.printscreen(driver,"handleFrames1");
		
		driver.switchTo().frame("frame1");
		
		System.out.println(driver.findElement(By.xpath("//*[contains(text(),'This is a sample page')]")).getText());
		
		CaptureScreenprint.printscreen(driver,"handleFrames2");
	
	}
		
	@Test(enabled=true)
	public void handleAlerts() throws Exception
	{
		driver= new ChromeDriver(); 
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.className("signinbtn")).click();
	
		driver.switchTo().alert().accept();
		
		CaptureScreenprint.printscreen(driver,"handleAlerts");
	}
		
	@Test(enabled=false)
	public void handleMouse() throws Exception
	{
		driver= new ChromeDriver(); 
		
		driver.get("https://www.mphasis.com/home.html");
		Actions act = new Actions(driver);
		//act.click(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		//act.doubleClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();
		
		//act.contextClick(driver.findElement(By.xpath("//a[text()='Our Approach']"))).perform();  //right click
		
		act.moveToElement(driver.findElement(By.xpath("//a[text()='Industries']"))).perform();
		//act.click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).perform();
		
		act.keyDown(Keys.CONTROL).click(driver.findElement(By.xpath("//span[contains(text(),'Hospitality')]"))).keyUp(Keys.CONTROL).perform();
		
		Set<String> windowsID = driver.getWindowHandles();
		
		System.out.println(windowsID);
		
		Iterator<String> itr = windowsID.iterator();
		
		String win1 = itr.next();  //first window
		String win2 = itr.next();  //second window
		//String win3 = itr.next();
		Thread.sleep(5000);
		driver.switchTo().window(win2);
		Thread.sleep(5000);
		driver.switchTo().window(win1);
		
	}
		
	@Test(enabled=false)
	public void handlekeyboard() throws Exception
	{
		driver= new ChromeDriver(); 
		
		driver.manage().window().maximize(); 
		
		driver.get("https:www.facebook.com");
		
		Actions act = new Actions(driver);
		
		act.sendKeys("user1").perform();
		act.sendKeys(Keys.COMMAND);
		act.keyDown(Keys.COMMAND);
		
		act.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).perform();
		
		//act.sendKeys(Keys.TAB).perform();
		//act.sendKeys("passsword123").perform();
		//act.sendKeys(Keys.ENTER).perform();
		
	
	}
}
