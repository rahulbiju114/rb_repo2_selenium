// Assign


package a1_browser;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg9 extends Prg1 {
	
	public void openSite1() {
		
		d1.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement e1 = d1.findElement(By.id("single-input-field"));
		e1.sendKeys("Hi");
		
		WebElement e2 = d1.findElement(By.id("button-one"));
		e2.click();
		
		
		WebElement e4 = d1.findElement(By.id("value-a"));
		e4.sendKeys("Hi");
		
		WebElement e5 = d1.findElement(By.id("value-b"));
		e5.sendKeys("Hi");
		
		WebElement e3 = d1.findElement(By.id("button-two"));
		e3.click();
		
		
	}


	public static void main(String[] args) {
		
		
		Prg9 p9 = new Prg9();
		
		p9.openBrowser();
		p9.openSite1();
		
		
	}

}
