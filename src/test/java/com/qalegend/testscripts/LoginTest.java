package com.qalegend.testscripts;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qalegend.base.Base;
import com.qalegend.constants.Constants;
import com.qalegend.pages.LoginPage;
import com.qalegend.utilities.ExcelUtility;

public class LoginTest extends Base{
	  LoginPage login;
	  
	  @Test(priority=1,description="TC001_verify login page title",groups= {"Smoke"})
	  public void verifyLoginTitle()
	  {
	  login=new LoginPage(driver);
	  String actualHomePageTitle=login.getLoginPageTitle();
	  String expHomePageTitle="Login - Demo POS";
	  Assert.assertEquals(actualHomePageTitle, expHomePageTitle);
	  System.out.println(actualHomePageTitle);
	  }

	  @Test(dataProvider="UserCredentials",priority=2,description="TC002_verify valid login",groups= {"Regression"})
	public void verifyLogin(String uName,String Pswd)
	{
		  login=new LoginPage(driver);
		  login.enterUserName(uName);
		  login.enterPassword(Pswd);
		  login.submitLogin();
		  
	}
	  
//	  @Test(dataProvider="UserCredentials",priority=1,description="TC003_verify invalid login",groups= {"Smoke"})
//		public void verifyInvalidLogin(String uName,String Pswd)
//		{
//			  login=new LoginPage(driver);
//			  login.enterUserName(uName);
//			  login.enterPassword(Pswd);
//			  login.submitLogin();
//			  String actualMessage = login.getErrorMessage();
//			  String expectedMessage="These credentials do not match our records.";
//			  Assert.assertEquals(expectedMessage, actualMessage);
//			  System.out.println(actualMessage);
//			  
//		}
	  @Test(priority=2,description="TC004_verify remember button",groups= {"Regression"})
		public void verifyRememberButton()
		{
			  login=new LoginPage(driver);
			  login.clickRememberButton();
			  boolean isChecked = login.checkRememberMeCheckboxSelected();
			  Assert.assertTrue(isChecked);
			  System.out.println("Checkbox is selected");
		}
	  @DataProvider(name="UserCredentials")
	  public Object[][] UserCredentials() throws InvalidFormatException, IOException {
		  Object[][] data= ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+Constants.EXCEL_PATH, "LoginData");
		  //Object[][] data= ExcelUtility.getDataFromExcel("C:\\Users\\ASUS\\eclipse-workspace\\QALegendBilling\\src\\main\\resources\\ExcelData.xlsx", "LoginData");
		  return data;
	  }
	  
	}