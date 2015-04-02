package Tests;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;


public class TestBase {

	public static WebDriver driver;
	
	@BeforeMethod
	public void testFixtureSetUp() throws Exception
	{
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
		driver.get("http://lifesum.com/");

	}
	
	@AfterMethod
	public void testTherdDown()
	{
		driver.quit();
	}
	
	public void Click(By element)
	{
		driver.findElement(element).click();
	}
	
}
