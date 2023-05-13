package com.qalegend.dataprovider;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.DataProvider;

import com.qalegend.utilities.ExcelUtility;

public class DataProviders {
  ExcelUtility excelUtility = new ExcelUtility();
  @DataProvider(name="userData")
  public Object[][] userData() throws InvalidFormatException, IOException{

		Object[][] data= excelUtility.getDataFromExcel("C:\\Users\\ASUS\\Desktop\\ExcelData.xlsx", "LoginData");

		return data;

  }
}
