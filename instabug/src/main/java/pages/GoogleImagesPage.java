package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class GoogleImagesPage {

	private WebDriver driver;
	private By googleImage = By.xpath("/html/body/div[1]/div[1]/div/div/div/div[1]/div/div[2]/a");

	public GoogleImagesPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void googleImageTitle()
	{
		driver.findElement(googleImage).click();
		
	}
}
