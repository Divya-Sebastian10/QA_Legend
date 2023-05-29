package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qalegend.utilities.TestHelper;


public class AppPage extends TestHelper {
	public WebDriver driver;
	public AppPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	private final String _appTour="//button[@class='btn btn-default btn-sm']";
	@FindBy(xpath = _appTour)
	private WebElement appTour;
	public void clickALert()
	{
		page.clickOnElement(appTour);
	}
}
