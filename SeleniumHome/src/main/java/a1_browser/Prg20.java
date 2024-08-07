package a1_browser;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg20 {
	
	WebDriver driver;
	
	public void robotClass() throws AWTException {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement e1 = driver.findElement(By.id("file-upload"));
		
		StringSelection s1 = new StringSelection("C:\\Users\\rahul\\Desktop\\Obsqura\\JAVA\\Notes\\Java features Architecture.pdf");
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s1,null);
		
		Robot r1 = new Robot();
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
		r1.keyPress(KeyEvent.VK_CONTROL);
		r1.keyPress(KeyEvent.VK_V);
		
		r1.keyRelease(KeyEvent.VK_CONTROL);
		r1.keyRelease(KeyEvent.VK_V);
		
		r1.keyPress(KeyEvent.VK_ENTER);
		r1.keyRelease(KeyEvent.VK_ENTER);
		
	}



}
