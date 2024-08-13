package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest3 {
  @Test
  public void disp() {
	  
	  System.out.println("h1");
  }
  @BeforeClass
  public void beforeClass() {
	  
	  System.out.println("h2");
  }

  @AfterClass
  public void afterClass() {
	  
	  System.out.println("h3");
  }

}
