package com.acc.selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Hello_selenium {

	public static void main(String[] args) {
	//System.out.println("hello selenium");
	
	//System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
	//ChromeDriver driver = new ChromeDriver();
	
	System.setProperty("webdriver.firefox.marionette","C://geckodriver.exe");
	FirefoxDriver driver = new FirefoxDriver();
	
    driver.get("http://newtours.demoaut.com/index.php");
//   driver.findElement(By.linkText("REGISTER")).click();
//   driver.findElement(By.name("firstName")).sendKeys("Rohit");
//   driver.findElement(By.name("lastName")).sendKeys("Suhag");
//   driver.findElement(By.name("phone")).sendKeys("1234567890");
//   driver.findElement(By.id("userName")).sendKeys("Demo@gmail.com");
//   driver.findElement(By.name("address1")).sendKeys("Bangalore");
//   driver.findElement(By.name("address2")).sendKeys("Urban area");
//   driver.findElement(By.name("city")).sendKeys("Bengluru");
//   driver.findElement(By.name("state")).sendKeys("Karnataka");
//   driver.findElement(By.name("postalCode")).sendKeys("560037");
//   
//   Select s = new Select(driver.findElement(By.name("country")));
//   //s.selectByVisibleText("INDIA");
//   s.selectByValue("92");
//   
//   driver.findElement(By.id("email")).sendKeys("Demo@gmail.com");
//   driver.findElement(By.name("password")).sendKeys("123456");
//   driver.findElement(By.name("confirmPassword")).sendKeys("123456");
//   
//   driver.findElement(By.name("register")).click();
//   
//  // driver.findElement(By.linkText(" sign-in ")).click();
//   driver.findElement(By.partialLinkText("sign-in")).click();
   
   driver.findElement(By.name("userName")).sendKeys("mercury");
   driver.findElement(By.name("password")).sendKeys("mercury");
   driver.findElement(By.name("login")).click();
   
   driver.findElement(By.xpath("//input[@value='oneway']")).click();
   driver.findElement(By.name("passCount")).sendKeys("1");
   driver.findElement(By.name("fromPort")).sendKeys("Paris");
   
   driver.findElement(By.name("fromMonth")).sendKeys("June");
   driver.findElement(By.name("fromDay")).sendKeys("19");
   driver.findElement(By.name("toPort")).sendKeys("Sydney");
   driver.findElement(By.name("toMonth")).sendKeys("July");
   driver.findElement(By.name("toDay")).sendKeys("16");
   
   driver.findElement(By.xpath("//input[@value='Business']")).click();
   
   driver.findElement(By.name("airline")).sendKeys("Unified Airlines");
   driver.findElement(By.name("findFlights")).click();

   driver.findElement(By.xpath("//input[@value='Pangea Airlines$362$274$9:17']")).click();
   driver.findElement(By.xpath("//input[@value='Unified Airlines$633$303$18:44']")).click();
   
   driver.findElement(By.name("reserveFlights")).click();
  
   driver.findElement(By.name("passFirst0")).sendKeys("Rohit");
   driver.findElement(By.name("passLast0")).sendKeys("Suhag");
   
   Select s = new Select(driver.findElement(By.xpath("//select[@name='pass.0.meal']")));
 //s.selectByVisibleText("HNML");
   s.selectByValue("HNML");
   
  Select s1= new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
  s1.selectByVisibleText("Diners Club");
  
    driver.findElement(By.name("creditnumber")).sendKeys("1234567890123456");
  Select s2 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_mn']")));
  //s2.selectByValue("08 \r\n" + 
  //		"                      ");
    
//  Select s3 = new Select(driver.findElement(By.xpath("//select[@name='cc_exp_dt_yr']")));
//  s3.selectByValue("2010");
//  
//  driver.findElement(By.name("cc_frst_name")).sendKeys("Rohit_CC");
//  driver.findElement(By.name("cc_mid_name")).sendKeys("Suhag");
//  driver.findElement(By.name("cc_last_name")).sendKeys("CC");
//  
  driver.findElement(By.name("ticketLess")).click();
//  
  // Select s = new Select(driver.findElement(By.xpath("//select[@name='creditCard']")));
   
  // driver.findElement(By.xpath("//input[@name='q']"));
	//driver.findElement(By.name("q")).sendKeys("selenium");
	//driver.close();
	
	}
}
