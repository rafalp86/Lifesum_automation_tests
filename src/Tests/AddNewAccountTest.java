package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.GetStartedPage;
import Pages.HomePage;
import Pages.LoginForm;

public class AddNewAccountTest extends TestBase {
	
	@Test
	public void registerNewUserInSystem()
	{
		Assert.assertTrue(
			  new HomePage()
			  .GetStarted()
			  .SelectUnitSystem()
			  .SelectGenderMale()
			  .SetWeight()
			  .SetHeight()
			  .Next()
			  .SetActivityLevel()
			  .SetGoalweight()
			  .SelectKgPerWeek()
			  .Next()
			  .SetEmail()
			  .SetPassword()
			  .SetAgreeTerms()
			  .CreateAcount()
			  .isLoaded(),"LoggedIn text is not availible");
	}

}
