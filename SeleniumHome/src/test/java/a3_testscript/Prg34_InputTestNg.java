package a3_testscript;

import org.testng.annotations.Test;

import a3_pages.Prg34_Input_Page;

public class Prg34_InputTestNg extends Prg34_Base {
	
	
  @Test
  public void enter2ValuesSum() {
	  
	  String valA1 = "10";
	  String valB1 = "2";
	  
	Prg34_Input_Page inpt1 = new Prg34_Input_Page(driver);
	  
	  inpt1.enterValueForA(valA1);
	  inpt1.enterValueForB(valB1);
	  inpt1.getClicked();
	  
  }
}
