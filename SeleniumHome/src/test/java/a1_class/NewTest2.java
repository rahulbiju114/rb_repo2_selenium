package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest2 {
  @Test
  public void method() {
	  
	  System.out.println("hi1");
	  
  }
  
  
  @Test
  public void disp() {
	  
	  System.out.println("hi4");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  // URL launch
	  System.out.println("hi2");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("hi3");
  }

}
