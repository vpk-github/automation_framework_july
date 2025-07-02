package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnGetOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/Dropdown.html");
		
		WebElement cars = driver.findElement(By.id("cars"));
		Select carSel=new Select(cars);
		List<WebElement> allOptions = carSel.getOptions();
		System.out.println(allOptions.size());
		
		for(WebElement ele:allOptions) {
			System.out.println(ele.getText());
		}
	}
}
