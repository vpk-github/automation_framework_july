package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Kawasaki {
	@Test(groups = "smoke")
	public void launch() {
		WebDriver driver=new ChromeDriver();
		driver.get("www.kawasaki-india.com/");
		Reporter.log("Kawasaki launched",true);
	}
}
