package webpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfLinks {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void numOfLinks()
	{
		List<WebElement> linkDetails=driver.findElements(By.tagName("a"));
		System.out.println("Total number of links="+linkDetails.size());
		for(WebElement element:linkDetails)
		{
			String Link=element.getAttribute("href");
			String LinkText=element.getText();
			System.out.println(Link);
			System.out.println(LinkText);
		}
	}

}
