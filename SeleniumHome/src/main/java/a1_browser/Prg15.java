package a1_browser;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Prg15 
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
	System.out.println("All window handle:"+allWindow);
	System.out.println("=======================================");

	for(String temp:allWindow)
	{
		if(!temp.equals(parentWindow))
			System.out.println("All Windows"+temp);
	}
}
	public static void main(String[] args) 
	{
		Prg15 obj=new Prg15();
		obj.multipleWindowHandling();
	}
}