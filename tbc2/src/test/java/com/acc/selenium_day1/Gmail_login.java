package com.acc.selenium_day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail_login {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","C://geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		
//		System.setProperty("webdriver.chrome.driver","C://chromedriver.exe");
//		ChromeDriver driver = new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//a[@class='gb_P']")).click();
    driver.findElement(By.xpath("//a[@class='gmail-nav__nav-link gmail-nav__nav-link__sign-in']")).click();
    driver.findElement(By.xpath("//input[@aria-label='Email or phone']")).sendKeys("rohitsuhag0001");
   // driver.findElement(By.className("identifier")).sendKeys("rohitsuhag0001");
    driver.findElement(By.xpath("//content[contains(.,'Next')]")).click();
    
    //driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc1234");
    //driver.findElement(By.className("password")).sendKeys("123456");
    //driver.findElement(By.xpath("//input[contains(@name,'password')]")).sendKeys("12345");
    //driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abcdefg");
    //driver.findElement(By.xpath("//input[@aria-label='Enter your password']")).sendKeys("123456");
   // driver.findElement(By.xpath("//span[contains(.,'Next')]")).click();
    
	}

}
