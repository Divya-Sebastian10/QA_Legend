package com.qalegend.utilities;


import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class PageUtility {
	
 public String getPageTitle(WebDriver driver) {
	 String pageTitle = driver.getTitle();
	 return pageTitle;
 }
 public void getTagName(WebElement element) {
	 element.getTagName();
 }
 public void clickOnElement(WebElement element) {
	 element.click();
 }
 public void submitElement(WebElement element) {
	 element.submit();
 }
 public void get(WebDriver driver) {
	  driver.get("");
 }
 public void enterText(WebElement element, String text) {
	 element.sendKeys(text);
 }
 public void simpleAlert(WebDriver driver) {
	 Alert alert = driver.switchTo().alert();
	 alert.accept();
 }
 public void confirmationAlert(WebDriver driver) {
	 Alert alert = driver.switchTo().alert();
	 alert.dismiss();
 }
 public void promptAlert(WebDriver driver, String text) {
	 Alert alert = driver.switchTo().alert();
	 alert.sendKeys(text);
	 alert.accept();
 }
 public void rightClick(WebDriver driver, WebElement target) {
	 Actions actions = new Actions(driver);
	 actions.contextClick(target).build().perform();
 }
 public void doubleClick(WebDriver driver, WebElement target) {
	 Actions actions = new Actions(driver);
	 actions.doubleClick(target).build().perform();
 }
 public void mouseOverElement(WebDriver driver, WebElement target) {
	 Actions actions = new Actions(driver);
	 actions.moveToElement(target).build().perform();
 }
 public void DragAndDrop(WebDriver driver, WebElement source,WebElement destination) {
	 Actions actions = new Actions(driver);
	 actions.dragAndDrop(source, destination).build().perform();
 }
 public void DragAndDropByOffset(WebDriver driver, WebElement source, int x,int y) {
	 Actions actions = new Actions(driver);
	 actions.dragAndDropBy(source, x, y).build().perform();
 }
 public String getCurrentURL(WebDriver driver) {
     String currentURL = driver.getCurrentUrl();
	 return currentURL;
 }
 public void navigateBack(WebDriver driver) {
	 driver.navigate().back();
 }
 public void navigateForward(WebDriver driver) {
	 driver.navigate().forward();
 }
 public void navigateRefresh(WebDriver driver) {
	 driver.navigate().refresh();
 }
 public void navigateTo(WebDriver driver) {
	 driver.navigate().to("");
 }
 public void notify(WebDriver driver) {
	 driver.notify();
 }
 public void notifyAll(WebDriver driver) {
	 driver.notifyAll();
 }
 public void quit(WebDriver driver) {
	 driver.quit();
 }
 public void switchTo(WebDriver driver) {
	 driver.switchTo();
 }
 public void toString(WebDriver driver) {
	 driver.toString();
 }
 public void wait(WebDriver driver) throws InterruptedException {
	 driver.wait();
 }
 public void findElement(WebDriver driver) {
	 driver.findElement(By.id(""));
 }
 
 public String getPageSource(WebDriver driver) {
	String pageSource = driver.getPageSource();
	return pageSource;
 }
 public String getTitle(WebDriver driver) {
	 String title = driver.getTitle();
	 return title;
 }
 public String getWindowHandle(WebDriver driver) {
	 String windowHandle = driver.getWindowHandle();
	 return windowHandle;
 }
 public Set<String> getWindowHandles(WebDriver driver) {
	 Set<String> windowHandle = driver.getWindowHandles();
	 return windowHandle;
 }
 public String getErrorMessageText(WebElement element) {
	String errorMessage=element.getText();
	return errorMessage;
 }
 public void javaScriptValue(WebElement element,String text,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].value='text';", element);
		
	}
	public void javaScriptClick(WebElement element,WebDriver driver)
	{
		JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", element);
		
	}
	public Boolean isElementDisplayed(WebElement element)
	{
		boolean value=element.isDisplayed();
			return value;
		
	}
	

}
