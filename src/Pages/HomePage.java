package Pages;

import org.openqa.selenium.By;

import Tests.GetStartedPage;
import Tests.TestBase;



public class HomePage extends TestBase {

	private By LoginLink= By.xpath("//*[@class='landing_header_navigation']//*[contains(text(),'Log in')]");
	private By GetStarted= By.xpath("//*[contains(text(),'Get Started')]");
	
	
	public LoginForm Login()
	{
		driver.findElement(LoginLink).click();
		return new LoginForm();
	}
	
	public GetStartedPage GetStarted()
	{
		driver.findElement(GetStarted).click();
		return new GetStartedPage();
	}
}
