package SeleniumAcademy.GoogleSearch;

import org.junit.*;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;

//import SeleniumAcademy.pages.ChromeDriver;

public class BaseTest{
	private static String baseUrl = "https://www.google.com";
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get(baseUrl);
	}
	
	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
}