package com.qalegend.utilities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class WaitUtility {
	public static final long IMPLICIT_WAIT = 30000;
	public static final long EXPLICIT_WAIT = 3000;
	 public static final long PAGELOAD_WAIT = 40;
	 public static final long HARD_WAIT = 2000;
	 public static final long FLUENT_WAIT = 30;
	 public static final long POOLING_TIME = 5;
	 public void setImplicitWait(WebDriver driver) {
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(IMPLICIT_WAIT));
	 }
	 public void setPageLoadWait(WebDriver driver) {
		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(PAGELOAD_WAIT));
	 }
	 public void setHardWait() {
		 try {
			 Thread.sleep(HARD_WAIT);
		 }catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	 }
	 public enum LocatorType{
		 Id,Name,Xpath,Classname,CssSelector,TagName,LinkText,PartialLinkText;
	 }
	 public void waitForElementtobeVisible(WebDriver driver,String target,Enum locatorType) {
		 WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(EXPLICIT_WAIT));
		 if(locatorType.equals(LocatorType.Id)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.id(target)));
		 }
		 if(locatorType.equals(LocatorType.Xpath)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(target)));
		 }
		 if(locatorType.equals(LocatorType.Classname)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.className(target)));
		 }
		 if(locatorType.equals(LocatorType.TagName)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName(target)));
		 }
		 if(locatorType.equals(LocatorType.LinkText)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText(target)));
		 }
		 if(locatorType.equals(LocatorType.PartialLinkText)) {
			 driverWait.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText(target)));
		 }
		 else {
			 throw new RuntimeException("Invalid Locator");
		 }
	 }
}
