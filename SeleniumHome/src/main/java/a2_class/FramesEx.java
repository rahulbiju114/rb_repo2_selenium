package a2_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesEx {
	
	public WebDriver driver;
	
	public void openFrames() {
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/guru99home/");
		
		WebElement e1 = driver.findElement(By.id("a077aa5e"));
		e1.click();
		
		
		// WebElement e2 = driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"))
		
		WebElement e2 = driver.findElement(By.linkText("https://demo.guru99.com/test/guru99home/ads.html"));	
		e2.click();
		
		
	}
	
	

	public static void main(String[] args) {
		
		FramesEx p1 = new FramesEx();
		
		p1.openFrames();
		
	}

}
