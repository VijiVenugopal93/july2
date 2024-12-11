package webpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctrs {
	ChromeDriver driver;
	
	@Before
	public void setUp() 
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@Test
	public void pageSource()
	{
		String pG=driver.getPageSource();
		if(pG.contains("Gmail"))
		{
			System.out.println("String is present");
		}
		else
		{
			System.out.println("String not present");
		}
	}
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
