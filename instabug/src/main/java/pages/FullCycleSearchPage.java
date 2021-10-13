package pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FullCycleSearchPage {
	
	private WebDriver driver;
	private By googleSearch = By.name("q");
	private By searchResult = By.xpath("/html/body/div[7]/div/div[9]/div[1]/div/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div[1]/a/h3/span");
	
	public FullCycleSearchPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void selectSearchResult(String search)
	{
		driver.findElement(googleSearch).sendKeys(search,Keys.ENTER);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(searchResult).click();

		
	}

}
