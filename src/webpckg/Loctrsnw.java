package webpckg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loctrsnw {
	ChromeDriver driver=new ChromeDriver();
	
	@Before
	public void setUp()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=674893540034&hvpos=&hvnetw=g&hvrand=12412127926351686459&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9149295&hvtargid=kwd-64107830&hydadcr=14452_2316413&gad_source=1");
	}
	@Test
	public void locateEle()
	{
		driver.findElement(By.xpath("//div[@id=\'nav-xshop\']/a[4]")).click();
		
	}
}
