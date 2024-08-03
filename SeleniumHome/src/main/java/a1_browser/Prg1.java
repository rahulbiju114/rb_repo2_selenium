package a1_browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg1 {
	
	public WebDriver d1;
	
	
	public void openBrowser() {
		
		
		d1 = new ChromeDriver();
		
		d1.get("https://selenium.qabible.in/index.php");
		
		d1.manage().window().maximize();
		
	}
	
	
	public void closeBrowser() {
		
		d1.quit();		
		
	// d1.close();
		
	}
	
	

	public static void main(String[] args) {
		
		Prg1 p1 = new Prg1();
		
		p1.openBrowser();
		
	  //  p1.closeBrowser();

	}

}
