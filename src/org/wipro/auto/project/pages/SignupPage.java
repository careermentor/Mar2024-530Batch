package org.wipro.auto.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.wipro.auto.project.utilitiesPkg.ReadPropFile;

public class SignupPage {

	WebDriver driver;
	
	public SignupPage(WebDriver driver) 
	{
		this.driver=driver;
	}

	public void click_createnewaccountbttn() throws Exception
	{
		driver.findElement(By.xpath(ReadPropFile.readelementprop("fb_login_createnewaccount_xpath"))).click();
	}
	
	public void enter_firstname(String fname) throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementprop("fb_signup_firstname_name"))).sendKeys(fname);
	}
	
	public void select_birthday(String day)
	{
		Select dobd = new Select(driver.findElement(By.name("birthday_day")));
		
		dobd.selectByVisibleText(day);
	}
	
	
	public void click_signupbttn() throws Exception
	{
		driver.findElement(By.name(ReadPropFile.readelementprop("fb_signup_signupbttn_name"))).click();
	}
}
