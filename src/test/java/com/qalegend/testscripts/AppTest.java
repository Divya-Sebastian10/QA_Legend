package com.qalegend.testscripts;

import org.testng.annotations.Test;

import com.qalegend.base.Base;
import com.qalegend.pages.AppPage;

public class AppTest extends Base {
	AppPage app;
  @Test
  public void endTour() {
	  app.clickALert();
  }
}
