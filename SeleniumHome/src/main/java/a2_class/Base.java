package a2_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	 public WebDriver driver;
	
	 public  void intiliseBrowser() {
		
		 driver = new ChromeDriver();
		 driver.get("https://selenium.qabible.in/index.php");
		 driver.manage().window().maximize();
		   
	}
	
	public void driverQuitClose() {
		
		//driver.close();
		driver.quit();
		
	}

	public static void main(String[] args) {
		
		Base b = new Base();
		b.intiliseBrowser();
		b.driverQuitClose();

	}

}
