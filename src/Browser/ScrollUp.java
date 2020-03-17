package Browser;

import java.util.concurrent.TimeUnit;

import javax.security.auth.kerberos.KerberosKey;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUp {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32 (1)\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com");
		//WebElement e=driver.findElement(By.id("Search Google or type a URL"));
		//e.sendKeys("Testing");
		//e.sendKeys(Keys.ENTER);
		//js.executeScript("window.scrollBy(10.100");
		

	}

}
