package MavenPrac;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestNg_9_CrossBrowserTesting {
	WebDriver driver;
  @Test
  public void google() {
	  driver.get("https://www.google.com/");
  }
  @Parameters({"browser"})
  @BeforeTest
  public void beforeClass(String browser) {
	  try 
	  {
		if(browser.equalsIgnoreCase("Chrome"))  
		{
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browser.equalsIgnoreCase("ff"))
		{
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
	  }
	  catch(Exception e)
	  {
		  System.out.println(e.getMessage());
	  }
	  
  }

}
