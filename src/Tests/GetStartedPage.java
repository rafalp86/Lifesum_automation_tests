package Tests;

import org.openqa.selenium.By;

import Pages.LoginForm;

public class GetStartedPage extends TestBase {
	
	private By SignUpTitle= By.xpath("//h4[contains(text(),'Sign Up')]");
	private By UnitSystemElement=By.xpath("//*[@data-id='eu-system']");
	private By GenderMaleElement=By.xpath("//*[@data-id='male']");
	private By NextElement=By.xpath("//button[contains(text(),'Next')]");
	private By HeightElement=By.xpath("//*[@class='disableTab height signup_eu_cm numbers_only']");
	private By WeightElement=By.xpath("//*[@class='disableTab weight signup_eu_kg numbers_only']");
	
	
	// 1 //*[@data-id='eu-system']
	// 2    data-id="male"
	//3 //*[@class='disableTab height signup_eu_cm numbers_only']
	// 4 //*[@class='disableTab weight signup_eu_kg numbers_only']
	// 4 data-id="1.35"
	// name looseWeight
	// //button[contains(text(),'Next')]
	//  id signup_email
	// signup_password
	////*[@type='checkbox']
	// postSignup
	public boolean isLoaded()
	{
	 return driver.findElement(SignUpTitle).isDisplayed();
	}
	
	public GetStartedPage Next()
	{
		Click(NextElement);
		return new GetStartedPage();
	}
	
	public GetStartedPage SelectUnitSystem()
	{
		Click(UnitSystemElement);
		return new GetStartedPage();
	}
	public GetStartedPage SelectGenderMale()
	{
		Click(GenderMaleElement);
		return new GetStartedPage();
	}
	public GetStartedPage SetHeight()
	{
		driver.findElement(HeightElement).sendKeys("168");
		return new GetStartedPage();
	}
	public GetStartedPage SetWeight()
	{
		driver.findElement(WeightElement).sendKeys("168");
		return new GetStartedPage();
	}
}
