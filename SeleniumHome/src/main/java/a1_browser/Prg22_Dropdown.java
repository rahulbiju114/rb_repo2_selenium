// DropDown -- Select class uses --- 

package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prg22_Dropdown{
	
	
	public WebDriver driver;
	
	public void dropDown() {
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		
		WebElement e1 = driver.findElement(By.xpath("//select[@class='dropdown-menu-lists']"));
		e1.click();                                                       
		
		Select s1 = new Select(e1);
		
		// 1. Visible text
		
	//	s1.selectByVisibleText("JAVA");
		
		// 2. by index
		
	//	s1.selectByIndex(2);
		
		// 3. Value
		
		s1.selectByValue("sql");
		
	}
                                                                                       
	public static void main(String[] args) {
		
		Prg22_Dropdown p1 = new Prg22_Dropdown();
		p1.dropDown();

	}

}
