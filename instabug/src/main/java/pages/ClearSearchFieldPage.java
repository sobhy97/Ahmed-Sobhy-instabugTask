package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ClearSearchFieldPage {
	
	private WebDriver driver;
	private By googleSearch = By.name("q");
//	private By dotdot = By.xpath("/html/body/div[1]/div[5]/div[1]");
	
	public ClearSearchFieldPage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void addTextToSearchField(String search)
	{
		driver.findElement(googleSearch).sendKeys(search);
		driver.findElement(googleSearch).clear();
//		driver.findElement(dotdot).click();
	}
		

}
