package webapp.testing;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterTest;

public class NewTest {

		  @Test
		  public static void main()  {
			  
				// Instantiate a SafariDriver class. 
			  WebDriver driver = new SafariDriver(); 

			  // Launch Website 
			  driver.navigate().to("http://www.google.com/"); 
			 // driver.navigate().to("http://www.apple.com/"); 

			  // Click on the search text box and send value 
			   driver.findElement(By.className("gLFyf")).sendKeys("BrowserStack"); 

			  // Click on the search button 
			  driver.findElement(By.className("gNO89b")).click(); 

			  // Close the Browser 
			 // driver.close(); 

		  }
		  
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
