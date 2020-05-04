package bcamphomedepot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class search {
	WebDriver driver;
	@FindBy(xpath = "//*[@id='headerSearch']")
	WebElement searchbar;
	@FindBy(xpath ="//*[@class='SearchBox__button']")
	WebElement serbutton;
	@FindBy(xpath = "(//*[@class='bttn__content'])[5]")
	WebElement hinge;
	//@FindBy(xpath = "(//*[@class='bttn__content'])[4]")
	//WebElement addto;
	@FindBy(xpath = "//span[contains(text(),'View Cart')]")
	WebElement view;
	@FindBy(xpath = "(//*[contains(text(),'Checkout ')])[4]")
	WebElement chk;
	
	public search(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

public void sbar(String input) {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	searchbar.clear();
	searchbar.click();
	searchbar.sendKeys(input);
}

public void checkout() {
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	chk.click();
}
public void view() {
	view.click();
}

public void searchbutt() {
	serbutton.click();
}
public void hinge1() {
	hinge.click();
}
}