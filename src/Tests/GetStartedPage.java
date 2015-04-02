package Tests;

import org.openqa.selenium.By;

import Pages.LoginForm;

public class GetStartedPage extends TestBase {
	
	private By SignUpTitle= By.xpath("//h4[contains(text(),'Sign Up')]");
	
	public boolean isLoaded()
	{
	 return driver.findElement(SignUpTitle).isDisplayed();
	}

}
