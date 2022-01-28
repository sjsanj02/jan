package selenium1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() throws AWTException, InterruptedException {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  WebDriver w1;
	  w1=new ChromeDriver();
	  
	  w1.get("http://www.leafground.com/pages/download.html");

	  WebElement dw=w1.findElement(By.linkText("Download PDF"));
	  dw.click();
	  Thread.sleep(5000);


	  /*WebElement dn=w1.findElement(By.cssSelector("#download"));
	  dn.click();*/

	  //I Press download button manually

	  Robot r1=new Robot();
	  r1.keyPress(KeyEvent.VK_ENTER);
	  r1.keyRelease(KeyEvent.VK_ENTER);
  }
}
