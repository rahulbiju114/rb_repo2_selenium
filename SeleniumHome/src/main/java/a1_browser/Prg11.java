package a1_browser;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Prg11 extends Prg1 {
	
	public void drag1() {
		
		d1.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement e1 = d1.findElement(By.xpath("//span[text()='Draggable n°1']"));
		
		Actions a1=new Actions(d1);
		
		a1.moveToElement(e1).click();
		
		a1.doubleClick(e1).perform();
		
		WebElement e2 = d1.findElement(By.id("mydropzone"));
		
		a1.dragAndDrop(e1, e2).build().perform();
		
		
	}
	
	public void drag2() {
		
		d1.navigate().to("https://selenium.qabible.in/drag-drop.php");
		
		WebElement e1 = d1.findElement(By.xpath("//span[text()='Draggable n°2']"));
		
		Actions a1=new Actions(d1);
		
		a1.moveToElement(e1).click();
		
		a1.doubleClick(e1).perform();
		
		WebElement e2 = d1.findElement(By.id("mydropzone"));
		
		a1.dragAndDrop(e1, e2).build().perform();
	}
	
	
	

	public static void main(String[] args) {
		
		Prg11 p11 = new Prg11();
		
		p11.openBrowser();
		p11.drag1();
		p11.drag2();

	}

}
