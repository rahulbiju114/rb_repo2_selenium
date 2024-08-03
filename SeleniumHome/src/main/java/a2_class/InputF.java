package a2_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import a2_class.Base;


public class InputF extends Base {
	
	public void input() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement m1 = driver.findElement(By.id("single-input-field"));
		m1.sendKeys("Good");
		WebElement m2 = driver.findElement(By.id("button-one"));
		m2.click();
		
	}
	
	public void input1() {
		
		WebElement m1 = driver.findElement(By.id("value-a"));
		m1.sendKeys("20");
		WebElement m2 = driver.findElement(By.id("value-b"));
		m2.sendKeys("20");
		WebElement m3 = driver.findElement(By.id("button-two"));
		m3.click();
		
		System.out.println(m3.getText());
	}

	public static void main(String[] args) {
		
		InputF i = new InputF();
		i.intiliseBrowser();
		i.input();
		i.input1();
;
	}

}
