package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Prg29_Input extends Prg28_Base {
	
	
  @Test(priority = 1)
  public void f() {
	  
	  WebElement e1 = driver.findElement(By.xpath("//input[@id='single-input-field']"));
	  e1.sendKeys("Hiii");
	  
	  
	  WebElement e2 = driver.findElement(By.xpath("//button[@id='button-one']"));
	  e2.click();
	  
	  
  
	  WebElement e3 = driver.findElement(By.xpath("//input[@id='value-a']"));
	  e3.sendKeys("2");
	  

	  
	  WebElement e5 = driver.findElement(By.xpath("//input[@id='value-b']"));
	  e5.sendKeys("10");
	  
	  
	  WebElement e6 = driver.findElement(By.xpath("//button[@id='button-two']"));
	  e6.click();
	  
  }
  
  
  
}
