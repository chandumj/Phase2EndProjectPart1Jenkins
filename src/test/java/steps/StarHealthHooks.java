package steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;

public class StarHealthHooks {

	public static WebDriver driver;
	
	@BeforeAll
	public static void openBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
	}
	@AfterAll
	public static void closeBrowser()
	{
		driver.quit();
	}
	
}
