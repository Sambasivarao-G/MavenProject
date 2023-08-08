package MavenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
public class TestNG_4_Description {
	WebDriver driver;
	
  @Test(description="Top Menus Module")
  public void RM_6() {
	  driver.findElement(By.xpath("//*[@class=\"home\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"projects\"]")).click();
	  driver.findElement(By.xpath("//*[@class=\"help\"]")).click();
  }
  
  @Test(description="Registration Module")
  public void RM_2() {
	  driver.findElement(By.xpath("//*[@class=\"register\"]")).click(); 
	  driver.findElement(By.xpath("//*[@id=\"user_login\"]")).sendKeys("techlearn");
  }
  
  @Test(description="Sing in Module")
  public void RM_9() {
	  driver.findElement(By.xpath("//*[@class=\"login\"]")).click(); 	  
  }
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.redmine.org/");
  }

}
