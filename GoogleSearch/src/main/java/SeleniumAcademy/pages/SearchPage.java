package SeleniumAcademy.pages;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchPage {
	
	private static String searchBoxName = "q";
	private static String searchButtonName = "btnK";
	private static String imFeelingLuckyButtonName = "btn1";
	
	public static WebElement textbox_search(WebDriver driver) {
		return driver.findElement(By.name(searchBoxName));
	}
	
	public static WebElement button_search(WebDriver driver) {
		return driver.findElement(By.name(searchButtonName));
	}
	
	public static WebElement button_imfeelinglucky(WebDriver driver) {
		return driver.findElement(By.name(imFeelingLuckyButtonName));
	}

}
