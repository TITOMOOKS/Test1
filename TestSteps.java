package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestSteps {
	
	public static WebDriver driver;
	
@Given("^User is on Login Page$")
public void user_is_on_Login_Page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	// Create a new instance of the Chrome driver
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
//			WebDriver driver = new ChromeDriver();
	       driver = new ChromeDriver();

	        //Put a Implicit wait, this means that any search for elements on the page could take the time the implicit wait is set for before throwing exception

	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	       String baseUrl = "http://demo.guru99.com/test/login.html";					
	       driver.get(baseUrl);					

    throw new PendingException();
}

@When("^User finds the Submit Button$")
public void user_finds_the_Submit_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  // Find the submit button		
    WebElement login = driver.findElement(By.id("SubmitLogin"));							
  
    throw new PendingException();
}

@When("^User enters UserName and Password$")
public void user_enters_UserName_and_Password() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	  // Get the WebElement corresponding to the Email Address(TextField)		
    WebElement email = driver.findElement(By.id("email"));							

    // Get the WebElement corresponding to the Password Field		
    WebElement password = driver.findElement(By.name("passwd"));							

    email.sendKeys("abcd@gmail.com");					
    password.sendKeys("abcdefghlkjl");					

    throw new PendingException();
}

@When("^User clicks the Submit Button$")
public void user_clicks_the_Submit_Button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	 WebElement login = driver.findElement(By.id("SubmitLogin"));
	 login.click();	
    throw new PendingException();
}

@Then("^Message displayed Login Done with Click$")
public void message_displayed_Login_Done_with_Click() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login Done with Click");
    throw new PendingException();
}

@When("^User Submits Login$")
public void user_Submits_Login() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	//using submit method to submit the form. Submit used on password field		
    driver.get("http://demo.guru99.com/test/login.html");					
    driver.findElement(By.id("email")).sendKeys("abcd@gmail.com");							
    driver.findElement(By.name("passwd")).sendKeys("abcdefghlkjl");							
    driver.findElement(By.id("SubmitLogin")).submit();					
    			
    throw new PendingException();
}

@Then("^Message displayed Login Done with Submit$")
public void message_displayed_Login_Done_with_Submit() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.println("Login Done with Submit");
    throw new PendingException();
}

}
