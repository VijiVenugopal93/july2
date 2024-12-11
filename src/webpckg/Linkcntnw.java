package webpckg;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkcntnw {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void numOfLinksn()
	{
		List<WebElement> linkD=driver.findElements(By.tagName("a"));
		System.out.println("Total No of links="+linkD.size());
		
		for(WebElement e:linkD)
		{
			String link=e.getAttribute("href");
			String linkText=e.getText();
			System.out.println("Link="+link);
			System.out.println("Link Text="+linkText);
		}
	}

}
