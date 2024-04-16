package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenario3 
{

	@Test
	public void first_testcase()
	{
		System.out.println("this is first test case");
	}
	
	@Test(groups="Sanity")
	public void second_testcase()
	{
		System.out.println("this is second test case");
		Assert.assertEquals("Hello", "Hello1");
	}
	
	@Test
	public void third_testcase()
	{
		System.out.println("this is third test case");
	}
	
	@Test
	public void forth_testcase()
	{
		System.out.println("this is forth test case");
	}
	
	@Test
	public void fifth_testcase()
	{
		System.out.println("this is fifth test case");
	}
	
	@Test
	public void sixth_testcase()
	{
		System.out.println("this is sixth test case");
	}
	
	
	
}
