package Browser;



import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class AlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Alert alert=driver.switchTo().alert();
		
		System.out.println(alert.getText());
		String text=alert.getText();
		if(text.equals("Please enter a valid user name"))
		{
			System.out.println("correct alert message");
		}
		else
		{
			System.out.println("Not currect message");
		}
		
		Thread.sleep(2000);
		alert.accept();
		
		
		driver.close();
		

	}

}
