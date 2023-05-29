package com.qalegend.dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import com.qalegend.constants.Constants;
import com.qalegend.utilities.ExcelUtility;

public class DataProviders {
  ExcelUtility excelUtility = new ExcelUtility();
  @DataProvider(name="userCredentials")
  public Object[][] UserCredentials() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+Constants.EXCEL_PATH, "LoginData");
	  //Object[][] data= ExcelUtility.getDataFromExcel("C:\\Users\\ASUS\\eclipse-workspace\\QALegendBilling\\src\\main\\resources\\ExcelData.xlsx", "LoginData");
	  return data;
  }
  @DataProvider(name="invalidUserCredentials")
  public Object[][] MailCredentials() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+Constants.EXCEL_PATH, "InvalidLoginData");
	  //Object[][] data= ExcelUtility.getDataFromExcel("C:\\Users\\ASUS\\eclipse-workspace\\QALegendBilling\\src\\main\\resources\\ExcelData.xlsx", "LoginData");
	  return data;
  }
  @DataProvider(name="mailCredentials")
  public Object[][] InvalidUserCredentials() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+Constants.EXCEL_PATH, "MailReset");
	  //Object[][] data= ExcelUtility.getDataFromExcel("C:\\Users\\ASUS\\eclipse-workspace\\QALegendBilling\\src\\main\\resources\\ExcelData.xlsx", "LoginData");
	  return data;
  }
  @DataProvider(name="searchUser")
  public Object[][] SearchUserCredentials() throws InvalidFormatException, IOException {
	  Object[][] data= ExcelUtility.getDataFromExcel(System.getProperty("user.dir")+Constants.EXCEL_PATH, "SearchUser");
	  //Object[][] data= ExcelUtility.getDataFromExcel("C:\\Users\\ASUS\\eclipse-workspace\\QALegendBilling\\src\\main\\resources\\ExcelData.xlsx", "LoginData");
	  return data;
  }
}
