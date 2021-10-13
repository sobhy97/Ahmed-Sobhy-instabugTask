package tests;

import org.testng.annotations.Test;

public class AutoCompleteSearchTest extends Testbase{
	
	@Test
	public void selectFromSuggestionList() throws InterruptedException
	{
		autoComplete.selectFromList("youtube");
		
	}

}
