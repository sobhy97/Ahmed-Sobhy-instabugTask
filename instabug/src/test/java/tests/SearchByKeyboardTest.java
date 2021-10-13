package tests;

import org.testng.annotations.Test;
public class SearchByKeyboardTest extends Testbase {
	
	@Test
	public void searchByWords()
	{
		homePage.sendTextToField("instabug");
	}

}
