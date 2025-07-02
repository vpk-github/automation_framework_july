package testng;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ToLearnTestNG {// TestNG class
	
	@Test
	public void sample() {
		Reporter.log("Sample test case executed",true);
	}
	
	@Test
	public void demo() {// test case
		// test steps
		Reporter.log("demo test case executed",true);
	}
}