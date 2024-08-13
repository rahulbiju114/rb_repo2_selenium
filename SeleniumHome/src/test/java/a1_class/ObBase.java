package a1_class;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ObBase {
	
	 public WebDriver driver;
 
  @BeforeMethod
  public void beforeMethod() {
	  

		 driver = new ChromeDriver();
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // implict wait
	  
  }

  @AfterMethod
  public void afterMethod() {
	  
	 // driver.quit();
  }

}
