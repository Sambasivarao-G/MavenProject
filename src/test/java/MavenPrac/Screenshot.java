package MavenPrac;

import org.testng.annotations.Test;



import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Screenshot {
  
  WebDriver driver;
  @Test
  public void screenshots() throws IOException {
	  Date d=new Date();
	  DateFormat df=new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
	  String t=df.format(d);
	  System.out.println(t);
	  driver.get("https://www.google.com");
	  File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  //File f=(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div"))).getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(f,new File("C:\\Users\\DELLUSER\\Desktop\\google_"+t+".PNG"));
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	 driver.manage().window().maximize();
  } 

}
