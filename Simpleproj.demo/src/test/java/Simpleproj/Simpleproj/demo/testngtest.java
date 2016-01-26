package Simpleproj.Simpleproj.demo;

import org.testng.annotations.Test;

public class testngtest {
	@Test
	public void testmethod()
	{
		
				
		String bb =  System.getProperty("browser");
		System.out.println("printing testng using maven and using " +bb + "   browser");
	}

}
