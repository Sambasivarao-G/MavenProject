package MavenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;
	
	@Test(priority=4)
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	@Test(priority=3)
	public void google() {		
		driver.get("https://www.google.com");
	}
	@Test(priority=0,enabled=false)
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test(priority=2)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test(enabled=true)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}	
	@Test(enabled=false,priority=5)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

}