package com.build.qa;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class scriptBase {
	
	protected WebDriver driver;
	private AppPage apppage; 

 @BeforeMethod
 public void setUp(){
	 
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.navigate().to("http://www.build.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	
 }
 
 @AfterMethod
 public void afterMethod(){
	 
	 driver.close();
	 driver.quit();
 }
 
 
 public AppPage apppage(){
	 if(apppage == null);
	 return apppage = new AppPage(driver);
	 
 }
}



