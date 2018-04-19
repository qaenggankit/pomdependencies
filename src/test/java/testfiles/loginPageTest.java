package testfiles;


import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import testBase.testBase;

public class loginPageTest extends testBase{

	
	
	public loginPageTest() throws FileNotFoundException {
		super();
		// TODO Auto-generated constructor stub
	}

	@BeforeMethod
     
	public static void setUp()
	{
		initialization();
		try {
			Thread.sleep(8000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	
	public static void loginkaro()
	{
		obj.findElement(By.id("app_ad_name")).sendKeys("admin");
		obj.findElement(By.id("app_ad_pass")).sendKeys("admin");
		
		
		
	}
	
	@AfterMethod
	
	public static void tearDown() {
		
	}
}
