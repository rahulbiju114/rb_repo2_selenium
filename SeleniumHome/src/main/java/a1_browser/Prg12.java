// Tables

package a1_browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Prg12 extends Prg1 {
	
	public void fullTable() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement e1 = d1.findElement(By.xpath("//table[@id='dtBasicExample']"));  //full table
		
		System.out.println(e1.getText());
		System.out.println("==========================================");
		
	}
	
	public void openRow() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement e1 = d1.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]")); // particular full row
		
		System.out.println(e1.getText());
		System.out.println("==========================================");
		
		
	}
	
	public void openColumn() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		WebElement e1 = d1.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));  // particular rows 1st column item
		
		System.out.println(e1.getText());
		System.out.println("==========================================");
		
		
	}
	
	public void openListColumn() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		List<WebElement> e1 = d1.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));  // particlar row 1st full column
		
		for(WebElement i : e1) {
			
			System.out.println(i.getText());
		}
		System.out.println("==========================================");
		
		
	}
	
	public void openListColumn2() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		String s ="Junior Technical Author";
		
		List<WebElement> e1 = d1.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[2]]"));
		
		for(WebElement i : e1) {
			
			if(i.getText().equals(s)) {
			
			System.out.println(i.getText());
		}
			
			else {
				System.out.println("Not element");
			}
			
			
			
		System.out.println("==========================================");
		
		
	}
	}
	
	
	public void openListColumn3() {
		
		d1.navigate().to("https://selenium.qabible.in/table-pagination.php");
		
		
		
		WebElement e1 = d1.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[2]/td[3]"));
		
		System.out.println(e1.getText());
		System.out.println("==========================================");
		
		
	}
	


	public static void main(String[] args) {

	Prg12 t1 = new Prg12();
	t1.openBrowser();
	
	//t1.fullTable();
	t1.openRow(); 
	t1.openColumn();
	t1.openListColumn();
	
	t1.openListColumn3();
	
	//t1.openListColumn2();

	}

}
