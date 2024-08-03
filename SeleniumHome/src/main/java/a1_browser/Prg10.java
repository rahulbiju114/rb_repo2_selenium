package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg10 extends Prg1{
	
	public void alert1() {
		
		d1.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement e1 = d1.findElement(By.xpath("//button[@class='btn btn-success']"));
		e1.click();
		d1.switchTo().alert().accept();
		
	}
	
	public void alert2() {
		
		d1.navigate().to("https://selenium.qabible.in/javascript-alert.php");

		WebElement e1 = d1.findElement(By.xpath("//button[@class='btn btn-warning']"));
		
		e1.click();
		
		d1.switchTo().alert().dismiss();
	}
	
	
	public void alert3() {
		
		d1.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement e1 = d1.findElement(By.xpath("//button[@class='btn btn-danger']"));
		e1.click();
		
		
		d1.switchTo().alert().sendKeys("hi");
		d1.switchTo().alert().accept();
	}
	

	public static void main(String[] args) {
		
		Prg10 p10 = new Prg10();
		p10.openBrowser();
		//p10.alert1();
		//p10.alert2();
		p10.alert3();

	}

}
