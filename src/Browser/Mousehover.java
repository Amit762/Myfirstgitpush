package Browser;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mousehover {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.spicejet.com/");
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//a[@id='highlight-addons']//parent::li[@id='header-addons']"))).build().perform();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Visa Services')]")).click();

	}

}
