package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchByGoogleButtonPage {

	private WebDriver driver;
	private By googleSearch = By.name("q");
	private By dotdot = By.xpath("//img[@class='lnXdpd']");
	private By googleBttn = By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]");
	
	public SearchByGoogleButtonPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void searchByBttn(String search)
	{
		driver.findElement(googleSearch).sendKeys(search);
		driver.findElement(dotdot).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(googleBttn).click();
	}
	
}
