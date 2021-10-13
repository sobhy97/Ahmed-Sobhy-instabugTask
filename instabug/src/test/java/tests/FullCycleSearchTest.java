package tests;
import org.testng.annotations.Test;

public class FullCycleSearchTest extends Testbase {
	
	@Test
	public void openLinkAfterSearch()
	{
		fullCycleSearchPage.selectSearchResult("instabug");

	}

}
