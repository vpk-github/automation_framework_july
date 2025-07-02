package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();

		switchToWindow(driver,"flipkart");
		Point flPosition = driver.manage().window().getPosition();
		
		switchToWindow(driver, "ebay");
		Point ebPosition = driver.manage().window().getPosition();
		
		driver.manage().window().setPosition(flPosition);
		
		switchToWindow(driver, "flipkart");
		driver.manage().window().setPosition(ebPosition);
	}
	
	public static void switchToWindow(WebDriver driver,String expUrl) {
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains(expUrl)) {
				break;
			}
		}
	}
}