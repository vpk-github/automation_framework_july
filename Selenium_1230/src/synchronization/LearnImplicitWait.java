package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LearnImplicitWait {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/23");
		driver.findElement(By.id("Check Delivery")).sendKeys("560010");
		WebElement checkBtn = driver.findElement(By.id("Check"));
		
		FluentWait fwait=new FluentWait(driver);
		fwait.withTimeout(Duration.ofSeconds(20));
		fwait.pollingEvery(Duration.ofMillis(200));
		fwait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		checkBtn.click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(1));
//		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
//		checkBtn.click();
	}
}
