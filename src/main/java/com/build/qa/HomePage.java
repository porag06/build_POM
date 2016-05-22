package com.build.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;


public class HomePage extends PageBase{
	
	protected WebElement Search;
	private WebElement popup;
	

	public HomePage (WebDriver driver) {
		super(driver);
	}

	
	public void VerifyTitle(){
		String title = driver.getTitle();
	    Assert.assertTrue(title.contains(" "));
	    System.out.println(title);
	}
	
	public WebElement popup(){
 		try {
 			WebElement pop = waitForElement(By.xpath(".//*[@id='splash-cta-container']/a"));
 			Highlight(pop);
 	 		pop.click();
		} catch (Exception e) {
		}
		return popup;
		
	}
	
	public WebElement Search(String search_product){
 		WebElement Search = waitForElement(By.id("search_txt"));
 		Highlight(Search);
 		Search.sendKeys(search_product);
 		Search.sendKeys(Keys.ENTER);
 		return Search;
	}

}
