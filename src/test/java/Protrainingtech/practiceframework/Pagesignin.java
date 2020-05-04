package Protrainingtech.practiceframework;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import CommonUtilities.Cutilities;
import Protrainingtech.practiceframework.signin;


public class Pagesignin extends Cutilities{
 
  @Test
  public void f() throws IOException {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ; 

	signin logi=new signin(driver);  
	logi.menu();
	logi.signclick();
	//Screenshot();
	logi.uname("abc@yahoo.com");
	logi.pname("123xyz");
	logi.check();
	//logi.login();
	//Screenshot();  
  }
}