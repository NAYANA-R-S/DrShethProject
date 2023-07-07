package tests;

import org.testng.annotations.Test;

import pages.CreateAccountPage;

public class CreateAccountPageTest extends Baseclass{
	
	@Test
	public void testing()
	{
		CreateAccountPage ca = new CreateAccountPage(driver);
		ca.acc();
		ca.setValues("Melissa", "Brooks", "mel.brooks+1@gmail.com", "Test@123");
		ca.sub();	
	}

}
