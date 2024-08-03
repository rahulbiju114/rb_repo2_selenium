package a1_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg8 extends Prg1{
	
	public void openCheckBox1() {
		
		d1.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		
	   List<WebElement> e1 = d1.findElements(By.xpath("//input[@type='checkbox']"));
	   
	   for(WebElement i : e1) {
		   
		   i.click();
		   
	   }
		
		
	}

	public static void main(String[] args) {
		
		Prg8 p8 = new Prg8();
		p8.openBrowser();
		p8.openCheckBox1();

	}

}
