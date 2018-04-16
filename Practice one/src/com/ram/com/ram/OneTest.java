package com.ram.com.ram;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotEqualsDeep;
import static org.testng.Assert.assertNotSame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class OneTest {
	
	WebDriver driver;
	
	
  @Test
  public void f() {
	  driver.get("http://newtours.demoaut.com/");
	  String tt=driver.getTitle();
	  System.out.println("Page title is:" +tt);

	  driver.findElement(By.linkText("REGISTER")).click();
	  
	
String tt2 =  driver.getTitle();
System.out.println("login page title is" +tt2);


  
	  
	  
	  
	  	  
	  
	  
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.gecko.driver" , "D:\\\\New Selenium\\\\geckodriver-v0.19.1-win32\\\\geckodriver.exe");	  
	  
	  driver=new FirefoxDriver();

	  
	  
	  
  }

  @AfterMethod
  public void afterMethod() {
driver.quit();
  }

}
