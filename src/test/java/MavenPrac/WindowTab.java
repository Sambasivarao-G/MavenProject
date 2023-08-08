package MavenPrac;

import org.testng.annotations.Test;

import java.util.*;


import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class WindowTab {
	WebDriver driver;
  @Test(enabled=false)
  public void tabTest() {
	 
	  driver.get("https://www.irctc.co.in/nget/train-search");
	  //driver.manage().window().fullscreen();
	  driver.findElement(By.xpath("/html/body/app-root/app-home/div[1]/app-header/div[2]/div[2]/div[2]/nav/ul/li[4]/a")).click();
	// driver.switchTo().newWindow(WindowType.TAB);
	
	  ArrayList<String> tab=new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tab.get(1));
  driver.findElement(By.xpath("/html/body/app-root/app-header/header/nav[1]/div/div[2]/div[2]/ul/li[2]/a")).click();
  driver.switchTo().window(tab.get(0));
  
  }
  @Test
  public void windowTest() {
		 
	  
	driver.get("https://www.google.com/");
	driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.google.com/gmail/about/");
    Set<String> w1=driver.getWindowHandles();
    Object s[]=w1.toArray();
    driver.switchTo().window(s[0].toString());
    
	 
  }
  
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  
	  }
  @AfterTest
  public void afterTest()
  {
	 //driver.quit();
  }

}
