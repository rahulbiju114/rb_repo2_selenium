package a2_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import a2_class.Base;

public class Locators extends Base{
	
	public void id() {
		
		WebElement el = driver.findElement(By.id("single-input-field"));
		
		WebElement el2 =driver.findElement(By.id("button-one"));
		
		WebElement el3=driver.findElement(By.id("value-a"));
		
		
		
	}
	
	
	public void classLoc() {
		
		WebElement ele = driver.findElement(By.className("top-logo"));
		WebElement ele2 = driver.findElement(By.className("navbar-nav"));
		WebElement ele3 = driver.findElement(By.className("btn btn-success btn-block"));
		
	}
	
	public void nameLoc() {
		
		WebElement elem1 = driver.findElement(By.name("daterange"));
		WebElement elem2 = driver.findElement(By.name("states[]"));
		WebElement elem3= driver.findElement(By.name("from"));
	}
	
	public void linkLoc() {
		
		WebElement eleme1= driver.findElement(By.linkText("check-box-demo.php"));
	}

	
	public void partLinkLoc() {
		
		WebElement elemen1= driver.findElement(By.partialLinkText("radio-button"));
	}

		
	public void tagId() {
		
		//tag and id
		
		// input#idvalue
		
		WebElement e1=driver.findElement(By.cssSelector("input#gridCheck"));

		
		//tag and class
		
		// input.classvalue
		
		WebElement e2=driver.findElement(By.cssSelector("input.form-check-input"));

		
		//tag and attribute
		
		// input[att type = attr value]
		
		WebElement e3=driver.findElement(By.cssSelector("input[class=form-check-input]"));

		
		//tag class attribute
		
		// input.class value [att type = attr value]
		
		WebElement element4=driver.findElement(By.cssSelector("input.form-check-input[type=checkbox]"));
	}
	
	public void xpath()
	{
		// highlight - rightclick - copy - full xpath
		
		
		WebElement a1=driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/input"));
		
		//tagname[@attribute='value']
		WebElement r2=driver.findElement(By.xpath("//input[@class='form-check-input']"));
		
		
	}
	
	public void dynamicXpath() {
		
		// //tag[ contains( @type , partial value ) ]
		
		WebElement b1=driver.findElement(By.xpath("//button[contains(@id,'one')]"));
		
		
		//tag[ text() = 'value' ]
		
		WebElement b2=driver.findElement(By.xpath("//button[text()='Show Message']"));
		
		
		// child class
		// rlative // child
		//tagname[@attribute='value'] //child :: //tagname[@attribute='value']
		
		WebElement c1=driver.findElement(By.xpath("//button[@class='navbar-toggler']//child::span[@class='navbar-toggler']"));
		
		
		 //tag[@type='value']//parent::form 
		WebElement p1=driver.findElement(By.xpath("//button[@class='btn btn-primary']//parent::form"));
		
		//xpath + folowing dic xpath
		  WebElement f1=driver.findElement(By.xpath("//button[@id='button-one']//following::div[@id='message-one']"));
		
		  WebElement i1=driver.findElement(By.xpath("(//form[@method='POST'])[1]"));
		  
		  
	}
	
	
	public static void main(String[] args) {
		
			Locators l = new Locators();
			l.intiliseBrowser();
	}

}
