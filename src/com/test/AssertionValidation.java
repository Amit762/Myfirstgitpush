package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AssertionValidation 
{
WebDriver driver;
	
	@BeforeMethod
	
	public void setUp() {
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\asah6\\Desktop\\Selenium\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().deleteAllCookies();
	 driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	 driver.get("http://www.google.com");
	
	}
	
	@Test
	public void googleTitleTest()
	{
		String title=driver.getTitle();
		
		System.out.println(title);
		Assert.assertEquals(title, "Google","Title is not matched");
	}
	
	@Test(priority =1,groups = "Logo")
	public void testGoogleLogo()
	{
		boolean b=driver.findElement(By.xpath("//a[contains(text(),'Gmail')]")).isDisplayed();
		Assert.assertTrue(b);
	}
	@AfterMethod
	public void closebrowser()
	{
		driver.close();
	}
	
}
