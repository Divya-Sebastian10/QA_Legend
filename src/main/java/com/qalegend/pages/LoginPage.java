package com.qalegend.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

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
  private final String loginField="//button[@class='btn btn-primary']";
  @FindBy(xpath=loginField)
  private WebElement login_Field;
  private final String rememberButton ="//input[@name=\"remember\"]";
  @FindBy(xpath=rememberButton)
  private WebElement remember_Button;
  private final String errorMsg="//strong[text()=\"These credentials do not match our records.\"]";
  @FindBy(xpath=errorMsg)
  private WebElement error_Msg;
  private final String resetField = "//a[@class='btn btn-link']";
  @FindBy(xpath=resetField)
  private WebElement reset_Field;
  private final String email="//input[@id='email']";
  @FindBy(xpath=email)
  private WebElement email_field;
  private final String sendPassword = "//button[@class='btn btn-primary']";
  @FindBy(xpath=sendPassword)
  private WebElement send_Password;
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
  public String currentUrl()
  {
  	String url=page.getCurrentURL(driver);
  	return url;
  } 
  public void resetLink() {
	  page.clickOnElement(reset_Field);
  }
  public void enterEmail(String email) {
	  page.enterText(email_field, email);
  }
  public void sendResetPassword() {
	  page.clickOnElement(send_Password);
  }
  }
