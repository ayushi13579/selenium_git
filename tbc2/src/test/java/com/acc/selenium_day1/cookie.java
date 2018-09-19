package com.acc.selenium_day1;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class cookie {
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
		return new ChromeDriver(); 
} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"<C:\\Users\\A07208trng_b4a.04.28\\Documents\\Advance selenium drivers\\geckodriver.exe");
			return new FirefoxDriver();
		} else { 
	System.out.println("Browser name invalid");
			return null;
		}
		} 
	WebDriver driver;
	String browser = "chrome";
	
	@BeforeMethod
	public void openbrowser () {
		driver = cookie.getDriver(browser);
	}
	
	
	
	
	@Test
	public void testcase10() {
	driver.manage().deleteAllCookies();
	driver.get("https://www.google.com");
	Cookie cookie=new Cookie("username","TestmeApp");
	driver.manage().addCookie(cookie);
	
	Set<Cookie> cookie_set=driver.manage().getCookies();

	for (Cookie temp:cookie_set) {
	System.out.println("Name of the cookie:" +temp.getName()+ "and its value : "+temp.getValue()+" get domain : "+temp.getDomain()+" get path : "+temp.getPath()+"and its expiry date: "+temp.getExpiry()+" Cookie is secured : "+temp.isSecure());
	}
	
}

}
