package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/Dropdown.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carSel=new Select(cars);
		carSel.selectByIndex(0);
		carSel.selectByValue("2");
		carSel.selectByVisibleText("Ferrari");
		
		Thread.sleep(2000);
//		carSel.deselectByIndex(2);
//		carSel.deselectByValue("2");
//		carSel.deselectByVisibleText("Audi");
		carSel.deselectAll();
		
	}
}
