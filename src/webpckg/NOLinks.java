package webpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NOLinks {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void numOfLinkss()
	{
		List<WebElement> linkDtls=driver.findElements(By.tagName("a"));
		System.out.println("Total no. of links="+linkDtls.size());
		for(WebElement e:linkDtls)
		{
			String Link=e.getAttribute("href");
			String linkText=e.getText();
			System.out.println(Link);
			System.out.println(linkText);
		}
	}

}
