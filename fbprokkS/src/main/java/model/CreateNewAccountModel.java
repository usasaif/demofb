package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CreateNewAccountModel extends BaseModel{

	public CreateNewAccountModel(WebDriver d) {
		super(d);
	}


	public WebElement getFirstName() throws InterruptedException {
		Thread.sleep(2000);
		WebElement e = driver.findElement(By.xpath("//input[@name='firstname']"));
		return e;
	}
	public WebElement getLastName() {
	
		WebElement e = driver.findElement(By.xpath("//input[@name='lastname']"));
		return e;
	}
	
	public WebElement getEmal() {
		
		WebElement e = driver.findElement(By.xpath("//input[@name='reg_email__']"));
		return e;
	}
	
	

	public WebElement getMonthDrop() {
		
		WebElement e = driver.findElement(By.xpath("//select[@id='month']"));
		return e;
	}
	
	
	
	
}
