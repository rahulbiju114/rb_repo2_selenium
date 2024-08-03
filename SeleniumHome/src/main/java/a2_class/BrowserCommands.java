package a2_class;

public class BrowserCommands extends Base {
	
	
	public void browCommand() {
		
		String title =  driver.getTitle();
		System.out.println(title);
		
		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		
		String pg = driver.getPageSource();
		System.out.println(pg);
		
		 
	}

	public static void main(String[] args) {
	
		 BrowserCommands bc = new  BrowserCommands();
		 
		 bc.intiliseBrowser();
		 bc.browCommand();
	}

}
