package MavenPrac;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class JavascripExecutorDemo {
	WebDriver driver;
  @Test(enabled=false)
  public void drawBroderAndScreenshot() throws IOException {
	  WebElement element=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[2]/div[1]/a/img"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].style.border='3px solid red'", element);  
	  
	  //screenshot
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  File trg=new File(".\\Screenshots\\logo.PNG");
	  FileUtils.copyFile(src, trg);
	  
  }
  
  @Test
  public void clickJavascript() throws IOException {
	  WebElement element=driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
	  JavascriptExecutor js=(JavascriptExecutor)driver;
	  js.executeScript("arguments[0].click();", element);  
	  
	  //screenshot
	  TakesScreenshot ts=(TakesScreenshot)driver;
	  File src= ts.getScreenshotAs(OutputType.FILE);
	  File trg=new File(".\\Screenshots\\logo1.PNG");
	  FileUtils.copyFile(src, trg);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://demo.nopcommerce.com/");
  }

}
