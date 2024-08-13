package a3_testscript;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Prg34_Base {
	
	public WebDriver driver;
	
  @Test
  public void f() {
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
	  
	  driver = new ChromeDriver();
	  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
