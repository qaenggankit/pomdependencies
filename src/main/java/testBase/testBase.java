package testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testBase {

	public static WebDriver obj;
	public static Properties prop;
	
	
	static {
		
		
		prop = new Properties();
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\config\\config.properties");
			prop.load(in);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public testBase() throws FileNotFoundException
	{		
		
	}
	
	
	public static void initialization()
	{
		String browsername = prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","F:\\chrome driver\\chromedriver.exe");
			obj = new ChromeDriver();
		}
			obj.manage().window().maximize();
			 obj.manage().deleteAllCookies();
		obj.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
		obj.get(prop.getProperty("url"));
}

}

