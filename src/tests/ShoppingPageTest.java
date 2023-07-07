package tests;

import org.testng.annotations.Test;

import pages.ShoppingPage;

public class ShoppingPageTest extends Baseclass{
	@Test
	public void testing()
	{
		ShoppingPage sp = new ShoppingPage(driver);
		sp.searchValue("Sunscreen");
		sp.select();
		sp.addcart();
	}

}
