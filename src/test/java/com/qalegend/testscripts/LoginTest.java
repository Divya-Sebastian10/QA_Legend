package com.qalegend.testscripts;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.qalegend.retryanalyzer.Retry;
import com.qalegend.base.Base;
import com.qalegend.constants.Constants;
import com.qalegend.dataprovider.DataProviders;
import com.qalegend.pages.LoginPage;
import com.qalegend.utilities.ExcelUtility;

public class LoginTest extends Base {
	LoginPage login;

	@Test(priority = 1, description = "TC001_verify login page title", groups = { "Smoke" })
	public void verifyLoginTitle() {
		login = new LoginPage(driver);
		String actualHomePageTitle = login.getLoginPageTitle();
		String expHomePageTitle = "Login - Demo POS";
		Assert.assertEquals(actualHomePageTitle, expHomePageTitle);
		System.out.println(actualHomePageTitle);
	}

	@Test(dataProvider="userCredentials",dataProviderClass = DataProviders.class,priority=1,description="TC002_verify valid login",groups={"Regression"})
	public void verifyLogin(String uName,String Pswd)
	{
		  login=new LoginPage(driver);
		  System.out.println("Username"+uName);
		  System.out.println("Password"+Pswd);
		  login.enterUserName(uName);
		  login.enterPassword(Pswd);
		  login.submitLogin();
          String actualUrl=login.currentUrl(); 
          String expectedUrl="https://qalegend.com/billing/public/home";
          Assert.assertEquals(actualUrl, expectedUrl);
          System.out.println("Login Successfully");
	}

	@Test(dataProvider="invalidUserCredentials",dataProviderClass = DataProviders.class,priority = 1, description = "TC003_verify invalid login", groups = { "Smoke" })
	public void verifyInvalidLogin(String uName,String Pswd) {
		login = new LoginPage(driver);
//		login.enterUserName("ad");
//		login.enterPassword("123456");
		login.enterUserName(uName);
		login.enterPassword(Pswd);
		login.submitLogin();
		String actualMessage = login.getErrorMessage();
		String expectedMessage = "These credentials do not match our records.";
		Assert.assertEquals(expectedMessage, actualMessage);
		System.out.println(actualMessage);

	}

	@Test(priority = 2, description = "TC004_verify remember button", groups = { "Regression" })
	public void verifyRememberButton() {
		login = new LoginPage(driver);
		login.clickRememberButton();
		boolean isChecked = login.checkRememberMeCheckboxSelected();
		Assert.assertTrue(isChecked);
		System.out.println("Checkbox is selected");
	}
	@Test(dataProvider="mailCredentials",dataProviderClass = DataProviders.class,priority = 2, description = "TC005_verify password reset link", groups = { "Regression" })
	public void verifyResetLink(String email) {
		login = new LoginPage(driver);
		login.resetLink();
		login.enterEmail(email);
		login.sendResetPassword();
	}

}