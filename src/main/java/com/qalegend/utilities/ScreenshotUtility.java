package com.qalegend.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

import com.qalegend.base.Base;

public class ScreenshotUtility extends Base {
	
	public static void takeScreenshot(String name) throws IOException {

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File screenshot = takesScreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenshot, new File(".//src/main//resources/screenshot//" + name + ".png"));

    }
}
