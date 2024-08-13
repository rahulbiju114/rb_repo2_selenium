package a1_browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class Prg24 {
  @Test
  public void f() {
	  
	  System.out.println("hi 1");
  }
  
  @Test
  public void a() {
	  System.out.println("hi 2");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  
	  System.out.println("hi 3");
  }

  @AfterMethod
  public void afterMethod() {
	  
	  System.out.println("hi 4");
  }

}
