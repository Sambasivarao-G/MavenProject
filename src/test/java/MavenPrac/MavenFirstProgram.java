package MavenPrac;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class MavenFirstProgram {
	WebDriver driver;
	Screen s=new Screen();
  @Test
  public void f() throws FindFailed {
	//  driver.get("https://www.google.com");
	  //s.click("C:\\Users\\DELLUSER\\Desktop\\Plus.PNG");
	  driver.get("https://youtu.be/g5WZLO8BAC8");
		s.click("C:\\Users\\DELLUSER\\Desktop\\Play.PNG");
		s.click("C:\\Users\\DELLUSER\\Desktop\\Maximize.PNG");
      	
  }
  @BeforeTest
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
  }

}
