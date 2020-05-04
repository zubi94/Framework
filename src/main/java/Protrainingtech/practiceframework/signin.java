package Protrainingtech.practiceframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class signin {
	WebDriver driver;
	@FindBy(xpath = "//*[contains(@class,'styles__AccountName-sc-1kk0q5l-0 eaqGge')]")
	WebElement sighnmenue;
	@FindBy(linkText = "Sign in")
	WebElement signin;
	@FindBy(xpath = "//*[@id='username']")
	WebElement username;
	@FindBy(xpath = "//*[@id='password']")
	WebElement pass;
	@FindBy(xpath = "//*[contains(@class,'Checkbox__CheckboxWrap-n6heu6-3 kdxUEl')]")
	WebElement checkbox;
	@FindBy(xpath = "//*[@id='login']")
	WebElement loginclick;
	
	public signin(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void menu(){
		sighnmenue.click();
		
	}
public void signclick() {
 
	signin.click();	
	
}

public void uname(String user) {
	username.sendKeys(user);
	
}

public void pname(String pssd) {
	pass.sendKeys(pssd);
	
}
public void check() {
	checkbox.click();
	
}

public void login() {
	loginclick.click();
	
}

}