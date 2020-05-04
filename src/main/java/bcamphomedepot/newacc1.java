package bcamphomedepot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class newacc1{
	WebDriver driver;
	@FindBy(linkText = "My Account")
	WebElement myaccountmenue;
	@FindBy(xpath = "(//*[@class='bttn__content'])[4]")
	WebElement newacc;
	@FindBy(id = "email")
	WebElement eml;
	@FindBy(id = "password-input-field")
	WebElement psd;
	@FindBy(id = "zipCode")
	WebElement zip;
	@FindBy(id = "phone")
	WebElement ph;
	@FindBy(linkText = "Create an Account")
	WebElement crtacc;


public newacc1(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

public void newac() {
	newacc.click();
}
public void menu() {
	myaccountmenue.click();	
}
public void psd1(String enterpsd) {
	psd.sendKeys(enterpsd);	
}
public void zip1(String zipc) {
	zip.sendKeys(zipc);	
}
public void email1(String entereml) {
	eml.sendKeys(entereml);	
}
public void phone1(String enterph) {
	ph.sendKeys(enterph);	
}
public void createacc1() {
	crtacc.click();	
}
}