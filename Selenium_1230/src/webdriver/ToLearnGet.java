package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ToLearnGet {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
//		WebDriver driver=new EdgeDriver();
		
		driver.get("www.flipkart.com/");
	}
}
