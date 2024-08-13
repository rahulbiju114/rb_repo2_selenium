package a1_browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Prg26 {
  @Test
  public void f() {
	  
	  System.out.println("h2");
	  
  }
 
  @Test
 public void disp() {
	  
	  System.out.println("h4");
  
 
  } 
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("h1");
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("h3");
  }

}
