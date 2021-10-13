package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class PageBase 
{
    private WebDriver driver;

	@BeforeClass
    public void teardown()
    {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

    }

}
