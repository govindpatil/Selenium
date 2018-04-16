package com.ram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class One {

	public static void main(String[] args) {

		System.setProperty("webdriver.gecko.driver", "D:\\New Selenium\\geckodriver-v0.19.1-win32\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
	
		driver.get("http://toolsqa.com/selenium-webdriver/how-to-use-geckodriver/");
		String tt=driver.getTitle();
		System.out.println("Pge title is" +tt);
			
		
		
		

	}

}
