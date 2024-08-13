package a1_browser;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Prg33_JavaScriptExecuter {
  @Test
  public void f() {
	  
	  
	  WebDriver	driver = new ChromeDriver();
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.manage().window().maximize();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,250)");// scroll down
		
	//	js.executeScript("window.scrollBy(0,-250)");// scroll up 
	  
  }
}
