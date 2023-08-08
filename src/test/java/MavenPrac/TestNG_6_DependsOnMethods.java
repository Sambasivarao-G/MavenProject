package MavenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_6_DependsOnMethods {
	WebDriver driver;
	
  @Test(dependsOnMethods="method2")
  public void method1() {
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/a[4]/div/span")).click();
	  
  }
  
  @Test
  public void method2() {
	  driver.get("https://www.google.com");
	  }
    
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}