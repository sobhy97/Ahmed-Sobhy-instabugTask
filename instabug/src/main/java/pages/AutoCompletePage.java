package pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AutoCompletePage {
	
	private WebDriver driver;
	private By googleSearch = By.name("q"); 
	
	public AutoCompletePage(WebDriver driver)
	{
		this.driver= driver;
	}
	
	public void selectFromList(String search) throws InterruptedException
	{
		driver.findElement(googleSearch).sendKeys(search);
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//li[@class='sbct']"));
		System.out.println(elements.size());
		
		for(WebElement b:elements)
		{
			String element = b.getText();
			System.out.println(element);
			
			if ((element.equalsIgnoreCase("youtube music"))) 
					{
				b.click();
				break;
				
			}
		}
	}

}
