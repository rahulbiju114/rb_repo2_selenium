package a2_class;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {
	

	public static void main(String[] args) {
		
		
	WebDriver	driver = new ChromeDriver();
		 driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		 driver.manage().window().maximize();
		 
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(0,250)");// scroll down
		
	//	js.executeScript("window.scrollBy(0,-250)");// scroll up
		
		
		 
		 

	}

}
