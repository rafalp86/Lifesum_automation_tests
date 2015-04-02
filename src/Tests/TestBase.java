package Tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	protected static WebDriver driver;
	
	@BeforeMethod
	protected void testFixtureSetUp() throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  
		driver.get("http://lifesum.com/");

	}
	
	@AfterMethod
	protected void testTherdDown()
	{
		driver.quit();
	}
	
	protected void Click(By element)
	{
		driver.findElement(element).click();
	}
	
	protected boolean WaitForElement(By element)
	  {	
		  WebDriverWait  wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(element));
		return true;
	  }
}
