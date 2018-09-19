package com.acc.selenium_day1;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class snapshot {
	
	public static void getscreenshot(WebDriver driver, String Filepath) {
		
		TakesScreenshot ss=((TakesScreenshot)driver);
		
		File src=ss.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(Filepath);
		FileUtils.copyFile(src, dest);
		
		
	}

}
