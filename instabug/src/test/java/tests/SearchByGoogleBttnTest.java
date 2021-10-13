package tests;

import org.testng.annotations.Test;

public class SearchByGoogleBttnTest extends Testbase{
	
	@Test
	public void clickOnSearchBttn()
	{
		searchByGoogleButtonPage.searchByBttn("instabug");

	}

}
