package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadDataFromPropertyFile {
	public static void main(String[] args) throws IOException {
		// step 1: create FileInputStream object
		FileInputStream fis=new FileInputStream("./TestData/commondata.properties");
		
		// step 2: create respective file type object
		Properties prop=new Properties();
		
		// step 3: call read methods
		prop.load(fis);
		String URL = prop.getProperty("url");
		String email = prop.getProperty("email");
		String password = prop.getProperty("password");
		System.out.println(URL);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get(URL);
		
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.id("Email")).sendKeys(email);
		driver.findElement(By.id("Password")).sendKeys(password);
		
		
	}
}
