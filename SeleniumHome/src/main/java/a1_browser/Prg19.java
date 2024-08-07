package a1_browser;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg19 {
	
	WebDriver driver;
	
	public void fileUpload()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement e1 = driver.findElement(By.id("file-upload"));
	
		
		e1.sendKeys("C:\\Users\\rahul\\Desktop\\Obsqura\\JAVA\\Notes\\Java features Architecture.pdf");
		
		WebElement e2 = driver.findElement(By.id("file-submit"));
		e2.click();	
		
	}
	
	public void robotClass() throws AWTException {
		
		driver=new ChromeDriver();
		driver.navigate().to("https://the-internet.herokuapp.com/upload");
		
		WebElement e1 = driver.findElement(By.id("file-upload"));
		
		
		
	}

	public static void main(String[] args) {


		Prg19 p1 = new Prg19();
		
		p1.fileUpload();

	}

}
