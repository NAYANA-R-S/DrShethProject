package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateAccountPage {
	WebDriver driver;
	
	By accounticon = By.xpath("//a[@href=\"/account\"]");
	By createaccount = By.xpath("//button[@title=\"Create an Account\"]");
	
	By firstnamefield = By.id("FirstName");
	By lastnamefield = By.id("LastName");
	By emailfield = By.id("Email");
	By passwordfield = By.id("CreatePassword");
	By submitbutton = By.xpath("//input[@value=\"Submit\"]");
	
	
	
	public CreateAccountPage(WebDriver driver) {
		this.driver = driver;
	}


	public void acc()
	{
		driver.findElement(accounticon).click();
		driver.findElement(createaccount).click();
	}
	
	public void setValues(String firstname, String lastname, String email, String password)
	{
		driver.findElement(firstnamefield).sendKeys(firstname);
		driver.findElement(lastnamefield).sendKeys(lastname);
		driver.findElement(emailfield).sendKeys(email);
		driver.findElement(passwordfield).sendKeys(password);
	}
	
	public void sub()
	{
		driver.findElement(submitbutton).click();
	}
	

}
