// Assgnmnet 

package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg14 {
	
public WebDriver driver;
	
	public void openFrames() {
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://www.javatpoint.com/java-tutorial");
		
		WebElement e1 = driver.findElement(By.id("google_ads_iframe_/103512698,22511567001/22964681174_0"));
		driver.switchTo().frame(e1);	
		//e1.click();
	}

	public static void main(String[] args) {
		
		Prg14 p1 = new Prg14();
		p1.openFrames();

	}

}
