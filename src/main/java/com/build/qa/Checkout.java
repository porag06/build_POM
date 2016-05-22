package com.build.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import static org.assertj.core.api.Assertions.*;


public class Checkout extends PageBase{
	
	private WebElement ChangeZip;
	private WebElement EnterZip;
	private WebElement SecureCheckout;
	private WebElement GuestChkOut;
	private WebElement FName;
	private WebElement LName;
	private WebElement Address;
	private WebElement ZipCode;
	private WebElement City;
	private WebElement State;
	private WebElement Phone;
	private WebElement Email;
	private WebElement CardNumber;
	private WebElement Month;
	private WebElement Year;
	private WebElement NameonCard;
	private WebElement SecCode;
	private WebElement Review;


	public Checkout(WebDriver driver) {
		super(driver);
	}
	
	public WebElement ChangeZip(){
 		WebElement change = waitForElement(By.id("changeZip_btn"));
 		Highlight(change);
 		change.click();
 		return ChangeZip;
	}
	
	public WebElement EnterZip(String zip_code){
 		WebElement zip = waitForElement(By.id("shipZipInput"));
 		Highlight(zip);
 		zip.sendKeys(zip_code);
 		zip.sendKeys(Keys.ENTER);
 		return EnterZip;
	}
	
	public void VerifyTax(){
		delayFor(2000);
		WebElement tax = waitForElement(By.id("taxAmount"));
		assertThat(tax.getText()).isEqualTo("$116.55");
	}
	
	public void VerifyGrandTotal(){
		WebElement gt = waitForElement(By.id("grandtotalamount"));
		assertThat(gt.getText()).isEqualTo("$1,670.61");
	}
	
	public WebElement SecureCheckout(){
 		WebElement scout = waitForElement(By.xpath(".//*[@class='button primary icon-secure']//*[contains(.,'Secure Checkout')]"));
 		Highlight(scout);
 		scout.click();
 		return SecureCheckout;
	}
	
	public WebElement GuestChkOut(){
 		WebElement gco = waitForElement(By.xpath(".//*[@id='guest-login']/button"));
 		Highlight(gco);
 		gco.click();
 		return GuestChkOut;
	}
	
	public WebElement FName(String fname){
 		WebElement fn = waitForElement(By.id("shippingfirstname"));
 		Highlight(fn);
 		fn.sendKeys(fname);
 		return FName;
	}
	
	public WebElement LName(String lname){
 		WebElement ln = waitForElement(By.id("shippinglastname"));
 		Highlight(ln);
 		ln.sendKeys(lname);
 		return LName;
	}
	
	public WebElement Address(String add){
 		WebElement ad = waitForElement(By.id("shippingaddress1"));
 		Highlight(ad);
 		ad.sendKeys(add);
 		return Address;
	}
	
	public WebElement ZipCode(String zip){
 		WebElement zc = waitForElement(By.id("shippingpostalcode"));
 		Highlight(zc);
 		zc.clear();
 		zc.sendKeys(zip);
 		return ZipCode;
	}
	public WebElement City(String city){
 		WebElement ct = waitForElement(By.id("shippingcity"));
 		Highlight(ct);
 		ct.clear();
 		ct.sendKeys(city);
 		return City;
	}
	
	public WebElement State(String state){
		Select mySelect= new Select(waitForElement(By.id("shippingstate_1")));
		mySelect.selectByVisibleText(state);
		return State;
	}
	
	public WebElement Phone(String num){
 		WebElement ph = waitForElement(By.id("shippingphonenumber"));
 		Highlight(ph);
 		ph.click();
 		ph.sendKeys(num);
 		return Phone;
	}
	
	public WebElement Email(String email){
 		WebElement em = waitForElement(By.id("emailAddress"));
 		Highlight(em);
 		em.sendKeys(email);
 		return Email;
	}
	
	public WebElement CardNumber(String cnum){
 		WebElement cn = waitForElement(By.id("creditCardNumber"));
 		Highlight(cn);
 		cn.sendKeys(cnum);
 		return CardNumber;
	}
	
	public WebElement Month(String mon){
		Select mySec= new Select(waitForElement(By.id("creditCardMonth")));
		mySec.selectByVisibleText(mon);
		return Month;
	}
	
	public WebElement Year(String yr){
		Select mySec2= new Select(waitForElement(By.id("creditCardYear")));
		mySec2.selectByVisibleText(yr);
		return Year;
	}
	
	public WebElement NameonCard(String cname){
 		WebElement nc = waitForElement(By.id("creditcardname"));
 		Highlight(nc);
 		nc.sendKeys(cname);
 		return NameonCard;
	}
	
	public WebElement SecCode(String scode){
 		WebElement sec = waitForElement(By.id("creditCardCVV2"));
 		Highlight(sec);
 		sec.sendKeys(scode);
 		return SecCode;
	}
	
	public WebElement Review(){
 		WebElement rv = waitForElement(By.xpath(".//*[@id='creditcard']/div[3]/input"));
 		Highlight(rv);
 		rv.click();
 		return Review;
	}
	
}
