package tests;
import org.testng.annotations.Test;

public class ClearSearchFieldTest extends Testbase {
	
	@Test
	public void clearTextOnField()
	{
		clearSearchFieldPage.addTextToSearchField("instabug");
	}
}
