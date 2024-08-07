package a1_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg18 {
	
	WebDriver driver;
	public void multipleWindowHandling()
	{
		driver=new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/");
		
		// Parent Window
		
		String p1 = driver.getWindowHandle();
		System.out.println("Parent Window :"+p1);
		System.out.println("=======================================");
		
		WebElement e1 = driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
		e1.click();
		
		WebElement e2 = driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
		e2.click();
		
		Set<String> p2 = driver.getWindowHandles(); // Parent + wnd1 + wind2
		
		String title ="";
		
		System.out.println(p2);
		System.out.println("=======================================");
		
		for(String i : p2 ) {
			
			if(!i.equals(p1)) {
				
				System.out.println("2 Windows :"+ i);
				driver.switchTo().window(i);
				
				// System.out.println(driver.getTitle());
				title = driver.getTitle();
				
			}
			
			if(title.equals("WebDriver | Login Portal")) {
				
				WebElement f1 = driver.findElement(By.xpath("//input[@id='text']"));
				f1.sendKeys("Hi");
				
			}
			
			if(title.equals("WebDriver | Contact Us")) {
				
				WebElement f2 = driver.findElement(By.xpath("//input[@name='first_name']"));
				f2.sendKeys("Hi");
			
		}
	}
		
	}
	

	public static void main(String[] args) {
		
		Prg18 p = new Prg18();
		p.multipleWindowHandling();

	}

}
