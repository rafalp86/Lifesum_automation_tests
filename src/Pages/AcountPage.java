package Pages;

import org.openqa.selenium.By;

import Tests.TestBase;

public class AcountPage extends TestBase {

	private By LoggedInElemet= By.xpath("//*[contains(text(),'Logged in')]");
	
	public boolean isLoaded()
	{
	 WaitForElement(LoggedInElemet);
	 return driver.findElement(LoggedInElemet).isDisplayed();
	}
}
