package Browser;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowPopUp3 {

	public static void main(String[] args) 
	{
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		String parent=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #2')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #3')]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #4')]")).click();
		
		Set<String> allWindow=driver.getWindowHandles();
		ArrayList<String> s2=new ArrayList<String>(allWindow);
		driver.switchTo().window(s2.get(2));
		System.out.println(driver.getTitle());		
		driver.close();
		driver.switchTo().window(parent);
		driver.switchTo().window(s2.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(parent);
		driver.switchTo().window(s2.get(0));
		System.out.println(driver.getTitle());
		driver.close();
		//driver.switchTo().window(parent);
	}

}
