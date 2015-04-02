package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import Pages.GetStartedPage;
import Pages.HomePage;
import Pages.LoginForm;

public class WhenUserOpenHompage extends TestBase {
	
	
	@Test
	public void LoginLinkShoudByAvailbleAndWork()
	{
		HomePage homePageView= new HomePage();
		LoginForm loginView= homePageView.Login();
		Assert.assertTrue(loginView.isLoaded());
	}
	
	@Test
	public void GetStartedLinkShoudByAvailbleAndWork()
	{
		HomePage homePageView= new HomePage();
		GetStartedPage getStartedView= homePageView.GetStarted();
		Assert.assertTrue(getStartedView.isLoaded());	
	}

}
