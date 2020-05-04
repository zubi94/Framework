package bcamphomedepot;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonUtilities.Cutilities;

public class searchbutton extends Cutilities {
  
  @Test (priority = 1,dataProvider = "dp")
  public void f(String products) {
	  search sbut=new search(driver);
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;  
	  sbut.sbar(products);
	  sbut.searchbutt();
  }	  
	@Test (priority = 2)
	public void addcart(){
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	  search sbut=new search(driver);
	  sbut.hinge1();
	  //Below 3 Methods can be used to switch between iframe 
	  //driver.switchTo().frame(1);
	  // WebElement iframe=driver.findElement(By.xpath("(//iframe[contains(@class,'overlay')])[2]"));
	  // driver.switchTo().frame(iframe);
	  driver.switchTo().frame(driver.findElement(By.xpath("(//iframe[contains(@class,'overlay')])[2]")));
	  sbut.view();
	  //switch back to previous frame or parent of current frame or one step back
	  //driver.switchTo().parentFrame();
	  
	  //switch back to parent window or start of all frames
	  //driver.switchTo().defaultContent();
	  sbut.checkout();
	  
  }
  
  @DataProvider
  public Object[][] dp() {
      return new Object[][] {
      new Object[] { "drill machine" },
      new Object[] { "screw driver" },
      new Object[] { "10 inch bolts" },
    };
}
}