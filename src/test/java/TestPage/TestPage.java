package TestPage;

import org.testng.annotations.Test;
import com.build.qa.scriptBase;

public class TestPage extends scriptBase{
	
	@Test
	public void NewTest(){
		apppage().homepage().VerifyTitle();
		apppage().homepage().popup();
		apppage().homepage().Search("kohler k-6626-6u");
		apppage().cartpage().SelectItem1();
		apppage().cartpage().SelectColor("Suede");
		apppage().cartpage().AddItem();
		apppage().cartpage().ContinueShopping();
		apppage().cartpage().ClickLastProduct();
		apppage().cartpage().SelectColor("Cashmere");
		apppage().cartpage().AddItem();
		apppage().cartpage().SearchNewItem("kohler k-6066-st");
		apppage().cartpage().Quantity("2");
		apppage().cartpage().AddItem();
		apppage().cartpage().ShoppingCart();
		apppage().checkout().ChangeZip();
		apppage().checkout().EnterZip("90005");
		apppage().checkout().VerifyTax();
		apppage().checkout().VerifyGrandTotal();
		apppage().checkout().SecureCheckout();
		apppage().checkout().GuestChkOut();
		apppage().checkout().FName("Tofail");
		apppage().checkout().LName("Porag");
		apppage().checkout().Address("8931 204th Street");
		apppage().checkout().ZipCode("90005");
		apppage().checkout().City("Los Angeles");
		apppage().checkout().State("California");
		apppage().checkout().Phone("3478150855");
		apppage().checkout().Email("poragtofail@gmail.com");
		apppage().checkout().CardNumber("4111111111111111");
		apppage().checkout().Month("05");
		apppage().checkout().Year("2019");
		apppage().checkout().NameonCard("Tofail Porag");
		apppage().checkout().SecCode("369");
		apppage().checkout().Review();
	}

}