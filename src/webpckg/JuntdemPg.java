package webpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class JuntdemPg {
	ChromeDriver driver;
	
	@Before
	public void setUp() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test()
	{
		driver.get("https://www.facebook.com");
		String title=driver.getTitle();
		System.out.println(title);
	}
	@Test
	public void pageSource()
	{
		driver.get("https://www.google.com/");
		String pS=driver.getPageSource();
		if(pS.contains("Hello"))
		{
			System.out.println("Gmail is present");
		}
		else
		{
			System.out.println("Gmail is not present");
		}
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
}
