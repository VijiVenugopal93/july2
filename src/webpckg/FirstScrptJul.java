package webpckg;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstScrptJul {

	public static void main(String[] args) {

		ChromeDriver driver=new ChromeDriver();
		driver.get("https://facebook.com");
		String actualtitle=driver.getTitle();
		System.out.println(actualtitle);
		String s="Facebook";
		if(s.equals(actualtitle))
		{
			System.out.println("Title are same");
		}
		else
		{
			System.out.println("Title not same");
		}
		driver.quit();
	}
}
