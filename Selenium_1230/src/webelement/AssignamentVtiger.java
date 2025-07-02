package webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignamentVtiger {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("Vtiger")).click();
		
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String id:allWindowIds) {
			driver.switchTo().window(id);
			String actUrl = driver.getCurrentUrl();
			if (actUrl.contains("https://www.vtiger.com/")) {
				break;
			}
		}
	
		driver.findElement(By.id("loginspan")).click();
		driver.switchTo().window(parentId);
		
	}
}
