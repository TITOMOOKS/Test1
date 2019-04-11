package cucumberTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumTest {
		private static WebDriver driver = null;
		
	public static void main(String[] args) {
		// Create a new instance of the Chrome driver
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
       driver = new ChromeDriver();

        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       String baseUrl = "http://demo.guru99.com/test/login.html";					
       driver.get(baseUrl);					

       // Get the WebElement corresponding to the Email Address(TextField)		
       WebElement email = driver.findElement(By.id("email"));							

       // Get the WebElement corresponding to the Password Field		
       WebElement password = driver.findElement(By.name("passwd"));							

       email.sendKeys("abcd@gmail.com");					
       password.sendKeys("abcdefghlkjl");					
       System.out.println("Text Field Set");					
        
       // Deleting values in the text box		
       email.clear();			
       password.clear();			
       System.out.println("Text Field Cleared");					

       // Find the submit button		
       WebElement login = driver.findElement(By.id("SubmitLogin"));							
                   		
       // Using click method to submit form		
       email.sendKeys("abcd@gmail.com");					
       password.sendKeys("abcdefghlkjl");					
       login.click();			
       System.out.println("Login Done with Click");					
       		
       //using submit method to submit the form. Submit used on password field		
       driver.get(baseUrl);					
       driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
       driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
       driver.findElement(By.id("SubmitLogin")).submit();					
       System.out.println("Login Done with Submit");					
        
		driver.close();		
       	         
  
        
        
        
        //Launch the Online Store Website

    //    driver.get("http://www.store.demoqa.com");

        // Find the element that's ID attribute is 'account'(My Account) 

    //    driver.findElement(By.xpath(".//*[@id='account']/a")).click();

        // Find the element that's ID attribute is 'log' (Username)

        // Enter Username on the element found by above desc.

   //     driver.findElement(By.id("log")).sendKeys("testuser_1"); 

        // Find the element that's ID attribute is 'pwd' (Password)

        // Enter Password on the element found by the above desc.

   //     driver.findElement(By.id("pwd")).sendKeys("Test@123");

        // Now submit the form. WebDriver will find the form for us from the element 

    //    driver.findElement(By.id("login")).click();

        // Print a Log In message to the screen

     //   System.out.println("Login Successfully");

        // Find the element that's ID attribute is 'account_logout' (Log Out)

  //      driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();

        // Print a Log In message to the screen

     //   System.out.println("LogOut Successfully");

        // Close the driver

 //       driver.quit();

	}

}