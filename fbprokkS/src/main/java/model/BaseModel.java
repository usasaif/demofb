package model;

import org.openqa.selenium.WebDriver;

public class BaseModel {
protected WebDriver driver;

public BaseModel(WebDriver d) {
	driver =d;
}
}
