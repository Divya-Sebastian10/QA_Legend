package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qalegend.utilities.TestHelper;

public class LoginPage extends TestHelper {
  WebDriver driver;
  
  public LoginPage(WebDriver driver) {
	  this.driver=driver;
	  PageFactory.initElements(driver, this);
  }
  private final String userNameField = "username";
  @FindBy(id=userNameField)
  private WebElement userName_Field;
  private final String passwordField="password";
  @FindBy(id=passwordField)
  private WebElement password_Field;
  private final String loginField="//button[@type=\"submit\"]";
  @FindBy(xpath=loginField)
  private WebElement login_Field;
  private final String rememberButton ="//input[@name=\"remember\"]";
  @FindBy(xpath=rememberButton)
  private WebElement remember_Button;
  private final String errorMsg="//strong[text()=\"These credentials do not match our records.\"]";
  @FindBy(xpath=errorMsg)
  private WebElement error_Msg;
  public String getLoginPageTitle() {
	String title = page.getPageTitle(driver);
	return title;
}
  public void enterUserName(String userName) {
	  page.enterText(userName_Field, userName);
  }
  public void enterPassword(String password) {
	  page.enterText(password_Field, password);
  }
  public void submitLogin() {
	  page.submitElement(login_Field);
  }
  public void clickRememberButton() {
	  page.clickOnElement(remember_Button);
  }
  public boolean checkRememberMeCheckboxSelected() {
	  boolean b = remember_Button.isSelected();
	  return b;
  }
  public String getErrorMessage()
  {
  	String msg=page.getErrorMessageText(error_Msg);
  	System.out.println(msg);
  	return msg;
  }
  }
