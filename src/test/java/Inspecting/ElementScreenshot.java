package Inspecting;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ElementScreenshot {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.swiggy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement zomato=driver.findElement(By.xpath("//div[contains(@classsc-jxOSlx ieOxK']"));
				
		File src=zomato.getScreenshotAs(OutputType.FILE);
		File dest=new File("./Screenshots/swiggy.png");
		FileHandler.copy(src,dest);
		driver.quit();
		
		
		// TODO Auto-generated method stub

	}

}
