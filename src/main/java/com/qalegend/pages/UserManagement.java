package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qalegend.utilities.TestHelper;
import com.qalegend.utilities.WaitUtility;

public class UserManagement extends TestHelper{
	public WebDriver driver;
    public WaitUtility utility;
	public UserManagement(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	private final String managementUser="//span[text()='User Management']";
	@FindBy(xpath=managementUser)
	private WebElement management_User;
	
	private final String userTab="//a[@href='https://qalegend.com/billing/public/users']";
	@FindBy(xpath=userTab)
	private WebElement user_Tab;
	

	private final String search_User="//input[@class='form-control input-sm']";
	@FindBy(xpath=search_User)
	private WebElement searchUser;
	
	public void userManageClick()
	{
		
		page.clickOnElement(management_User);
	}
	public void userSearch(String search) throws InterruptedException
	{
		//utility.setPageLoadWait(driver);
		Thread.sleep(60000);
		page.enterText(searchUser, search);
	}
	public boolean userManagementCheck()
	{
		boolean status=page.isElementDisplayed(user_Tab);
		return status;
	}
	public void userTabClick()
	{
		page.clickOnElement(user_Tab);
	}
	public String userPageTitle()
	{
		String s=page.getPageTitle(driver);
		return s;
	}
}
