package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest5 {

	 @Test(priority = 3)
	  public void disp1() {
		  
		  System.out.println("h1");
	  }
	  
	  @Test(priority = 2)
	  public void disp2() {
		  
		  System.out.println("h7");
	  }
	  
	  @Test(priority = 1)
	  public void disp3() {
		  
		  System.out.println("h8");
	  }
	
	
  @BeforeTest
  public void beforeTest() {
	  
	  System.out.println("h2");
  }

  @AfterTest
  public void afterTest() {
	  
	  System.out.println("h3");
  }

}
