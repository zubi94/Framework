package Protrainingtech.practiceframework;

import org.testng.annotations.Test;
import CommonUtilities.Cutilities;
import Protrainingtech.practiceframework.mainpage;
import org.testng.annotations.DataProvider;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.Reporter;

public class Target extends Cutilities{
	
  @Test (priority = 1)
  public void f() throws Exception  {
  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
  mainpage main=new mainpage(driver);
  main.categories();
 // Screenshot();
  main.Mens();
//for logs we can view them in email-able report
  Reporter.log("Clicked Main Menue");
  main.Mensclothing();
 // Screenshot();
  main.Mensactive();
  main.excercise();
  Reporter.log("End of Class");
  
  }
  
  @Test (priority = 2, dataProvider = "dp")
  public void search(String products) throws InterruptedException, IOException {
	  driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
	  mainpage main=new mainpage(driver);
	  main.search(products);
	  main.searchclick();
	  
  }

  @DataProvider
  public Object[][] dp() {
      return new Object[][] {
      new Object[] { "sleep wear" },
      new Object[] { "dress shirts" },
      new Object[] { "kids shoes" },
    };
  }
  
   
 /* @Parameters({"browser","URL"})
  @BeforeClass
  public void beforeClass(String browser, String url) {
  browsers(browser, url);
  
}*/
}
