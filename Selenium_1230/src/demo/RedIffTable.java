package demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedIffTable {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://money.rediff.com/indices/nse/nifty-50");
		
		List<WebElement> headings = driver.findElements(By.xpath("//table/thead/tr/th"));
		List<WebElement> rows = driver.findElements(By.xpath("//tbody/tr"));
		List<WebElement> datas = driver.findElements(By.xpath("//tbody/tr/td"));
		int k=0;
		for(int i=0;i<headings.size();i++) {
			System.out.print(headings.get(i).getText()+"\t");	
		}
		System.out.println();
//		
		for(int j=0;j<rows.size();j++) {
			for(int i=0;i<headings.size();i++) {
				System.out.print(datas.get(k).getText()+"\t");
				k++;
			}
			System.out.println();
		}
	}
}
