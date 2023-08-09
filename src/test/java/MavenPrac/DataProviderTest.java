package MavenPrac;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DataProviderTest {
	 WebDriver driver;
  @Test(dataProvider = "dp")
  public void login(String Uname, String pwd) {
	  driver.get("http://ts07.in/user");
	  driver.findElement(By.id("edit-name")).sendKeys(Uname);
	  driver.findElement(By.id("edit-pass")).sendKeys(pwd);
	  driver.findElement(By.id("edit-submit")).click();
	  try
	  {
		  driver.findElement(By.linkText("Log out")).click();
		  System.out.println("pass");
	  }
	  catch(Exception e)
	  {
		  System.out.println("fail");
		  
	  }
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{"shiva","Hello@123"},
    	{"sury","invalid"}
    	
    };
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
		driver.manage().window().maximize();
	 
  }

}
