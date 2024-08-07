package a2_class;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class MultiWindow 
{
	WebDriver driver;
public void multipleWindowHandling()
{
	driver=new ChromeDriver();
	driver.navigate().to("https://webdriveruniversity.com/");
	
	WebElement contactUs=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	contactUs.click();
	
	WebElement Login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	Login.click();
	
	String parentWindow=driver.getWindowHandle();
	System.out.println("Parent Window:"+parentWindow);
	System.out.println("=======================================");
	
	Set<String> allWindow=driver.getWindowHandles();
	String title ="";
	System.out.println("All window handle:"+allWindow);
	System.out.println("=======================================");

	for(String temp:allWindow)
	{
		if(!temp.equals(parentWindow))
		{
			System.out.println("All Windows"+temp);
		
		driver.switchTo().window(temp);
		//System.out.println(driver.getTitle());
		
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

	public static void main(String[] args) 
	{
		MultiWindow obj=new MultiWindow();
		obj.multipleWindowHandling();
	}
}