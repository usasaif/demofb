package test;

import org.testng.annotations.Test;

public class HomePaageTest extends BaseTest {

	
	
	@Test
	public void homepagetest() {
		getHomePage();
		homepage.clickOnCreateNewAccountBtn();
	}
}
