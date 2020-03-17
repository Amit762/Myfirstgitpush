package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsPopUp4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		String Pwindow=driver.getWindowHandle();
		System.out.println(driver.getTitle());
		WebElement clickElement=driver.findElement(By.xpath("//a[contains(text(),'Good PopUp')]"));
		System.out.println(clickElement.getSize());
		
		for(int i=0;i<=3;i++)
		{
			clickElement.click();
			Thread.sleep(4000);
		}
	}

}
