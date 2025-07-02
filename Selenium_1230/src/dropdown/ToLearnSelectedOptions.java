package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectedOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/Dropdown.html");
		WebElement cars = driver.findElement(By.id("cars"));
		Select carSel=new Select(cars);
		carSel.selectByIndex(2);
		carSel.selectByIndex(0);
		
//		WebElement firstSelected = carSel.getFirstSelectedOption();
//		System.out.println(firstSelected.getText());
		
		List<WebElement> allSelecteOpt = carSel.getAllSelectedOptions();
		System.out.println(allSelecteOpt.size());
		for(WebElement ele:allSelecteOpt) {
			System.out.println(ele.getText());
		}
		
		System.out.println(carSel.isMultiple());
		
	}
}
