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
	private final String profile="//a[@class=\"dropdown-toggle\"]";
	@FindBy(xpath=profile)
	private WebElement user_profile;
	private final String profile_button="//a[@href='https://qalegend.com/billing/public/user/profile']";
	@FindBy(xpath=profile_button)
	private WebElement user_profilebutton;
	private final String signout="//a[text()='Sign Out']";
	@FindBy(xpath=signout)
	private WebElement sign_out;
	
	public void onClickUserProfile() {
		
		page.clickOnElement(user_profile);
	}
    public void onClickUserProfileButton() {
		
		page.clickOnElement(user_profilebutton);
	}
	public void onClickSignOut() {
		
		page.clickOnElement(user_profile);
		page.clickOnElement(sign_out);
	}
}
