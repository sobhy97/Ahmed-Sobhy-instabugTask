package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class GmailPage {
	
	private WebDriver driver;
	private By gmail = By.linkText("Gmail");
	
	public GmailPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void gmailTitle()
	{
		driver.findElement(gmail).click();
		
	}

}
