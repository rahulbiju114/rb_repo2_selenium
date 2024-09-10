package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Prg4 extends Prg1 {
	
	public void idLoc() {
		
		 
		WebElement el1 = d1.findElement(By.id("single-input-field"));
		WebElement el2 = d1.findElement(By.id("button-one"));
		WebElement el3 = d1.findElement(By.id("value-a"));
		WebElement el4 = d1.findElement(By.id("value-b"));
		
		
	}
	
	public void classNameLoc() {
		
		WebElement e1 = d1.findElement(By.className("col-lg-9 col-md-9 col-sm-12 col-xs-12"));
		WebElement e2 = d1.findElement(By.className("my-2"));
		WebElement e3 = d1.findElement(By.className("navbar navbar-expand-md navbar-dark"));
		WebElement e4 = d1.findElement(By.className("navbar-brand"));
		
		
	}
	
	public void nameLoc() {
		
		WebElement ele1 = d1.findElement(By.name("daterange"));
		WebElement ele2= d1.findElement(By.name("duallistbox_demo1[]"));
		WebElement ele3 = d1.findElement(By.name("states[]"));
		WebElement ele4 = d1.findElement(By.name("from"));
		
	}
	
	
	public void linkTextLoc() {
		
		WebElement e = d1.findElement(By.linkText("check-box-demo.php"));
		
	}
	
	public void partialLinktextLoc() {
		
		WebElement a = d1.findElement(By.partialLinkText("radio-button"));
		
	}
	
	public void cssSelector() {
		
		// tag and id
		
		// tag # id value
		
		WebElement b1 = d1.findElement(By.cssSelector("input#gridCheck"));
		
		// tag and class
		
		// tag . class value
		
		WebElement b2 = d1.findElement(By.cssSelector("input.form-check-input"));
		
		// tag and attribute
		
		// tag[Attribute type = attribute value]
				
		WebElement b3 = d1.findElement(By.cssSelector("input[class=form-check-input]"));
		
		
		// tag class and attribute
		
		// tag.class value[Attribute type = attribute value]
		
		WebElement b4 = d1.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
		
	}
	
	
	public void xpath() {
		
		// absolute xpath
		
		WebElement c1 = d1.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
		
		// relative xpath
		
		//   //tag[@attribute type = attribute value]
		
		WebElement c2 = d1.findElement(By.xpath("//input[@class='form-check-input']"));
		
		
		
	}
	
	
	public void dynamicXpath() {
		
		//dynamic xpath
		
		// contains
		// tag[ contains ( @type, 'partial value')]
		
		WebElement f1 = d1.findElement(By.xpath("//button[contains(@id,'one')]"));
		
		// text()
		// tag[text()= 'value']
		
		WebElement f2 = d1.findElement(By.xpath("//button[text()='Show Message']"));
		
		
		// xpath -> axis method
		
		// child tag
		
   //   xpath // child :: xpath
		
		WebElement f3 = d1.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler-icon']"));
		
		// parent tag
		
	//   xpath // parent :: tagname
		
		WebElement f4 = d1.findElement(By.xpath("//button[@id='button-one']//parent::form")); 
		
		// follwoing
		
		WebElement f5 = d1.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']")); 

	}
	

	public static void main(String[] args) {
		
		Prg4 p4 = new Prg4();
		
		p4.openBrowser();
		p4.idLoc();

	}

}
