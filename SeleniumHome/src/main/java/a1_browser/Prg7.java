package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg7 extends Prg1{
	
	public void openRadioBox() {
	
	d1.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
	
	///  xpath - //input[@id='inlineRadio1']
	
	WebElement e1 = d1.findElement(By.cssSelector("input#inlineRadio1"));
	
	System.out.println(e1.isSelected());
	e1.click();
	System.out.println(e1.isSelected());
	
	WebElement e2 = d1.findElement(By.xpath("//button[text()='Show Selected Value']"));  
	
	//WebElement e2 = d1.findElement(By.id("button-one"));
	
	System.out.println(e2.isSelected());
	e2.click();
	System.out.println(e2.isSelected());
}
	
	
	public void openRadioBox2() {
		
		WebElement e3 = d1.findElement(By.xpath("//input[@id='inlineRadio21']"));
		e3.click();
		
		WebElement e4 = d1.findElement(By.id("inlineRadio23"));
		e4.click();
		
		WebElement e5 = d1.findElement(By.id("button-two"));
		e5.click();
		
	}

	public static void main(String[] args) {
		
		Prg7 p7 = new Prg7();
		
		p7.openBrowser();
		p7.openRadioBox();
		p7.openRadioBox2();
	}

}
