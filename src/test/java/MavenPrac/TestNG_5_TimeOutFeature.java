package MavenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_5_TimeOutFeature {
	WebDriver driver;
	
  @Test(timeOut=4000)
  public void googleselenium() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/a[4]/div/span")).click();
	  
  }
  
  @Test
  public void googletirupati() {
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("Tirupati");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  driver.findElement(By.xpath("//*[@id=\"bqHHPb\"]/div/div/a[1]/div/span")).click();
	  
  }
    
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  
  }

}