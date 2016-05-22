package com.build.qa;

import org.openqa.selenium.WebDriver;


public class AppPage extends PageBase{

	private HomePage homepage;
	private CartPage cartpage;
	private Checkout checkout;
	

	public AppPage (WebDriver driver) {
		super(driver);
	}	
		public HomePage homepage(){
			if(homepage == null);
			homepage = new HomePage(driver);
			return homepage;
		}
		
		public CartPage cartpage(){
			if(cartpage == null);
			cartpage = new CartPage(driver);
			return cartpage;
		}
		
		public Checkout checkout(){
			if(checkout == null);
			checkout = new Checkout(driver);
			return checkout;
		}
	
		
}
