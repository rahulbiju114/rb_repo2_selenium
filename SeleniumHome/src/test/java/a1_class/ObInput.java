package a1_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ObInput extends ObBase{
  @Test
  public void input() {
	  
	  WebElement e1 = driver.findElement(By.id("single-input-field"));
	  e1.sendKeys("Hi");
	  
	  WebElement e2 = driver.findElement(By.id("button-one"));
	  e2.click();
	  
	  WebElement e3 = driver.findElement(By.id("value-a"));
	  e3.sendKeys("2");
	  
	  WebElement e4 = driver.findElement(By.id("value-b"));
	  e4.sendKeys("4");
	  
	  WebElement e5 = driver.findElement(By.id("button-two"));
	  e5.click();
	  
	    
  }
}
