package Protrainingtech.practiceframework;

import org.testng.annotations.Test;
import CommonUtilities.Cutilities;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Whatsnew extends Cutilities{
@Test
public void f() throws InterruptedException {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;    

	  WebElement name=driver.findElement(By.xpath("//*[@id='trending']"));
	  name.click();  
	  WebElement menumotion=driver.findElement(By.linkText("Home New Arrivals"));
	  menumotion.click();
	  //Screenshot();

  }
 
/* @Parameters({"browser","URL"})
 @BeforeClass
 public void beforeClass(String browser, String url) {
 browsers(browser, url); 
}*/
}
