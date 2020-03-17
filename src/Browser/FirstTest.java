package Browser;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstTest {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\asah6\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://toolsqa.com/automation-practice-form/");
		Select s1= new Select(driver.findElement(By.id("continents")));
		s1.selectByIndex(2);
		s1.deselectByVisibleText("Africa");
		List<WebElement> l1=s1.getOptions();
		
		int e1=l1.size();
		for(int i=0;i<=e1;i++)
		{
			String s2=s1.getOptions().get(i).getText();
			System.out.println(s2);
			if(s2.equalsIgnoreCase("Africa"))
			{
				s1.selectByIndex(i);
				break;
			}
			
			
		}

	}

}
