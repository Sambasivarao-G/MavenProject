package MavenPrac;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class VerifyTabURLText {
	WebDriver driver;
	
  @Test(enabled=false)
  public void verifytabtitle() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  
	  String exptabtext = "Google";
	  
	  String acttabtext = driver.getTitle();
	  
	  Assert.assertEquals(acttabtext, exptabtext);
  }
  
  @Test(enabled=false)
  public void verifyurl() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	  
	  String e = "https://www.google.com";
	  
	  String a = driver.getCurrentUrl();
	  
	  Assert.assertEquals(a, e);
  }
  
  @Test
  public void verifytext() throws Exception {
	  driver.get("https://www.google.com/");
	  Thread.sleep(3000);
	 
	  String expgm = "Images";
	  
	  String actgm = driver.findElement(By.linkText("Gmail")).getText();
	  
	  Assert.assertEquals(actgm, expgm);
	  
	  
  }
  
  @Test
  public void verifyerrortext() throws Exception {
	  driver.get("https://www.techlearn.in/wp-login.php");
	  Thread.sleep(3000);
	 
	  String expgm = "Error: The username field is empty.";
	  
	  driver.findElement(By.xpath("//*[@id=\"wp-submit\"]")).click();
	  
	  String actgm = driver.findElement(By.xpath("//*[@id=\"login_error\"]")).getText();
	  
	  Assert.assertEquals(actgm, expgm);
	  
	  
  }
  
  
  
  
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
