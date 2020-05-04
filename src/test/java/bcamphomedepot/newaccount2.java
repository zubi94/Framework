package bcamphomedepot;

import org.testng.annotations.Test;
import CommonUtilities.Cutilities;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;

public class newaccount2 extends Cutilities{
	  
	  @Test
	  @Parameters({"eml","psd","zipco","phone"})
	  public void newaccount1(String a,String b,String c, String d) {
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
		  newacc1 abc=new newacc1(driver);
		  abc.menu();
		  abc.newac();
		  abc.email1(a);
		  abc.psd1(b);
		  abc.zip1(c);
		  abc.phone1(d);
		  //abc.createacc1();
		  datesmall();
	  
	}
	  
	/* @BeforeTest
	  public void beforeClass() throws InterruptedException {
	  
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\lala94\\eclipse-workspace\\homedepot\\chromedriver.exe");
	  driver=new ChromeDriver(); 
	  String url="http:\\www.homedepot.com";
	  driver.get(url);
	  Thread.sleep(2000);
	  driver.manage().window().maximize();
	
}*/
}
