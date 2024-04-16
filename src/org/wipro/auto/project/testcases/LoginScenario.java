package org.wipro.auto.project.testcases;

import org.testng.annotations.Test;
import org.wipro.auto.project.basePkg.BrowserInitiatie;
import org.wipro.auto.project.dataGenerator.TestDataGenerator;
import org.wipro.auto.project.pages.LoginPage;

public class LoginScenario extends BrowserInitiatie
{

	@Test(dataProvider="ddf",dataProviderClass=TestDataGenerator.class)
	public void loginFunctionaility(String username, String password) throws Exception
	{
		LoginPage login = new LoginPage(driver);
		
				
		login.enter_username(username);
		login.enter_password(password);
		
		login.click_loginbttn();
	}
	
	
	
	
}
