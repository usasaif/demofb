package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel {

	public CreateNewAccountPage(WebDriver d) {
		super(d);
	}

	public void typeFirstName(String name) throws InterruptedException {
		WebElement e = getFirstName();
		e.clear();
		e.sendKeys(name);
	}

	public void typeLastName(String name) {
		WebElement e = getLastName();
		e.clear();
		e.sendKeys(name);
	}

	public void typeEmail(String email) {
		WebElement e = getEmal();
		e.clear();
		e.sendKeys(email);
	}

	public void pickMonth(String month) {

		WebElement e = getMonthDrop();
		Select sel = new Select(e);
		sel.selectByVisibleText(month);
	}

}
