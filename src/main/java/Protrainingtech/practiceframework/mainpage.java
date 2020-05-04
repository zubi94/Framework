package Protrainingtech.practiceframework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainpage{
	
    
	WebDriver driver;
	@FindBy(linkText="Categories")
	WebElement categmenu;
	
	@FindBy(linkText ="Men")
	WebElement Men;
	
	@FindBy(linkText = "Men's Clothing")
	WebElement Menclothing;
	
	@FindBy(linkText = "Activewear")
	WebElement activewear;
	
	@FindBy(linkText = "Workout Shirts")
	WebElement shirts;
	
	@FindBy(xpath = "//*[@id='search']")
	WebElement Searchbar;
	
	@FindBy(xpath="//*[@class='SearchInputButton-sc-1opoijs-0 ijLsOQ']")
	WebElement clicksearch;
	
	
	
	public mainpage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void categories() {
		categmenu.click();
	
	}
	
	public void Mens(){
		Men.click();
		
	}
	
	public void Mensclothing(){
		Menclothing.click();
		
	}
	
	public void Mensactive(){
		activewear.click();
		
	}
	
	public void excercise(){
		shirts.click();
		
		
	}
	public void search(String items) throws InterruptedException{
		Searchbar.clear();
		Searchbar.click();
		Searchbar.sendKeys(items);
		
		Thread.sleep(1000);
		
}
	
	public void searchclick(){
		clicksearch.click();
}
		
	
}