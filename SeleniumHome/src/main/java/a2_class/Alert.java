package a2_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Alert extends Base{
	
	public void alert() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement w = driver.findElement(By.xpath("//button[@class='btn btn-success']"));
		w.click();
		
		driver.switchTo().alert().accept();
		
	}
	
	public void alert2() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement w = driver.findElement(By.xpath("//button[@class='btn btn-warning']"));
		w.click();
		driver.switchTo().alert().accept();
		
	}
	
	public void alert3() {
		
		driver.navigate().to("https://selenium.qabible.in/javascript-alert.php");
		
		WebElement w = driver.findElement(By.xpath("//button[@class='btn btn-danger']"));
		w.click();
		driver.switchTo().alert().sendKeys("hi");
		//w.sendKeys("Hi");
		driver.switchTo().alert().accept();
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Alert a = new Alert();
		a.intiliseBrowser();
		// a.alert();
		// a.alert2();
		a.alert3();
	}

}
