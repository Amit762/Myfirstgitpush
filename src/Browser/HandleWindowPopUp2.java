package Browser;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleWindowPopUp2 {

	public static void main(String[] args) {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://popuptest.com/goodpopups.html");
		String parent1=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[contains(text(),'Good PopUp #1')]")).click();
		Set<String> handler=driver.getWindowHandles();
		int count=handler.size();
		System.out.println("total no of window is "+count);
		
		for(String childwind:handler)
		{
			if(!parent1.equalsIgnoreCase(childwind))
			{
				driver.switchTo().window(childwind);
				System.out.println("child window popup is "+driver.getTitle());
			}
		}
         driver.close();
         driver.switchTo().window(parent1);
	}

}
