package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnStaleElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.myntra.com/");
		
		MyntraPage mp=new MyntraPage(driver);
		mp.getSearchTextField().sendKeys("mobiles",Keys.ENTER);
		mp.getSearchTextField().sendKeys("shoes");
		
		
		
		
		
		
		
		
		
		
		
		
//		WebElement searchTF = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
//		searchTF.sendKeys("mobiles",Keys.ENTER);
//		searchTF.sendKeys("shoes");
	}
}
