package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg6 extends Prg1 {
	
	public void openCheckBox() {
		
		d1.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
		// WebElement e1 = d1.findElement(By.id("gridCheck"));
		
		WebElement e1 = d1.findElement(By.xpath("//input[@id='gridCheck']"));
		
		System.out.println(e1.isSelected());
		
		e1.click();
		
		System.out.println(e1.isSelected());
		
		
	}
	

	public static void main(String[] args) {
		
		Prg6 p6 = new Prg6();
		
		p6.openBrowser();
		p6.openCheckBox();
		
		

	}

}
