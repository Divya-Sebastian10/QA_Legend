package com.qalegend.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.qalegend.base.Base;
import com.qalegend.pages.AppPage;
import com.qalegend.pages.LoginPage;
import com.qalegend.pages.UserManagement;
import com.qalegend.dataprovider.DataProviders;
public class UserManagementTest extends Base{
	LoginPage login;
	UserManagement user;
	AppPage app;
	@Test(dataProvider = "userCredentials", dataProviderClass = DataProviders.class,priority=1,description = "TC008 Verify UserManagement Tab",groups = {"Regression"})
  public void verifyUserManagement(String uName,String Pswd){
		login=new LoginPage(driver);
		user=new UserManagement(driver);
		login.enterUserName(uName);
		login.enterPassword(Pswd);
		login.submitLogin();
		app=new AppPage(driver);
	    app.clickALert();
		user.userManageClick();
		user.userTabClick();
		String actual=user.userPageTitle();
		System.out.println(actual);
		String expected ="Users - QAlegend";
		Assert.assertEquals(actual, expected);
}
	@Test(dataProvider = "searchUser",dataProviderClass = DataProviders.class,priority=2,description = "TC009 Verify search user functionality",groups = {"Regression"})
	  public void searchUserButton(String uName,String Pswd,String search) throws InterruptedException{
			
		login=new LoginPage(driver);
		user=new UserManagement(driver);
		login.enterUserName(uName);
		login.enterPassword(Pswd);
		login.submitLogin();
		app=new AppPage(driver);
	    app.clickALert();
		user.userManageClick();
		user.userTabClick();
		user.userSearch(search);
			
	}
}
