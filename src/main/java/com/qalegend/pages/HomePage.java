package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qalegend.utilities.TestHelper;

public class HomePage extends TestHelper {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		  this.driver=driver;
		  PageFactory.initElements(driver, this);
	  }
	private final String profile="//span[text()=\"efg pqr\"]";
	@FindBy(xpath=profile)
	private WebElement user_profile;
	private final String signout="//a[text()=\"Sign Out\"]";
	@FindBy(xpath=signout)
	private WebElement sign_out;
	
	public void onClickProfile() {
		page.clickOnElement(user_profile);
	}
	public void onClickSignOut() {
		page.clickOnElement(sign_out);
	}
}
