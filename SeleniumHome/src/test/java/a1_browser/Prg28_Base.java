package a1_browser;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Prg28_Base {
	
	public WebDriver driver;
	
  @Test
  public void f() {
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new ChromeDriver();
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
