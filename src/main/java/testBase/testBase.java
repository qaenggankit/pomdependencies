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
	
	
	public testBase() throws FileNotFoundException
	{
		prop = new Properties();
		
		FileInputStream in = new FileInputStream("C:\\Users\\Windows10\\eclipse-workspace\\PageObjectModel\\src\\main\\java\\config\\config.properties");
		
		try {
			prop.load(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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

