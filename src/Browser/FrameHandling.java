package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://classic.crmpro.com/index.html");
		driver.findElement(By.xpath("//input[@class='form-control'and@name='username']")).sendKeys("amit006");
		driver.findElement(By.xpath("//input[@class='form-control'and@name='password']")).sendKeys("Ak@1988idea");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.switchTo().frame("mainpanel");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		

	}

}
