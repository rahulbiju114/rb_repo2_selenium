package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg5 extends Prg1 {
	
	public void openSite1() {
		
		d1.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement e1 = d1.findElement(By.id("single-input-field"));
		e1.sendKeys("Hello");
		
		WebElement e2 = d1.findElement(By.id("button-one"));
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
		
		
		Prg5 p5 = new Prg5();
		
		p5.openBrowser();
	//  p5.openSite1();
		p5.openSite2();
		
	}

}
