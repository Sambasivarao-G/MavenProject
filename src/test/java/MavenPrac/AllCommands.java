package MavenPrac;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AllCommands {
	WebDriver driver;
  @Test
  public void f() {
	  driver.get("https://www.letskodeit.com/practice");
	  System.out.println(driver.getCurrentUrl());
	  System.out.println(driver.getTitle());
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  
  }

}
