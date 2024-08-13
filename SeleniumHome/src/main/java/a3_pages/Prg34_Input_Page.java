package a3_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Prg34_Input_Page {
	
	public WebDriver driver;
	
	
	public Prg34_Input_Page(WebDriver driver ) {   // constructor
		
		this.driver = driver;
		
		
		
		PageFactory.initElements(driver , this);
	}
	
	
	@FindBy(xpath="//input[@id='value-a']") WebElement valueA;	
	@FindBy(xpath="//input[@id='value-b']") WebElement valueB;	
	@FindBy(xpath="//button[@id='button-two']") WebElement button2;	
	
	public void enterValueForA(String valuea) {
		
		valueA.sendKeys(valuea);
	}
	
	public void enterValueForB(String valueb) {
		
		valueB.sendKeys(valueb);
	}
	
	public void getClicked() {
		
		button2.click();
	
}
	
}
