package com.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNgBasic 
{
/*
Setup System properiy for chrome
Launch ChromeBrowser
login method
Enter URL
GooleTitleTest
Logout form app
Close The Browser
deleterAlltheCookies
  
 */
//pre-condition Annotation starting with @Before	
@BeforeSuite            

public void setUp()
{
	System.out.println("Setup System properiy for chrome");
}

@BeforeTest

public void launchBrowser()
{
	System.out.println("Launch ChromeBrowser");
}
@BeforeClass

public void login()
{
	System.out.println("login method");
}

@BeforeMethod

public void enterURL()
{
	System.out.println("Enter URL");
}

// TestCase start with @Test
@Test
public void googleTitletest()
{
	System.out.println("GooleTitleTest");
}
@Test
public void searchtestcase()
{
	System.out.println("searchtestcase");
}

@Test
public void googlelogotest()
{
System.out.println("googlelogotest");
}
//Post condition starting with @ After
@AfterMethod
public void logOut()
{
	System.out.println("Logout form app");
}
@AfterClass
public void closeBrowser()
{
	System.out.println("Close The Browser");
}

@AfterTest

public void deleterAlltheCookies()
{
	System.out.println("deleterAlltheCookies");
}







	
}
