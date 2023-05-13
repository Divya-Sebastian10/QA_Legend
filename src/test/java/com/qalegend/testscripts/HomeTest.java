package com.qalegend.testscripts;

import org.testng.annotations.Test;
import com.qalegend.base.Base;
import com.qalegend.pages.HomePage;


public class HomeTest extends Base {
	HomePage home;
	 @Test(priority=1,description="TC001_verify profile",groups= {"Smoke"})
	  public void verifyProfile()
	  {
	  home=new HomePage(driver);
	  home.onClickProfile();
	  }
	 @Test(priority=1,description="TC002_verify signOut",groups= {"Smoke"})
	  public void verifySignOut() 
	  {
	   home = new HomePage(driver);
	   home.onClickSignOut();
	  }
}
