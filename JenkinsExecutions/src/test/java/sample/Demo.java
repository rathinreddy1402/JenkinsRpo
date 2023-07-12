package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Demo 
{
	
@Test
		public void m1()
		{
	WebDriver driver;
	
	 String BROWSER = System.getProperty("browser");
	String URL = System.getProperty("url");
		
	if(BROWSER.equalsIgnoreCase("chrome"))
	{
		driver=new ChromeDriver();
	}
	else if(BROWSER.equalsIgnoreCase("edge"))
	{
		driver=new EdgeDriver();
	}
	driver=new ChromeDriver();
		}

		}


