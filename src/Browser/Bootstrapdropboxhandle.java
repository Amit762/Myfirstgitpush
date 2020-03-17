package Browser;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrapdropboxhandle {

	public static void main(String[] args) 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=6.0_5");
		driver.findElement(By.xpath("//span[contains(text(),'Nothing selected')]//parent::button[@type='button']")).click();
		List<WebElement> l1=driver.findElements(By.xpath("//ul[contains(@class,'dropdown-menu inner')]//li//a//span"));
		System.out.println(l1.size());
		for(int i=0;i<l1.size();i++)
		{
			System.out.println(l1.get(i).getText());
			
			if(l1.get(i).getText().contains("HTML"))
			{
				l1.get(i).click();
				break;
			}
		
		}

	}

}
