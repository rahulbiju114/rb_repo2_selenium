// Assign // File Upload using robot class

package a1_browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg21 {
	
	public WebDriver driver ;
	
	public void openChrome() throws AWTException {
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_T);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_T);
		
	
	}

	public static void main(String[] args) throws AWTException {
		
		Prg21 p1 = new Prg21();
		p1.openChrome();

	}

}
