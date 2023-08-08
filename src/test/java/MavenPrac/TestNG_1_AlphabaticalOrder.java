package MavenPrac;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_1_AlphabaticalOrder {
	WebDriver driver;

	@Test
	public void twitter() {
		driver.get("https://www.twitter.com");
	}
	@Test
	public void google() {		
		driver.get("https://www.google.com");
	}
	@Test
	public void zomato() {
		driver.get("https://www.zomato.com");
	}
	@Test
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	@Test
	public void redmine() {
		driver.get("https://www.redmine.org");
	}	
	@Test
	public void gmail() {
		driver.get("https://www.gmail.org");
	}
	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}

}