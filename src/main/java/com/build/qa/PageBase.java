package com.build.qa;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.google.common.base.Function;

public class PageBase {
	
	protected WebDriver driver;
	private String textToWait;
		
		public PageBase(WebDriver driver){
			this.driver = driver;
			
		}
		
		public void clickEx(WebElement element){
			((JavascriptExecutor) driver).executeScript("arguments[0].click()",
					element);
		
		}
		
		public void delayFor(int ms){
			try{
				Thread.sleep(ms);
			} catch (InterruptedException e){
			
		  }
		
		}
			public void Highlight(WebElement element) {
				for (int i = 0; i < 6; i++) {
					JavascriptExecutor js = (JavascriptExecutor) driver;
					js.executeScript(
							"arguments[0].setAttribute('style', arguments[1]);",
							element, "color: #FFDE00; border: 1px dashed #000000;");
					js.executeScript(
							"arguments[0].setAttribute('style', arguments[1]);",
							element, "");
				}
			}
			public WebElement waitForElement(final By locator) {

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(500, TimeUnit.MILLISECONDS)

				.ignoring(NoSuchElementException.class);

				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {

				return driver.findElement(locator);

				}

				});

				return foo;

				}



				public WebElement waitForElementdisplay(final By locator) {

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(500, TimeUnit.MILLISECONDS)

				.ignoring(NoSuchElementException.class);



				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {

				WebElement element = driver.findElement(locator);

				if (element.isDisplayed()) {

				return element;

				}

				return null;

				}

				});

				return foo;

				}



				public WebElement waitforElementText(final By locator, String text) {

				textToWait = text;

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(500, TimeUnit.MILLISECONDS)

				.ignoring(NoSuchElementException.class);



				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {

				WebElement element = driver.findElement(locator);

				if (element.getText().contentEquals(textToWait)) {

				return element;

				}

				return null;

				}

				});

				return foo;

				}



				public WebElement waitforElementNotDisplayed(final By locator, String text) {

				textToWait = text;

				Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)

				.withTimeout(30, TimeUnit.SECONDS)

				.pollingEvery(500, TimeUnit.MILLISECONDS)

				.ignoring(NoSuchElementException.class);



				WebElement foo = wait.until(new Function<WebDriver, WebElement>() {

				public WebElement apply(WebDriver driver) {

				WebElement element = driver.findElement(locator);

				if (element.isDisplayed()) {

				return null;

				}

				return element;



				}

				});



				return foo;

				}
			
			
		
	}






