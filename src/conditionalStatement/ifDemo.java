package conditionalStatement;

public class ifDemo {

	public static void main(String[] args) 
	{
		System.out.println("Start test Case");
		String browser="ABD";
		
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.out.println("open the browser in the chrome browser");
		}
		else if(browser.equalsIgnoreCase("IE"))
		{
			System.out.println("open The ebrowser in the IE");
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.out.println("open the browser in Firefox");
		}
		else
		{
			System.out.println("Kindly provide valid browser name");
		}
		System.out.println("End testcasse");
	}

}
