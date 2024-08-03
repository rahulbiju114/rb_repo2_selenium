package a1_browser;

public class Prg2 extends Prg1{
	
	
	
	public void openBrowser2() {
		
		
		d1.navigate().to("https://www.amazon.in/");
		
		
	}
	
	public void openBrowser2Sett() {
		
		
		d1.navigate().forward();
		d1.navigate().back();
		d1.navigate().refresh();
		
		d1.quit();
		
	}
	

	public static void main(String[] args) {
		
		Prg2 p2 = new Prg2();
		
		p2.openBrowser();
		p2.openBrowser2();
		p2.openBrowser2Sett();
		
		
		
	}

}
