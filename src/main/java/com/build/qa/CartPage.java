package com.build.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage extends PageBase{
	
	private WebElement SelectItem1;
	private WebElement SelectColor;
	private WebElement AddItem;
	private WebElement ContinueShopping;
	private WebElement ClickLastProduct;
	private WebElement SearchNewItem;
	private WebElement Quantity;
	private WebElement ShoppingCart;
	

	public CartPage(WebDriver driver) {
		super(driver);
	}
	
	public WebElement SelectItem1(){
 		WebElement SS1 = waitForElement(By.xpath(".//*[@id='searchResults']//*[@class='productTitle fn']//*[contains(., 'k-6626-6U')]"));
 		Highlight(SS1);
 		SS1.click();
 		return SelectItem1;
	}
	
	public WebElement SelectColor(String Type){
 		WebElement Color = waitForElement(By.xpath(".//*[@id='prdAddToCart']/fieldset//*[@class='swatchlink']//*[@title='"+ Type +"']"));
 		Highlight(Color);
 		Color.click();
 		return SelectColor;
	}
	
	public WebElement AddItem(){
 		WebElement Item = waitForElement(By.xpath(".//*[@id='prdAddToCart']//*[@class='addToCart button primary']"));
 		Highlight(Item);
 		Item.click();
 		return AddItem;
	}
	
	public WebElement ContinueShopping(){
		WebElement cont = waitForElement(By.xpath(".//*[@id='main-container']//*[@class='button secondary dropdown-toggle']"));
 		Highlight(cont);
		cont.click();
 		return ContinueShopping;
	}
	
	public WebElement ClickLastProduct(){
		WebElement lp = waitForElement(By.xpath(".//*[@class='dropdown-menu']//*[contains(., 'Last Product')]"));
 		Highlight(lp);
		lp.click();
 		return ClickLastProduct;
	}
	
	public WebElement SearchNewItem(String new_search){
		WebElement Item2 = waitForElement(By.id("headerSearchInput"));
 		Item2.sendKeys(new_search);
 		Item2.sendKeys(Keys.ENTER);
 		return SearchNewItem;
	}
	
	public WebElement Quantity(String amount){
		WebElement qnt = waitForElement(By.id("qtyselected"));
 		qnt.clear();
		Highlight(qnt);
 		qnt.sendKeys(amount);;
 		return Quantity;
	}
	
	public WebElement ShoppingCart(){
		WebElement sc = waitForElement(By.xpath(".//*[@class='button-group']/a/span"));
 		Highlight(sc);
		sc.click();
 		return ShoppingCart;
	}
	
	
}
