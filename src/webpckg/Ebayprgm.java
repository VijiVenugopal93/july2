package webpckg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ebayprgm {
	ChromeDriver driver;
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
	}
	@Test
	public void ebayM()
	{
		driver.findElement(By.xpath("//header[@id='gh']/table/tbody/tr/td[2]/div/button")).click();
		driver.findElement(By.xpath("//table[@id='gh-sbc']/tbody/tr/td[1]/ul/li[4]/a")).click();
	}
}
