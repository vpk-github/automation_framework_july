package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.freshersworld.com/user/register?src=homeheader");
		Actions act=new Actions(driver);
//		WebElement jobs = driver.findElement(By.xpath("//li[@id='dropdown-trinst']"));
//		act.moveToElement(jobs).perform();
//		act.moveToElement(jobs, 5, 0).perform();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		Integer height=(Integer) js.executeScript(" return document.body.scrollHeight");
		System.out.println(height);
//		act.moveToElement(element).perform();
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.vtiger.com/");
//		WebElement features = driver.findElement(By.partialLinkText("Features"));
//		Actions act=new Actions(driver);
//		act.moveToElement(features).perform();
//		act.moveByOffset(392, 102).perform();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Actions act=new Actions(driver);
//		act.moveByOffset(388, 104).perform();
		
		
		
		
		
		
		
		
//		WebElement features = driver.findElement(By.partialLinkText("Features"));
//		
//		Actions act=new Actions(driver);
//		act.moveToElement(features).perform();
//		
//		WebElement sales = driver.findElement(By.partialLinkText("Sales Automation"));
//		act.moveToElement(sales).perform();
	}
}
