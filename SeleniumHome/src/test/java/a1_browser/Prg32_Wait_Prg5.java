
	
package a1_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class Prg32_Wait_Prg5  {
			
			public WebDriver d1;
			
			
			public void openBrowser() {
				
				
				d1 = new ChromeDriver();
				
				d1.get("https://selenium.qabible.in/index.php");
				
				d1.manage().window().maximize();
				
			}
			
		
		public void openSite1() {
			
			d1.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
			
			WebElement e1 = d1.findElement(By.id("single-input-field"));
			e1.sendKeys("Hello");
			
			WebDriverWait wait = new WebDriverWait(d1, Duration.ofSeconds(10));
			
			WebElement e2 = d1.findElement(By.id("button-one"));
			
			wait.until(ExpectedConditions.elementToBeClickable(e2));
			
			e2.click();
		}
		
		public void openSite2() {
			
			d1.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
			
			
			WebElement e1 = d1.findElement(By.id("value-a"));
			e1.sendKeys("10");
			
			WebElement e2 = d1.findElement(By.id("value-b"));
			e2.sendKeys("20");
			
			WebElement e3 = d1.findElement(By.id("button-two"));
			e3.click();
			
			System.out.println(e3.getText());
			
		}
		
		
		
		
		
		

		public static void main(String[] args) {
			
			
			Prg32_Wait_Prg5 p5 = new Prg32_Wait_Prg5();
			
			p5.openBrowser();
		//  p5.openSite1();
			p5.openSite2();
			
		}

	}


	

