// Assign


package a2_class;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import a2_class.Base;

public class Prg9 extends Base {
	
	public void openSite1() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement e1 = driver.findElement(By.id("single-input-field"));
		e1.sendKeys("Hi");
		
		WebElement e2 = driver.findElement(By.id("button-one"));
		e2.click();
		
		
		WebElement e4 = driver.findElement(By.id("value-a"));
		e4.sendKeys("Hi");
		
		WebElement e5 = driver.findElement(By.id("value-b"));
		e5.sendKeys("Hi");
		
		WebElement e3 = driver.findElement(By.id("button-two"));
		e3.click();
		
		
	}


	public static void main(String[] args) {
		
		
		Prg9 p9 = new Prg9();
		
		p9.intiliseBrowser();
		p9.openSite1();
		
		
	}

}
