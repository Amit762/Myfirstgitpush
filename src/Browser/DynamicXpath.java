package Browser;

import java.io.File;
import java.nio.file.Files;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@class='form-control'and@name='username']")).sendKeys("amit006");
		driver.findElement(By.xpath("//input[@class='form-control'and@name='password']")).sendKeys("Ak@1988idea");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}

}
