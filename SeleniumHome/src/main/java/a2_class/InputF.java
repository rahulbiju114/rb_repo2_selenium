 package a2_class;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import a2_class.Base;


public class InputF extends Base {
	
	public void input() {
		
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		
		WebElement m1 = driver.findElement(By.id("single-input-field"));
		m1.sendKeys("Good");
	
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		WebElement m2 = driver.findElement(By.id("button-one"));
		wait.until(ExpectedConditions.elementToBeClickable(m2));
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
