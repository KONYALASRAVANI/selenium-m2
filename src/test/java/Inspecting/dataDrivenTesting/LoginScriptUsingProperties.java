package Inspecting.dataDrivenTesting;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptUsingProperties {

	public static void main(String[] args) throws InterruptedException, IOException  {
		FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
		Properties  property =new Properties();
		property.load(fis);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(property.getProperty("url"));
		long time=Long.parseLong(property.getProperty("timeouts"));
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    
		driver.findElement(By.name("email")).sendKeys(property.getProperty("username"));
		driver.findElement(By.name("password")).sendKeys(property.getProperty("password"));
		driver.findElement(By.id("last")).click();
		

		Thread.sleep(4000);
		driver.quit();
	}

}
