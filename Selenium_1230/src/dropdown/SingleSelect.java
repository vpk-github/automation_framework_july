package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	driver.get("https://www.facebook.com/reg");
	
	WebElement month = driver.findElement(By.id("month"));
	
	Select monthSel=new Select(month);
	List<WebElement> allOptions = monthSel.getOptions();
	
	for(WebElement ele:allOptions) {
		monthSel.selectByVisibleText(ele.getText());
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	WebElement month = driver.findElement(By.id("month"));//address of dropdown
//	Select monthSel=new Select(month);   // select class object
//	System.out.println(monthSel.isMultiple());
	
////	monthSel.selectByIndex(11);
////	monthSel.selectByValue("10");
//	monthSel.selectByVisibleText("Jul");
}
}
