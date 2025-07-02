package demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Launch {
@Test
public void MakeMyTrip() {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
}

}
