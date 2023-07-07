package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingPage {
WebDriver driver;
	
	By searchfield = By.name("s");
	By sunscreenselect = By.xpath("//*[@id=\"searchModal\"]/div/div/div[1]/div[1]/div[2]/div[3]/div[2]/div/div[1]/a");
	By addtocart = By.name("add");
	

	public ShoppingPage(WebDriver driver) {
		
		this.driver = driver;
	}
	
	public void searchValue(String search) 
	{
		driver.findElement(searchfield).sendKeys(search);
	}
	public void select()
	{
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(sunscreenselect)).click();
	}	
		
	public void addcart()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(addtocart)).click();
	}


}
