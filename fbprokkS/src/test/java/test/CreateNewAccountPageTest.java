package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import lib.ExcelReader;

public class CreateNewAccountPageTest extends BaseTest{
	
	
	@Test(dataProvider="login")
	public void createnewaccountpagetest(String firstname, String lastname, String email, String month) throws InterruptedException {
		
		getHomePage();
		homepage.clickOnCreateNewAccountBtn();
		
		getCreateNewAccountPage();
		cnap.typeFirstName(firstname);
		cnap.typeLastName(lastname);
		cnap.typeEmail(email);
		cnap.pickMonth(month);
	}
	
	@DataProvider (name="login")
	public Object[][] passData() throws IOException {

		Object[][] x;
		
		String filename="data/FB1.xls";
		String sheetname="Person";
		ExcelReader er = new ExcelReader(filename,sheetname);
		x = er.excelToArray();
		return x;
	}
}
