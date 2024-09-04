// osqura -- input -- select input ----> ERROR --- pending

package a1_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prg23_dropdown_obsqura {
	
public WebDriver driver;
	
	public void dropDown() {
		
		
		driver = new ChromeDriver();
		driver.navigate().to("https://selenium.qabible.in/select-input.php");
		
		WebElement e1 = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
		                                                    
		
		Select s1 = new Select(e1);
		
		s1.selectByValue("Yellow");
	
		// Button - Get First Select
		
		WebElement e3 = driver.findElement(By.xpath("//button[text()='Get First Selected']"));
		e3.click();
		
		// print on console
		WebElement e2 = s1.getFirstSelectedOption();
		System.out.println(e2);
		
	}
		
		public void dropDown2() {
		
		////////////////////////////////////////////////////
		//  Robot class -  send keys -> ctrl select red yellow 
		// then click  Button - Get All Selected 
		
		// oR
		
			driver = new ChromeDriver();
			driver.navigate().to("https://selenium.qabible.in/select-input.php");
			
			WebElement e1 = driver.findElement(By.xpath("//select[@id='multi-select-field']"));
			                                                    
			
			Select s1 = new Select(e1);
		
		List<WebElement> e5 = s1.getAllSelectedOptions();  // covert webelement to list              --------------doubt
		
		// for each 
		
		for(WebElement i : e5 ) {
			
			i.click();
		}
		
		// Button - Get All Selected
				WebElement e4 = driver.findElement(By.xpath("//button[text()='Get All Selected']"));
				e4.click();
}
		
	
	
	public static void main(String[] args) {
		Prg23_dropdown_obsqura p1 = new Prg23_dropdown_obsqura();
		//p1.dropDown();
		p1.dropDown2();
		
		
	}
}