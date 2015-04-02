package Pages;

import java.util.Random;

import org.openqa.selenium.By;

import Tests.TestBase;

public class GetStartedPage extends TestBase {
	
	private By SignUpTitle= By.xpath("//h4[contains(text(),'Sign Up')]");
	private By UnitSystemElement=By.xpath("//*[@data-id='eu-system']");
	private By GenderMaleElement=By.xpath("//*[@data-id='male']");
	private By NextElement=By.xpath("//button[contains(text(),'Next')]");
	private By HeightElement=By.xpath("//*[@class='disableTab height signup_eu_cm numbers_only']");
	private By WeightElement=By.xpath("//*[@class='disableTab weight signup_eu_kg numbers_only']");
	private By LowElement=By.xpath("//*[@data-id='1.35']");
	private By LoosWeightElement=By.name("looseWeight");
	private By KgPerWeekElement=By.xpath("//*[@data-id='0.25']");
	private By EmailElemet= By.id("signup_email");
	private By PasswordElement= By.id("signup_password");
	private By CheckBoxElemet= By.xpath("//*[@type='checkbox']");
	private By SignupElemet= By.id("postSignup");

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
		driver.findElement(WeightElement).sendKeys("88");
		return new GetStartedPage();
	}
	
	public GetStartedPage SetGoalweight()
	{
		driver.findElement(LoosWeightElement).sendKeys("80");
		return new GetStartedPage();
	}
	
	public GetStartedPage SelectKgPerWeek()
	{
		Click(KgPerWeekElement);
		return new GetStartedPage();
	}
	
	public GetStartedPage SetEmail()
	{
		driver.findElement(EmailElemet).sendKeys("test@wp.pl"+(new Random()).nextInt(10000));
		return new GetStartedPage();
	}
	
	public GetStartedPage SetPassword()
	{
		driver.findElement(PasswordElement).sendKeys("password");
		return new GetStartedPage();
	}
	
	public GetStartedPage SetActivityLevel()
	{
		Click(LowElement);
		return new GetStartedPage();
	}
	
	public GetStartedPage SetAgreeTerms()
	{
		Click(CheckBoxElemet);
		return new GetStartedPage();
	}
	
	public AcountPage CreateAcount()
	{
		Click(SignupElemet);
		return new AcountPage();
	}
	
}
