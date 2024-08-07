package a1_browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prg16 {
	
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
		System.out.println(p2);
		System.out.println("=======================================");
		
		for(String i : p2 ) {
			
			if(!i.equals(p1)) {
				
				System.out.println("2 Windows :"+ i);
			}
			
		}
	}
	

	public static void main(String[] args) {
		
		Prg16 p = new Prg16();
		p.multipleWindowHandling();

	}

}
