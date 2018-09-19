package com.acc.selenium_day1;

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
import org.testng.annotations.Test;

public class dropanddragexample {
	
	public static WebDriver getDriver(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver", 
				"C:\\chromedriver.exe");
		return new ChromeDriver(); 
} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", 
					"<C:<\\Users\\A07208trng_b4a.04.28\\Documents\\Advance selenium drivers\\geckodriver.exe>>");
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
		driver = dropanddragexample.getDriver(browser);
	}
		
	@Test(enabled=false)
	public void testcase() throws InterruptedException {
		driver.get("https://dhtmlx.com/docs/products/dhtmlxTree/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		WebElement src=driver.findElement(By.xpath("//*[@id=\"treebox1\"]/div/table/tbody/tr[2]/td[2]/table/tbody/tr[1]/td[4]"));
		WebElement dest=driver.findElement(By.xpath("//*[@id=\"treebox2\"]/div/table/tbody/tr[3]/td[2]/table/tbody/tr[1]/td[4]/span"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBY(0,1000)");
		
		Actions mouse=new Actions(driver);
		
		mouse.dragAndDrop(src, dest).perform();
		Thread.sleep(3000);
		}
	
	@AfterMethod
	public void closebrowser() {
		driver.quit();
	}
		
		@Test(enabled=false)
		public void testcase1() throws InterruptedException {
			System.out.println("here");
			
			driver.get("http://local:8083/TestMeApp/login.htm");
					
					Actions mouse1=new Actions(driver);
					WebElement uname=driver.findElement(By.name("username"));
					
					mouse1.moveToElement(uname).click().keyDown(uname, Keys.SHIFT)
					.sendKeys(uname, "sumit")
					.keyUp(uname, Keys.SHIFT)
					.doubleClick()
					
					.contextClick().build().perform();
					
					Thread.sleep(3000); 
						
				}
					
					@Test
					public void testcase2() throws InterruptedException, AWTException {
						driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
					driver.navigate().to("http://localhost:8083/TestMeApp/login.htm");
					Actions mouse2=new Actions(driver);
					WebElement fp=driver.findElement(By.id("sam"));
					mouse2.moveToElement(fp).perform();
							
					Robot win=new Robot();
					Thread.sleep(2000);
					win.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					win.keyPress(KeyEvent.VK_DOWN);
					Thread.sleep(2000);
					
					win.keyPress(KeyEvent.VK_ENTER);
					Thread.sleep(2000);
					
					}
					
		}
	


