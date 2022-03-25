package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test0 {
	
	@Test
	public void tc1() {
	Reporter.log("hello selenium",true);	
	Reporter.log("Hello java",false);
	}

}
