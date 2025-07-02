package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnXpath {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/abhis/OneDrive/Desktop/loginpage.html");
		
//		driver.findElement(By.xpath("/html/body/input[1]")).sendKeys("Abhijith");
		
		driver.findElement(By.xpath("//input[1]")).sendKeys("abhijith");
	}
}
