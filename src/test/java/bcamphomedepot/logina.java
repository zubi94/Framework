package bcamphomedepot;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import CommonUtilities.Cutilities;

public class logina extends Cutilities {
  @Test
  @Parameters({"eml","psd"})
  public void f(String a, String b) {
	  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS) ;
	  signin sin=new signin(driver);
	  sin.menu();
	  sin.signin2();
	  sin.email(a);
	  sin.psd1(b);
	  //sin.login();
	  
  }
}
