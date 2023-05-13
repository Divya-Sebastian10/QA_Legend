package com.qalegend.utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtility {
  public static String getSystemDate() {
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	Date currentDate = new Date();
	String systemDate = dateFormat.format(currentDate);
	return systemDate;
   }
}
