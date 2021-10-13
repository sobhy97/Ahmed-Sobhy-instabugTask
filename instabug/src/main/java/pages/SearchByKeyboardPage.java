package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchByKeyboardPage {
	
	private WebDriver driver;
	private By googleSearch = By.name("q");
	private String googleImage = "Google";
	
	public SearchByKeyboardPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void sendTextToField(String search)
	{
		Assert.assertTrue(googleImage.contains("Google"));
		driver.findElement(googleSearch).sendKeys(search,Keys.ENTER);
		
	}

}
