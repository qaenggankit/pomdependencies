package testfiles;


import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.testBase;

public class loginPageTest{

	
	
	
	@BeforeMethod
     
	public static void setUp()
	{
		
	testBase.initialization();
	
	
	}
	
	@Test
	
	public static void loginkaro()
	{
		
		System.out.println(testBase.obj.getCurrentUrl());
		
		
		
	}
	
	@Test
	
	public static void title()
	{
		System.out.println(testBase.obj.getTitle());
	}
	
	
	
	@AfterMethod
	
	public static void tearDown() {
		
	}
}
