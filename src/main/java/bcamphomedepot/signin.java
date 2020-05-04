package bcamphomedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class signin {
	WebDriver driver;
	@FindBy(linkText = "My Account")
	WebElement myaccountmenue;
	@FindBy(xpath = "(//*[@class='bttn__content'])[3]")
	WebElement signin1;
	@FindBy(id = "email")
	WebElement eml;
	@FindBy(id = "password-input-field")
	WebElement psd;
	@FindBy(linkText = "Sign In")
	WebElement log;

public signin(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}
public void menu() {
	myaccountmenue.click();	
}
public void signin2() {
	signin1.click();
}
public void email(String entereml) {
	eml.sendKeys(entereml);
}
public void psd1(String enterpsd) {
	psd.sendKeys(enterpsd);
}
public void login() {
	log.click();
}
}