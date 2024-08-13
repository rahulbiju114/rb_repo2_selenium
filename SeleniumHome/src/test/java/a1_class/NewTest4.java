package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest4 {
  @Test
  public void disp() {
	  
	  System.out.println("h1");
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("h2");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("h3");
  }

}
