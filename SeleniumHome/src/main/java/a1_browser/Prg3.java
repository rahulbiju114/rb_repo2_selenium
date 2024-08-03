package a1_browser;

public class Prg3 extends Prg1 {
	
	public void browserCommands() {
		
		String t1 = d1.getTitle();
		String u1 = d1.getCurrentUrl();
		String pg1 = d1.getPageSource();
		
		System.out.println(t1);
		System.out.println(u1);
		System.out.println(pg1);
		
	}

	public static void main(String[] args) {
		
		Prg3 p3 = new Prg3();
		
		p3.openBrowser();
		p3.browserCommands();
	}

}
