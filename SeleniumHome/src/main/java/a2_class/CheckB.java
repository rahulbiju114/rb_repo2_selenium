package a2_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import a2_class.Base;

public class CheckB extends Base{
	
	
	public void check() {
		
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");		
		
		WebElement m1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div[1]/div/div[2]/form/div[1]/div/label"));
		m1.click();
	}

	public static void main(String[] args) {
		
		CheckB b = new CheckB();
		b.intiliseBrowser();
		b.check();
		
	
	}

}
