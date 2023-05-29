package com.qalegend.testscripts;


import org.testng.annotations.Test;
import com.qalegend.base.Base;

import com.qalegend.dataprovider.DataProviders;
import com.qalegend.pages.AppPage;
import com.qalegend.pages.HomePage;
import com.qalegend.pages.LoginPage;



public class HomeTest extends Base {
	LoginPage login;
	HomePage home;
	AppPage app;
	@Test(dataProvider = "userCredentials", dataProviderClass = DataProviders.class,description="TC005_verify profile",priority=3,groups = {"Regression"})
	 public void verifyProfile(String uname,String pword) throws InterruptedException
	  {
		 login=new LoginPage(driver);
		 login.enterUserName(uname);
		 login.enterPassword(pword);
		 login.submitLogin();
	     home=new HomePage(driver);
	     app=new AppPage(driver);
	     app.clickALert();
	     home.onClickUserProfile();
	     home.onClickUserProfileButton();
	     Thread.sleep(3000);
	  }
	 @Test(dataProvider = "userCredentials", dataProviderClass = DataProviders.class,priority=4,description="TC006_verify signOut",groups= {"Smoke"})
	  public void verifySignOut(String uname,String pword) 
	  {
		 login=new LoginPage(driver);
		 login.enterUserName(uname);
		 login.enterPassword(pword);
		 login.submitLogin();
	     home = new HomePage(driver);
	     app=new AppPage(driver);
	     app.clickALert();
	     home.onClickSignOut();
	  }
	 
}
