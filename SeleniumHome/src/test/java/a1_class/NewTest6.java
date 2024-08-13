package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest6 {
  @Test()
  public void disp1() {
	  
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

  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("h4");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("h5");
  }

}
