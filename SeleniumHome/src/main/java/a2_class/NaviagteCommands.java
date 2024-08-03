package a2_class;

import a2_class.Base;

public class NaviagteCommands extends Base{
	
	public void navigateCommands() {
		
		driver.navigate().to("https://www.amazon.in/");
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
		
		
	}

	public static void main(String[] args) {
		
		NaviagteCommands n = new NaviagteCommands();
		n.intiliseBrowser();
		n.navigateCommands();
		

	}

}
