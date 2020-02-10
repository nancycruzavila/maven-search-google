package SeleniumAcademy.GoogleSearch;

import org.testng.annotations.Test;

//import org.junit.*;
import SeleniumAcademy.pages.*;

public class BasicSearch extends BaseTest{
	private static SearchPage page = new SearchPage();
	private static String search = "Esta es una prueba";

	@Test
	public void fillTextBox() throws Exception{
		SearchPage.textbox_search(driver).sendKeys(search);
//		driver.close();
	}

}
