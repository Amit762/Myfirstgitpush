package Browser;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		Set<String> handler=driver.getWindowHandles();
		int count=handler.size();
		System.out.println("total no of window is "+count);
		Iterator<String>it=handler.iterator();
		String parentwind=it.next();
		System.out.println("Parent window id is "+parentwind);
		String chiledwind=it.next();

		System.out.println("Child window id is"+chiledwind);
		driver.switchTo().window(chiledwind);
		Thread.sleep(2000);
		System.out.println("child window popup title is "+driver.getTitle());
		driver.close();
		driver.switchTo().window(parentwind);
		
		System.out.println("Parent window popup title is"+driver.getTitle());
	}

}
