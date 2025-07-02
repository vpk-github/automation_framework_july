package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript extends BaseClass{
	@Test(groups = "smoke")
	public void clickOnBooks() {
		driver.findElement(By.partialLinkText("BOOKS")).click();
		if (driver.getTitle().equals("Demo Web Shop. Books")) {
			Reporter.log("Books page is displayed",true);
		}else {
			Reporter.log("Books page is not displayed",true);
		}
	}
}
