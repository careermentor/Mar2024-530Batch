package org.wipro.auto.project.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project.basePkg.BrowserInitiatie;
import org.wipro.auto.project.pages.SignupPage;

public class SignupScenario extends BrowserInitiatie
{

	@Test
	public void signupfunct() throws Exception
	{
		SignupPage sign = new SignupPage(driver);
		
		sign.click_createnewaccountbttn();
		sign.enter_firstname("selenium");
		sign.select_birthday("5");
	}
	
}
