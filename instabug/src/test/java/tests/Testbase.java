package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;
import pages.SearchByKeyboardPage;
import pages.GoogleImagesPage;
import pages.SearchByGoogleButtonPage;
import pages.AutoCompletePage;
import pages.ClearSearchFieldPage;
import pages.FullCycleSearchPage;
import pages.GmailPage;

public class Testbase {

	private WebDriver driver;
	protected SearchByKeyboardPage homePage;
	protected AutoCompletePage autoComplete;
	protected GoogleImagesPage googleImagesPage;
	protected GmailPage gmailPage;
	protected FullCycleSearchPage fullCycleSearchPage;
	protected ClearSearchFieldPage clearSearchFieldPage;
	protected SearchByGoogleButtonPage searchByGoogleButtonPage;
	private String url = "https://www.google.com/";
	
	@BeforeClass
	public void setUp()
	{
		WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        homePage = new SearchByKeyboardPage(driver);
        autoComplete = new AutoCompletePage(driver);
        googleImagesPage = new GoogleImagesPage(driver);
        gmailPage = new GmailPage(driver);
        fullCycleSearchPage = new FullCycleSearchPage(driver);
        clearSearchFieldPage = new ClearSearchFieldPage(driver);
        searchByGoogleButtonPage = new SearchByGoogleButtonPage(driver);
	}
	
//	@AfterClass
//	public void tearDown() throws InterruptedException
//	{
//		Thread.sleep(4000);
//		driver.quit();
//	}
	
}
