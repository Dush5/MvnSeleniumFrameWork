package DynamicTable;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class CommonLib 
{
	public static WebDriver driver;
	
	public void getData()
	{
		System.setProperty("Webdriver.gecko.driver","./Third_Party_drivers/geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Lenovo/Desktop/table.html");
		 driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		 
		
				
			
				
		
	}
	
}
