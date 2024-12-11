package testngpkg;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngdmo {
	
	@BeforeTest
	public void setUp()
	{
		System.out.println("Browser open");
	}
	
	@BeforeMethod
	public void urlloading()
	{
		System.out.println("URL details");
	}
	
	@Test(priority=3,invocationcount=)
	public void test1()
	{
		System.out.println("Test 1");
	}
	@Test(priority=1)
	public void test2()
	{
		System.out.println("Test 2");
	}
	@Test(priority=2)
	public void test3()
	{
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void afterMthd() 
	{
		System.out.println("After Method details");
	}
	@AfterTest
	public void tearDown()
	{
		System.out.println("Quit the browser");
	}
}
