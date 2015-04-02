package Pages;

import org.openqa.selenium.By;

import Tests.TestBase;

public class LoginForm extends TestBase {
	
	private By LoginFormTitle= By.xpath("//h4[contains(text(),'Lifesum - Login')]");
	
	
	
	public boolean isLoaded()
	{
	 return driver.findElement(LoginFormTitle).isDisplayed();
	}

}
