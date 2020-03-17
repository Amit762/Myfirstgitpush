package Browser;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchApplication {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.firefox.marionette","C:\\Users\\asah6\\Desktop\\Selenium\\geckodriver-v0.24.0-win64\\geckodriver.exe");
		FirefoxDriver driver =new FirefoxDriver();
		//driver.get("https://www.facebook.com/");

		
		
		

	}

}
